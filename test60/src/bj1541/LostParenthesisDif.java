package bj1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostParenthesisDif {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String content = br.readLine();
        String[] arr = content.split("[-]");
        int result = 0;

        if(arr.length == 1){
            String[] str = content.split("[+]");
            for(String s1 : str){
                result += Integer.parseInt(s1);
            }
        } else {
            result = Integer.parseInt(arr[0])*2;
            for(String s1 : arr){
                String[] str = s1.split("[+]");

                for(String s2 : str)
                    result -= Integer.parseInt(s2);
            }
        }
        System.out.println(result);
    }
}
