package programmers;

import java.util.Arrays;

public class ArcheryScore {
    static int[] res= {-1};
    static int[] lion;
    static int max = -1;
    static void dfs(int[] info, int cnt, int n){
        if(cnt == n+1) {
            int apeach_point = 0;
            int lion_point = 0;
            System.out.println("cnt : "+cnt);
            for(int i = 0; i <= 10; i++)
            {
                if(info[i] != 0 || lion[i] != 0) {
                    if(info[i] < lion[i])
                        lion_point += 10 - i;
                    else
                        apeach_point += 10 - i;
                }
            }
            if(lion_point > apeach_point) {
                if(lion_point - apeach_point >= max)
                {
                    res = lion.clone();
                    max = lion_point - apeach_point;
//                    System.out.println("result cnt : "+cnt);
//                    System.out.println("max : "+max);
//                    System.out.println(Arrays.toString(lion));
                }
            }
            return ;
        }
        for(int j = 0; j <= 10 && lion[j] <= info[j]; j++) {
            lion[j]++;
//            System.out.println("--- before dfs ---");
//            System.out.println("cnt : " + cnt);
//            System.out.println("lion++ , lion["+j+"] : " + lion[j]);
            dfs(info, cnt + 1, n);
            lion[j]--;
//            System.out.println("lion-- , lion["+j+"] : " + lion[j]);
//            System.out.println("cnt : " + cnt);
//            System.out.println("--- end dfs ---");
        }
    }

    public static void main(String[] args){
        //5	[2,1,1,1,0,0,0,0,0,0,0]
        //	[0,2,2,0,1,0,0,0,0,0,0]
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        lion = new int[11];
        int n = 5;

        dfs(info,1,n);

    }
}
