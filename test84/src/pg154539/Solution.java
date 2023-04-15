package pg154539;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};

        int[] result = solution(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)-> a[1] - b[1]);

        for (int index = 0; index  < numbers.length ; index++) {
            int value = numbers[index];

            while (!queue.isEmpty() && queue.peek()[1] < value)
                numbers[queue.poll()[0]] = value;

            queue.add(new int[] {index, value});
        }

        while (!queue.isEmpty())
            numbers[queue.poll()[0]] = -1;

        return numbers;
    }

}
