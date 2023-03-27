import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println("당구 연습 알고리즘입니다.");
        int[][] balls = {{7,7}, {2,7}, {7,3} };
        int[]result = solution(10,10,3,7, balls);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];

        for (int i = 0; i < balls.length; i++) {
            int result = 100000000;
            int heightS, heightB, height;
            int widthS, widthB, width;
            int resultTmp;

            if (startX != balls[i][0] || startY > balls[i][1]) {
                heightS = n - startY;
                heightB = n - balls[i][1];
                height = heightS + heightB;

                width = startX - balls[i][0];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            if (startY != balls[i][1] || startX > balls[i][0]) {
                widthS = m - startX;
                widthB = m - balls[i][0];
                width = widthS + widthB;

                height = startY - balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            if (startX != balls[i][0] || startY < balls[i][1]) {
                height = startY + balls[i][1];

                width = startX - balls[i][0];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            if (startY != balls[i][1] || startX < balls[i][0]) {
                width = startX + balls[i][0];

                height = startY - balls[i][1];

                resultTmp = height * height + width * width;
                result = Math.min(result , resultTmp);
            }

            answer[i] = result;
        }

        return answer;
    }

}
