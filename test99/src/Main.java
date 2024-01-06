import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1016번.
 * 제곱 ㄴㄴ 수
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        int sqrt = (int) Math.sqrt(max);
        int idx = (int) (max - min) + 1;

        boolean[] checked = new boolean[idx];

        for (long i = 2; i <= sqrt; i++) {
            long squared = i * i;
            long start = min % squared == 0 ? min / squared : min / squared + 1;
            for (long j = start; j * squared <= max; j++) {
                checked[ (int) ((j * squared) - min) ] = true;
            }
        }

        int count = 0;
        for (int i = 0, ii = checked.length; i < ii; i++) {
            if(!checked[i])
                count++;
        }
        System.out.println(count);
    }
}