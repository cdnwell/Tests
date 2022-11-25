package bj2839;

import java.util.Scanner;

public class SugerDelivery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int fiveShare = N / 5;
        int remainder = 0;
        int i = fiveShare, j = 0;
        int result = 0;

        for(i=fiveShare;i>=0;i--){
            remainder = N - (5 * i);
            remainder = remainder / 3;
            for(j=0;j<=remainder;j++){
                if((5 * i) + (3 * j) == N) break;
            }
            if((5 * i) + (3 * j) == N) break;
            if(i==0 && j==remainder+1) result = -1;
        }

        if(result != -1) result = i+j;

        System.out.println(result);

    }
}
