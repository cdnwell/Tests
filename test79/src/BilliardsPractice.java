import java.util.ArrayList;
import java.util.Arrays;

public class BilliardsPractice {
    public static void main(String[] args) {

        System.out.println("당구 연습 알고리즘입니다.");
        int[][] balls = {{7,7}, {2,7}, {7,3} };
        int[]result = solution(10,10,3,7, balls);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];

        for (int i = 0; i < balls.length; i++) {
            // *a = x 축의 중점, b = y 축의 중점
            // 1. 왼쪽 벽 x = 0, y = b
            // 2. 위쪽 벽 x = a, y = n(세로 길이)
            // 3. 오른쪽 벽 x = m(가로 길이), y = b
            // 4. 아래 벽 x = a, y = 0

            double centerX = balls[i][0] + startX;
            centerX = centerX/2;
            double centerY = balls[i][1] + startY;
            centerY = centerY/2;

            double[][] blocks = { {0, centerY}, {centerX, n}, {m, centerY}, {centerX, 0} };

            int result = 2000000;

            // 4방향 벽 거리 계산
            for (int j = 0; j < 4; j++) {
                double leftBlockStartPow = Math.pow(startX - blocks[j][0], 2) + Math.pow(startY - blocks[j][1], 2);
                double leftBlockStartSqrt = Math.sqrt(leftBlockStartPow);
                double leftBlockBallPow = Math.pow(balls[i][0] - blocks[j][0], 2) + Math.pow(balls[i][1] - blocks[j][1], 2);
                double leftBlockBallSqrt = Math.sqrt(leftBlockBallPow);
                double sum = leftBlockStartSqrt + leftBlockBallSqrt;
                int resultTmp = (int)Math.pow(sum,2);
                result = Math.min(result, resultTmp);
            }

            answer[i] = result;
        }

        return answer;
    }
}
