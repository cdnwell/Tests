package bj1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[][] numStore = new int[45][2];

    private static int finbonacci(int n){
        numStore[0][0] = 1;
        numStore[1][1] = 1;
        numStore[2][0] = 1;
        numStore[2][1] = 1;

        if(numStore[n-1][0] != 0 || numStore[n-1][1] != 0){
            numStore[n][0] = numStore[n-1][0] + numStore[n-2][0];
            numStore[n][1] = numStore[n-1][1] + numStore[n-2][1];
            return 0;
        } else {
            return finbonacci(n-1) + finbonacci(n-2);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        for(int i=0;i<T;i++){
            arr[i] = Integer.parseInt(br.readLine()) + 2;
        }

        for (int i=0;i<arr.length;i++){
            int N = arr[i];
            finbonacci(N);
            if(N == 2){
                System.out.println("1 0");
            }else if(N == 3){
                System.out.println("0 1");
            }else if(N == 4){
                System.out.println("1 1");
            }else{
                System.out.println(numStore[N-2][0]+" "+numStore[N-2][1]);
            }
        }
    }
}
