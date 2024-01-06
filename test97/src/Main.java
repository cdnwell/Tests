import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX = Integer.MAX_VALUE / 2;
        int N = Integer.parseInt(br.readLine());

        // 사람수 N은 50보다 작다. 0부터 인덱스가 시작하므로 51까지 생성
        int [][] isFriend = new int[N + 1][N + 1];

        // 1. 2차원 배열에 친구인지 아닌지 구하기
        for (int i = 1; i <= N; i++) {
            String friendStr = br.readLine();
            for (int j = 1; j <= N; j++) {
                // Y와 같다면 -> true
                // Y와 다르다면(N이라면) -> false
                isFriend[i][j] = friendStr.charAt(j - 1) == 'Y' ? 1 : MAX;
            }
        }

        // ** 2. 배열을 기반으로 0번부터 친구의 수가 얼마나 되는지 모두 계산하기
        // Floyd Warshall Algorithm
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == j || i == k || j == k)
                        continue;
                    if(isFriend[i][j] > isFriend[i][k] + isFriend[k][j])
                        isFriend[i][j] = isFriend[i][k] + isFriend[k][j];
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int twoFriend = 0;
            for (int j = 1; j <= N; j++) {
                if(i==j)
                    continue;

                // 2-친구인 경우
                if(isFriend[i][j] <= 2)
                    twoFriend++;
            }
            answer = Math.max(answer, twoFriend);
        }

        System.out.println(answer);
    }
}