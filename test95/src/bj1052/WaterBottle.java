package bj1052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WaterBottle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int pls = 0;
        while(true) {
            int count = 0;
            int tmp = N + pls;

            while(tmp > 0) {
                if(tmp % 2 != 0) count++;
                tmp /= 2;
            }

            if (count <= K) break;

            pls++;
        }

        System.out.println(pls);
    }

}
