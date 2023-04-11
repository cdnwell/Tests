package pg155651;

import java.util.Arrays;

public class Solution {

    public int solution(String[][] book_time) {
        int answer = 0;

        Arrays.sort(book_time, (o1, o2) -> o1[0].compareTo(o2[0]));

        int[][] book_time_int = convertBookTimeToInt(book_time);

        int[] end_time = calculateEndTime(book_time_int);

        for (int i = 0; i < end_time.length; i++) {
            if(end_time[i] != 0) {
                answer++;
            }
        }

        return answer;
    }

    public int[][] convertBookTimeToInt(String[][] book_time) {
        int[][] book_time_int = new int[book_time.length][2];

        for (int i = 0; i < book_time.length; i++) {
            book_time_int[i][0] = Integer.parseInt(book_time[i][0].replace(":", ""));
            book_time_int[i][1] = Integer.parseInt(book_time[i][1].replace(":", ""));

            book_time_int[i][1] += 10;
            if(book_time_int[i][1] % 100 >= 60) {
                book_time_int[i][1] += 40;
            }
        }

        return book_time_int;
    }

    public int[] calculateEndTime(int[][] book_time) {
        int[] end_time = new int[book_time.length];

        for (int i = 0; i < book_time.length; i++) {
            for (int j = 0; j < end_time.length; j++) {
                if(end_time[j] <= book_time[i][0]) {
                    end_time[j] = book_time[i][1];
                    break;
                }
            }
        }

        return end_time;
    }

}
