package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess1018 {

    private static boolean[][] arr;
    private static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0;i<N;i++){
            String str = br.readLine();
            for(int j = 0;j<M;j++){
                // W(하얀색)일 경우 true
                if(str.charAt(j)=='W')
                    arr[i][j]=true;
                else
                    arr[i][j]=false;
            }
        }

        int x = N - 7;
        int y = M - 7;

        for(int i = 0;i<x;i++){
            for(int j=0;j<y;j++){
                find(i,j);
            }
        }

        System.out.println(min);
    }

    static void find(int x, int y){
        boolean start = arr[x][y];
        int count = 0;

        for (int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                if(arr[i][j]!=start)
                    count++;
                start = !start;
            }
            start = !start;
        }

        count = Math.min(count,64-count);

        min = Math.min(count,min);
    }
}
