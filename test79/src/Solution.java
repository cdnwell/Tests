import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println("당구 연습 알고리즘입니다.");
        int[][] balls = {{7,7}, {2,7}, {7,3} };
        int[]result = solution(10,10,3,7, balls);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {

        // 벽에 가까운 거리
        int nearM = startX;
        int nearN = startY;

        if( m - startX < startX)
        {
            nearM = m - startX;
        }
        if( n - startY < startY)
        {
            nearN = n - startY;
        }


        int length = balls.length;
        int[] answer = new int[length];
        for(int i=0;i<length;i++)
        {
            int width = (startX + balls[i][0]) * (startX + balls[i][0]);   // x 축 0 인 벽에 튕길 때 거리
            int height = (startY + balls[i][1]) * (startY + balls[i][1]);  // y 축 0 인 벽에 튕길 때 거리

            int width_m = ((m + m) - (startX + balls[i][0])) * ((m + m) - (startX + balls[i][0])); // x 축 m 인 벽에 튕길 때 거리
            int height_n = ((n + n) - (startY + balls[i][1])) * ((n + n) - (startY + balls[i][1])); // y 축 n 인 벽에 튕길 때 거리

            int width_sub = (startX - balls[i][0]) * (startX - balls[i][0]);  // x 축 공과 공 사이 거리
            int height_sub = (startY - balls[i][1]) * (startY - balls[i][1]);  // y 축 광고 공 사이 거리

            {
                if(width > width_m)
                {
                    width = width_m;
                }
                if(height > height_n)
                {
                    height = height_n;
                }
                width = width + height_sub;
                height = height + width_sub;
                if(width > height)
                {
                    answer[i] = height;
                } else
                {
                    answer[i] = width;
                }
            }

            if(startX == balls[i][0])
            {
                answer[i] = (nearM*2) * (nearM*2) +height_sub;
            }

            if(startY == balls[i][1])
            {
                answer[i] = (nearN*2) * (nearN*2) + width_sub;
            }

        }

        return answer;
    }

}
