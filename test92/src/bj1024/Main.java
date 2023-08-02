package bj1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] sArr = br.readLine().split(" ");

        int N = Integer.parseInt(sArr[0]);
        int L = Integer.parseInt(sArr[1]);
        boolean end = false;

        while(L <= 100) {
            int start = N / L - (L - 1) / 2;
            if(start < 0) break;

            if(((start * 2 + L - 1) * L / 2) == N) {
                for (int i = 0; i < L; i++) {
                    sb.append(start + i + " ");
                    end = true;
                }
                break;
            }
            L++;
        }

        if(!end) {
            System.out.println("-1");
            return;
        }

        System.out.println(sb.toString());
    }

}
