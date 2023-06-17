import java.io.*;

public class Main {

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
        System.out.print(sb.toString());
    }

    public static boolean regexCheck(String testCase, String regex) {
        if(testCase.matches(regex)) return true;
        return false;
    }

}