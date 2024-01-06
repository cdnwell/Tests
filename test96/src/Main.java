import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N = 참가자 수
        int N = Integer.parseInt(st.nextToken());
        // K = 김지민의 번호
        int K = Integer.parseInt(st.nextToken());
        // I = 임한수의 번호
        int I = Integer.parseInt(st.nextToken());

        // 출력할 라운드 번호
        int round = 0;

        // 1번부터 차례대로 한 쌍씩 맺어준다.
        while(I != K) {
            // 1. 김지민(K)과 임한수(I)의 번호만 계산해주면 된다.
            // 2. 김지민과 임한수가 한쌍일 경우의 라운드를 반환하면된다.
            // c * i(i는 0부터 시작한다.) 와 c * i + 1 일 경우 한 쌍에 있는 것이다.

            // 라운드 수를 늘려준다.
            round++;
            // I, K를 반으로 줄여준다.
            if(I % 2 != 0) {
                I = I / 2 + 1;
            } else {
                I /= 2;
            }

            if(K % 2 != 0) {
                K = K / 2 + 1;
            } else {
                K /= 2;
            }
        }
        // 서로 무조건 이기므로 만나지 않을 경우의 수는 N 이 1일경우 while 문을 나올 때 -1을 출력
        System.out.println(round);

    }

}