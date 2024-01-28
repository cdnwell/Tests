import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * bj. 1025
 * 제곱수 찾기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[][] numArr = new int[10][10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            String[] splitedStr = str.split("");
            for (int j = 1; j <= M; j++) {
                numArr[i][j] = Integer.parseInt(splitedStr[j - 1]);
            }
        }

        int ans = calMaxSquareNum(numArr, N, M);

        System.out.println(ans);
    }

    private static boolean isSquare(int num) {
        int root = (int) Math.sqrt(num);
        if(root * root == num) return true;
        return false;
    }

    private static int calMaxSquareNum(int[][] numArr, int N, int M) {
        String str = "";
        int answer = -1, i, j, x ,y;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= M; j++) {
                for (x = -N; x < N; x++) {
                    for (y = -M; y < M; y++) {
                        if (x == 0 && y == 0) continue;

                        // a = 행
                        // b = 열
                        int a = i, b = j, result;
                        str = "";
                        while (a > 0 && a <= N && b > 0 && b <= M) {
                            str += numArr[a][b];
                            result = Integer.parseInt(str);
                            if(isSquare(result)) answer = Math.max(answer, result);
                            a += x;
                            b += y;
                        }
                    }
                }
            }
        }
        return answer;
    }
}