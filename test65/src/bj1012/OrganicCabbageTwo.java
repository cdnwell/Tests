package bj1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class OrganicCabbageTwo {

    private static int[][] cabbages;

    public static int bfs(int m, int n){
        int result = 0;
        Queue<String> q = new LinkedList<>();

        while(true) {
            int i = 0, j = 0;
            boolean flag = false;

            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if (cabbages[i][j] == -1) break;
                    if (cabbages[i][j] == 1) {
                        flag = true;
                        break;
                    }
                }
                if (j != n && cabbages[i][j] == 1) break;
            }

            if(!flag) break;

            String assemble = i + " " + j;
            q.add(assemble);

            while (!q.isEmpty()) {
                String front = q.peek();
                q.poll();
                String[] tmp = front.split(" ");
                int x = Integer.parseInt(tmp[0]);
                int y = Integer.parseInt(tmp[1]);

                cabbages[x][y] = 0;   // 방문처리를 0으로 해준다.

                // 3. 십자 모양으로 배추가(1) 있는지 탐색한다.
                if (x - 1 >= 0) {
                    if (cabbages[x - 1][y] == 1) {
                        q.add((x - 1) + " " + y);
                        cabbages[x - 1][y] = 0;
                    }
                }

                if (x + 1 < m) {
                    if (cabbages[x + 1][y] == 1) {
                        q.add((x + 1) + " " + y);
                        cabbages[x + 1][y] = 0;
                    }
                }

                if (y - 1 >= 0) {
                    if (cabbages[x][y - 1] == 1) {
                        q.add(x + " " + (y - 1));
                        cabbages[x][y - 1] = 0;
                    }
                }

                if (y + 1 < n) {
                    if (cabbages[x][y + 1] == 1) {
                        q.add(x + " " + (y + 1));
                        cabbages[x][y + 1] = 0;
                    }
                }

            }// bfs 탐색 완료

            // result에 값 추가 (지렁이 개수)
            result += 1;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        /*
            0 : 배추가 없다.
            1 : 배추가 있다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer buffer = new StringBuffer();
        int answer = 0;

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int K = Integer.parseInt(str[2]);

            cabbages = new int[M][N];

            for (int j = 0; j < K; j++) {
                String[] tmp = br.readLine().split(" ");
                int m = Integer.parseInt(tmp[0]);
                int n = Integer.parseInt(tmp[1]);
                cabbages[m][n] = 1;
            }

            buffer.append(bfs(M,N)+"\n");

        }

        System.out.println(buffer.toString());
    }

}
