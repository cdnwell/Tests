package bj11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNTiling {
    public static int[] d = new int[1001];

    public static int dp(int x){
        if(x == 1) return 1;
        if(x == 2) return 2;
        if(d[x] != 0) return d[x];
        return d[x] = (dp(x - 1) + dp(x - 2)) % 10007;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(dp(x));
    }
}
