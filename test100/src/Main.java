import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[10];
        String num;

        for (int i = 0, ii = result.length; i < ii; i++) {
            result[i] = 0;
        }

        for (int i = 1; i <= N; i++) {
            num = String.valueOf(i);
            char[] parsedNum = num.toCharArray();
            for (int j = 0; j < parsedNum.length; j++) {
                result[Integer.parseInt(parsedNum[j] + "")]++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}