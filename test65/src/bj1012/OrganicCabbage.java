package bj1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class OrganicCabbage {
    /*
        -1 : 아무런 설정이 안된 상태
         0 : 배추가 없는 상태
         1 : 배추가 있는 상태
     */
    private static int[][] cabages;

    public static void bfs(int T, int[][][] arr , int[] answer){
        Queue<String> q = new LinkedList<>();

        for (int m = 0; m < T; m++) {

            while(true) {

                int i = 0, j = 0;
                boolean flag = false;

                for (i = 0; i < 50; i++) {
                    for (j = 0; j < 50; j++) {
                        if (arr[m][i][j] == -1) break;
                        int x = arr[m][i][j];
                        if (arr[m][i][j] == 1) {
                            flag = true;
                            break;
                        }
                    }
                    if (arr[m][i][j] == 1) break;
                }

                if (!flag) break;

                // 1. 첫 번째 배추 위치를 설정하고 queue에 넣는다.
                //i -= 1; // 배추의 x 값
                //j -= 1; // 배추의 y 값

                // 2. 배추 x, y 좌표를 조합해서 queue에 넣는다.
                String assemble = i + " " + j;
                q.add(assemble);

                while (!q.isEmpty()) {
                    String front = q.peek();
                    q.poll();
                    String[] tmp = front.split(" ");
                    int x = Integer.parseInt(tmp[0]);
                    int y = Integer.parseInt(tmp[1]);

                    arr[m][x][y] = 0;   // 방문처리를 0으로 해준다.

                    // 3. 십자 모양으로 배추가(1) 있는지 탐색한다.

                    if (x - 1 > 0) {
                        if (arr[m][x - 1][y] == 1) q.add((x - 1) + " " + y);
                    }

                    if (x + 1 < 50) {
                        if (arr[m][x + 1][y] == 1) q.add((x + 1) + " " + y);
                    }

                    if (y - 1 > 0) {
                        if (arr[m][x][y - 1] == 1) q.add(x + " " + (y - 1));
                    }

                    if (y + 1 < 50) {
                        if (arr[m][x][y + 1] == 1) q.add(x + " " + (y + 1));
                    }

                }// bfs 탐색 완료

                // 지렁이 수를 추가해주고 while문을 마무리한다.
                answer[m] += 1;
            }
        }

    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][][] sites  = new int[T][51][51];
        int [] answer = new int[T];

        // 1. 아무런 설정이 안된 상태로 모든 배열을 초기화 한다.
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 51; j++) {
                for (int k = 0; k < 51; k++) {
                    sites[i][j][k] = -1;
                }
            }
        }

        // 1.1. 답 또한 0으로 초기화 해준다.
        for (int i = 0; i < T; i++) {
            answer[i] = 0;
        }

        // 2. 초기 설정값으로 배열을 설정하고 배추를 심는다.
        for (int i=0;i<T;i++){
            String[] str = br.readLine().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int K = Integer.parseInt(str[2]);

            // 2.1. M * N 만큼의 배열에 배추가 없는 상태로 초기화 한다.
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    sites[i][j][k] = 0;
                }
            }

            // 2.2. 배열에 배추가 심어져 있는 상태로 초기화한다.
            for (int j = 0; j < K; j++) {
                String[] tmp = br.readLine().split(" ");
                int m = Integer.parseInt(tmp[0]);
                int n = Integer.parseInt(tmp[1]);
                sites[i][m][n] = 1;
            }
        }

        // 3. 배추가 심어진 영역 표시 테스트를 한다.
//        for (int i = 0; i < T; i++) {
//            for (int j = 0; j < 51; j++) {
//                for (int k = 0; k < 51; k++) {
//                    if(sites[i][j][k] != -1) System.out.print(sites[i][j][k]);
//                }
//                if(sites[i][j][0] != -1) System.out.println();
//            }
//            System.out.println();
//        }

        // 4. 이어진 배추 영역 탐색
        bfs(T,sites,answer);

        // 5. 답변 출력
        for (int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }

    }

}
