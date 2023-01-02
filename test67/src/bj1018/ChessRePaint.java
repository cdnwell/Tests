package bj1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessRePaint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);
        String[][] chess = new String[N][M];

        // 1. 값 입력 받기
        for (int i = 0; i < N; i++) {
            String[] lineArr = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                chess[i][j] = lineArr[j];
            }
        }

//        System.out.println("---입력 받은 배열 표시하기---");

        // 2. 입력 받은 값 배열로 표시하기
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(chess[i][j]);
//            }
//            System.out.println();
//        }

        // 3.0 바꿔야할 체스 개수를 저장할 두 개의 count 배열
        // 1번째
        // 처음 체스 말이 W일 경우
        // 2번째
        // 처음 체스 말이 B일 경우
        int [] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        String compare = "W";   // 비교할 문자 -> W를 기준
        int result = 2501;

        // 3.1 열이 짝수일 경우 다음 행은 이전 행의 맨 마지막 체스와 같다.
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


//        for (int i = 0; i < 8; i++) {
//            if (i % 2 == 1) compare = "B";
//            else compare = "W";
//            for (int j = 0; j < 8; j++) {
//                if (j % 2 == 0) {
//                    if(!chess[i][j].equals(compare)) count[0]++;
//                } else {
//                    if(chess[i][j].equals(compare)) count[0]++;
//                }
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            if (i % 2 == 1) compare = "B";
//            else compare = "W";
//            for (int j = 0; j < M; j++) {
//                if (j % 2 == 0){
//                    if(chess[i][j].equals(compare)) count[1]++;
//                } else {
//                    if(!chess[i][j].equals(compare)) count[1]++;
//                }
//            }
//        }

        // 4. 최소값 출력하기
        System.out.println(result);

    }// main 메서드 끝
    
}
