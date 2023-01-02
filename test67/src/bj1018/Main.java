package bj1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);
        String[][] chess = new String[N][M];

        for (int i = 0; i < N; i++) {
            String[] lineArr = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                chess[i][j] = lineArr[j];
            }
        }

        int [] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        String compare = "W";
        int result = 2501;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                count[0] = count[1] = 0;

                for (int k = i; k < 8 + i; k++) {
                    if (k % 2 == 1) compare = "B";
                    else compare = "W";
                    for (int l = j; l < 8 + j; l++) {
                        if (l % 2 == 0){
                            if(!chess[k][l].equals(compare)) count[0]++;
                        } else  {
                            if(chess[k][l].equals(compare)) count[0]++;
                        }
                    }
                }

                for (int k = i; k < 8 + i; k++) {
                    if (k % 2 == 1) compare = "B";
                    else compare = "W";
                    for (int l = j; l < 8 + j; l++) {
                        if (l % 2 == 0){
                            if(chess[k][l].equals(compare)) count[1]++;
                        } else  {
                            if(!chess[k][l].equals(compare)) count[1]++;
                        }
                    }
                }

                if (count[0] > count[1]){
                    if (count[1] < result)
                        result = count[1];
                } else {
                    if (count[0] < result)
                        result = count[0];
                }

            }
        }

        System.out.println(result);

    }
}
