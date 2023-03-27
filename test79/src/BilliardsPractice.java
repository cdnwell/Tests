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
            // m = 가로 길이, n = 세로 길이

            int result = 2000000;
            int heightS, heightB, height;
            int widthS, widthB, width;
            int resultTmp;

            // 4방향 벽 거리 계산
            // 1. 위쪽 벽
            // 1.1 시작 공과, 목표 공의 x값이 같을 경우, 위쪽 벽에 쿠션이 불가능하다.
            if (startX != balls[i][0] || startY > balls[i][1]) {
                heightS = n - startY;
                heightB = n - balls[i][1];
                height = heightS + heightB;

                width = startX - balls[i][0];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 2. 오른쪽 벽
            // 2.1 시작 공과, 목표 공의 y값이 같을 경우, 오른쪽 벽에 쿠션이 불가능하다.
            if (startY != balls[i][1] || startX > balls[i][0]) {
                widthS = m - startX;
                widthB = m - balls[i][0];
                width = widthS + widthB;

                height = startY - balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 3. 아래쪽 벽
            // 3.1 시작 공과, 목표 공의 x값이 같을 경우, 아래쪽 벽에 쿠션이 불가능하다.
            if (startX != balls[i][0] || startY < balls[i][1]) {
                height = startY + balls[i][1];

                width = startX - balls[i][0];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 4. 왼쪽 벽
            // 4.1 시작 공과, 목표 공의 y 값이 같을 경우, 왼쪽 벽에 쿠션이 불가능하다.
            if (startY != balls[i][1] || startX < balls[i][0]) {
                width = startX + balls[i][0];

                height = startY - balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 5. (0,0) 원점
            // 5.1 시작 공의 x값이 목표 공의 x값 보다 작아야 한다.
            // 5.2 시작 공의 y값이 목표 공의 y값 보다 작아야 한다.
            // 5.3 (0,0)과 (m,n)의 기울기와 시작 공과 목표 공의 기울기가 같은지 비교
            if (startX < balls[i][0] && startY < balls[i][1] && n * (balls[i][0] - startX) == m * (balls[i][1] - startY) ) {
                width = startX + balls[i][0];
                height = startY + balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 6. (m, 0)
            // 6.1 시작 공의 x값이 목표 공의 x값 보다 크다.
            // 6.2 시작 공의 y값이 목표 공의 y값 보다 작다.
            // 6.3 (n,0)과 (m,0)의 기울기와 시작 공과 목표 공의 기울기가 같은지 비교
            if (startX > balls[i][0] && startY < balls[i][1] && m*(startY - balls[i][1]) == -n * (startX - balls[i][0])) {
                width = 2*m - startX - balls[i][0];
                height =  startY + balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 7. (0, n)
            // 7.1 시작 공의 x값이 목표 공의 x값 보다 작다.
            // 7.2 시작 공의 y값이 목표 공의 y값 보다 크다.
            // 7.3 (n,0)과 (m,0)의 기울기와 시작 공과 목표 공의 기울기가 같은지 비교
            if (startX < balls[i][0] && startY > balls[i][1] && -n * (balls[i][0] - startX) ==  m * (balls[i][1]-startY)) {
                width = startX + balls[i][0];
                height = 2* n - startY - balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            // 8. (m, n)
            // 8.1 시작 공의 x값이 목표 공의 x값 보다 작다.
            // 8.2 시작 공의 y값이 목표 공의 y값 보다 작다.
            // 8.3 (0,0)과 (m,n)의 기울기와 시작 공과 목표 공의 기울기가 같은지 비교
            if (startX < balls[i][0] && startY < balls[i][1] && m * (balls[i][1] - startY) == n * (balls[i][0] - startX)) {
                width = 2* m - balls[i][0] - startX;
                height = 2 * n - balls[i][1] - startY;

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            answer[i] = result;
        }

        return answer;
    }
}
