package bj2133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NtileProblem {
    private static int [] d = new int[1001];

    private static int dp(int x) {
        if( x == 0 ) return 1;
        if( x == 1 ) return 0;
        if( x == 2 ) return 3;
        if( d[x] != 0 ) return d[x];
        int result = 3 * dp(x-2);
        for(int i = 3; i<=x;i++){
            if(i%2==0){
                result += 2 * dp(x-i);   // 짝수 일때 2씩 곱해서 더해줌
                // 점화식을 그대로 적용시켜 준것
            }
        }
        return d[x] = result;
     }

    public static void main(String[] args) throws IOException {
        // 길이가 4인 경우 쪼갤 수 없는 경우의 수 2가지가 생김
        // 4개일 때만 존재하는 것이 아니라 6개 일 때에도 2가지 경우가 더 존재함.
        // 짝수개 일때 2가지씩 더 존재함.
        // 점화식
        // D[n] = D[n-2] * 3 + ( 2 * D[n-4] + 2 * D[n-6] + ... + 2 * D[0] )
        // 이것을 고려해야 정상적으로 풀이가 가능하다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(dp(x));

    }
}
