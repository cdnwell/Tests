package pg155651;

import java.util.Arrays;

public class RentHotel {

    public static void main(String[] args) {
        String[][] book_time = {
                {"09:10", "10:10"}, {"10:20", "12:20"}};

        solution(book_time);
    }

    public static int solution(String[][] book_time) {
        int answer = 0;

        // 1. 출발 시간 순으로 정렬
        Arrays.sort(book_time, (o1, o2) -> o1[0].compareTo(o2[0]));

        // 2. book_time 배열의 시간을 int형으로 변환
        int[][] book_time_int = convertBookTimeToInt(book_time);

        System.out.println(Arrays.deepToString(book_time_int));

        // 3. end_time 계산
        int[] end_time = calculateEndTime(book_time_int);

        // 4. end_time 배열의 0이 아닌 값의 개수를 구함
        for (int i = 0; i < end_time.length; i++) {
            if(end_time[i] != 0) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);

        return answer;
    }

    public static int[][] convertBookTimeToInt(String[][] book_time) {
        int[][] book_time_int = new int[book_time.length][2];

        for (int i = 0; i < book_time.length; i++) {
            book_time_int[i][0] = Integer.parseInt(book_time[i][0].replace(":", ""));
            book_time_int[i][1] = Integer.parseInt(book_time[i][1].replace(":", ""));
        }

        return book_time_int;
    }

    public static int[] calculateEndTime(int[][] book_time) {
        int[] end_time = new int[book_time.length];

        for (int i = 0; i < book_time.length; i++) {
            for (int j = 0; j < end_time.length; j++) {
                if(end_time[j] <= book_time[i][0]) {
                    end_time[j] = book_time[i][1] + 10;
                    break;
                }
            }
            for (int j = 1; j < end_time.length; j++) {
                for (int k = 0; k < end_time.length - j; k++) {
                    if(end_time[k] > end_time[k+1] && end_time[k] != 0 && end_time[k+1] != 0 ) {
                        int temp = end_time[k];
                        end_time[k] = end_time[k+1];
                        end_time[k+1] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(end_time));

        return end_time;
    }

}
