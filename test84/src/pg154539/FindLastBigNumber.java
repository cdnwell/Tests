package pg154539;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindLastBigNumber {

    public static void main(String[] args) {
        int[] numbers = {9, 7, 5, 4, 3, 6, 2};

        int[] answer = solution(numbers);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] numbers) {
        // [ index, value ] 배열을 value 오름차순으로 담는 prioriryQueue선언
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int index = 0; index < numbers.length; index++) {

            int value = numbers[index];

            // 현재 index보다 앞에 있는 index 중
            // 현재 value보다 작은값을 가지는 index를 현재 value로 치환
            while (!queue.isEmpty() && queue.peek()[1] < value)
                numbers[queue.poll()[0]] = value;

            queue.add(new int[] { index, value });
        }

        // 미처리 index에 -1 대입
        while (!queue.isEmpty())
            numbers[queue.poll()[0]] = -1;

        return numbers;
    }

}
