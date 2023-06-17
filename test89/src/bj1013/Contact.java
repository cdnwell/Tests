package bj1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contact {

    public static void main(String[] args) throws IOException {
        String regex = "(100+1+|01)+";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int ea = Integer.parseInt(br.readLine());
        for (int i = 0; i < ea; i++) {
            String testCase = br.readLine();
            boolean result = regexCheck(testCase, regex);
            if(result)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb.toString());
    }

    public static boolean regexCheck(String testCase, String regex) {
        String[] dividedCase = testCase.split(regex);

        for(String s : dividedCase) {
            String[] dividedS = s.split(regex);
            if(dividedS.length != 0) return false;
        }

        return true;
    }

}
