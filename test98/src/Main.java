import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int gap = y - x;
            double sqrt = Math.sqrt(gap);
            int tmpSqrt = (int) sqrt;
            int dblSqrt = (tmpSqrt + 1) * (tmpSqrt + 1) - (tmpSqrt) * (tmpSqrt) - 1;

            if (sqrt - tmpSqrt == 0) {
                answer.append(((int)sqrt) * 2 - 1 + "\n");
            } else if ((tmpSqrt * tmpSqrt) < gap && gap <= (tmpSqrt * tmpSqrt) + (dblSqrt / 2)) {
                answer.append(((int)sqrt) * 2 + "\n");
            } else {
                answer.append(((int)sqrt) * 2 + 1 + "\n");
            }
        }

        System.out.println(answer.toString());
    }
}