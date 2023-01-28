package bj1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;

public class SumSequence {
    private static int MAX = 500000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmpStr = br.readLine().split(" ");
        int N = Integer.parseInt(tmpStr[0]);
        int L = Integer.parseInt(tmpStr[1]);
        int tmp, sum, cnt;
        int length = MAX;
        String str = "";

        Queue<Integer> queue = new LinkedList<>();

        // 1. 꺼내면서 비교해볼 값을 queue에 넣는다.
        // 1.1 N / 2 까지 조건을 건 이유는 갯수가 최소 2개 이기 때문에 값이 N / 2를 넘을 수 없기 때문이다.
        for (int i = 0; i <= N / 2; i++) {
            queue.add(i);
        }

        // 2. queue에 넣은 값을 pop 하면서 비교해 본다.
        while(!queue.isEmpty()){
            sum = 0;
            cnt = 0;
            tmp = queue.poll();
            int tmpSum = (100 * (2 * tmp) + 99) / 2;
            if (tmpSum < N) continue;
            for (int i = tmp; i <= tmp + 100; i++) {
                if(sum > N) break;
                sum += i;
                cnt++;
                if(sum == N && cnt >= L) {
                    if(Math.min(length, cnt) < length){
                        length = cnt;
                        str = "";
                        for (int j = tmp; j < tmp + cnt; j++) {
                            str += j + " ";
                        }
                    }
                }
            }
        }

        // 3. 출력, length 값이 변하지 않은 경우 -1을 출력
        if(length == MAX)
            System.out.println("-1");
        else
            System.out.println(str);
    }

}
