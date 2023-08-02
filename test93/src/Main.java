import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = br.readLine().split(" ");
        int N = Integer.parseInt(nAndM[0]);
        int M = Integer.parseInt(nAndM[1]);

        int[] packValue = new int[M];
        int[] eaValue = new int[M];

        for (int i = 0; i < M; i++) {
            String[] packAndEa = br.readLine().split(" ");
            packValue[i] = Integer.parseInt(packAndEa[0]);
            eaValue[i] = Integer.parseInt(packAndEa[1]);
        }

        Arrays.sort(packValue);
        Arrays.sort(eaValue);

        // --- 패키지 기타줄 가격 중 최소 값과, 개별 기타줄 가격 중 최소 값이 나옴. --- //

        // 패키지로만 모두 구매한 경우
        int allPackBuy = N % 6 == 0 ? (N / 6) * packValue[0] : ((N / 6) + 1) * packValue[0] ;
        // 패키지와 낱개를 섞어서 구매한 경우
        int eaPackBuy = Math.min(N * eaValue[0], (N % 6) * eaValue[0] + (N / 6) * packValue[0]);

        int result = Math.min(allPackBuy, eaPackBuy);

        System.out.println(result);
    }

}