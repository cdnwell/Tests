package pg152996;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Seesaw {

    public static void main(String[] args) {
        int[] weights = {100,180,360,100,270};
        System.out.println(solution(weights));
    }

    public static long solution(int[] weights) {
        long answer = 0;

        Arrays.sort(weights);

        answer = setMate(weights);

        return answer;
    }

    public static long setMate(int[] weights) {
        long answer = 0;

        int tmpCnt = 0;
        for (int i = 0; i < weights.length; i++) {
            if(i != 0 && weights[i] == weights[i-1]) {
                answer += --tmpCnt;
                continue;
            }

            tmpCnt = 0;

            for (int j = i+1; j < weights.length; j++) {
                if(weights[i] == weights[j]
                || weights[i] * 2 == weights[j] * 3 || weights[i] * 2 == weights[j] * 4
                || weights[i] * 3 == weights[j] * 2 || weights[i] * 3 == weights[j] * 4
                || weights[i] * 4 == weights[j] * 2 || weights[i] * 4 == weights[j] * 3
                ) {
                    tmpCnt++;
                }
            }
            answer += tmpCnt;
        }

        return answer;
    }

}
