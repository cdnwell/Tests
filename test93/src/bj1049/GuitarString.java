package bj1049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuitarString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = br.readLine().split(" ");
        int N = Integer.parseInt(nAndM[0]);
        int M = Integer.parseInt(nAndM[1]);

        int packValue = Integer.MAX_VALUE;
        int eaValue = Integer.MAX_VALUE;

        String[] packAndEa = br.readLine().split(" ");

        packValue = Integer.parseInt(packAndEa[0]);
        eaValue = Integer.parseInt(packAndEa[1]);

        for (int i = 1; i < M; i++) {
            packAndEa = br.readLine().split(" ");
            int packValueTmp = Integer.parseInt(packAndEa[0]);
            int eaValueTmp = Integer.parseInt(packAndEa[1]);

            packValue = Math.min(packValueTmp, packValue);
            eaValue = Math.min(eaValueTmp, eaValue);
        }

        // --- 패키지 기타줄 가격 중 최소 값과, 개별 기타줄 가격 중 최소 값이 나옴. --- //

        // 패키지로만 모두 구매한 경우
        int allPackBuy = N % 6 == 0 ? (N / 6) * packValue : (N / 6 + 1) * packValue;
        // 패키지와 낱개를 섞어서 구매한 경우
        int eaPackBuy = N % 6 == 0 ? (N / 6) * packValue : (N / 6) * packValue + (N % 6) * eaValue;

        int result = Math.min(allPackBuy, eaPackBuy);

        System.out.println(result);
    }

}
