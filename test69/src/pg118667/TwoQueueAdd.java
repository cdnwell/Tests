package pg118667;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueAdd {

    public static void main(String[] args){
        int [] queue1 = {3,2,7,2};
        int [] queue2 = {4,6,5,1};

        int result = 0;
        long temp = 0;

        Queue<Integer> queueFirst = new LinkedList<>();
        Queue<Integer> queueSecond = new LinkedList<>();

        // 1. 배열에 있는 값을 두 개의 queue에 넣는다.
        for (int i = 0; i < queue1.length; i++) {
            queueFirst.add(queue1[i]);
        }
        for (int i = 0; i < queue2.length; i++) {
            queueSecond.add(queue2[i]);
        }

        // 2. queue의 값이 홀수일 경우 -1을 리턴하고 종료한다.
        for (int i = 0; i < queue1.length; i++) {
            temp = temp + queueFirst.poll() + queueSecond.poll();
        }
        if(temp % 2 == 1) result = -1;

        // 3. 최소 변경 수를 나타내는 결과 값을 출력한다.
        System.out.println(result);

    }

}
