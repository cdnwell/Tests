package pg152996;

import java.util.HashMap;
import java.util.Map;

public class Seesaw {

    public static void main(String[] args) {
        int[] weights = {100,180,360,100,270};
        System.out.println(solution(weights));
    }

    public static long solution(int[] weights) {
        long answer = 0;

        answer = setMate(weights);

        Map<Double, Integer> hm = new HashMap<>();

        hm.put(1.0, hm.getOrDefault());

        return answer;
    }

    public static long setMate(int[] weights) {
        long answer = 0;

        for (int i = 0; i < weights.length; i++) {
            for (int j = i+1; j < weights.length; j++) {
                if(weights[i] == weights[j]) {
                    answer++;
                    continue;
                }
                if (weights[i] * 2 == weights[j] * 3 || weights[i] * 2 == weights[j] * 4) {
                    answer++;
                    continue;
                }
                if (weights[i] * 3 == weights[j] * 2 || weights[i] * 3 == weights[j] * 4) {
                    answer++;
                    continue;
                }
                if (weights[i] * 4 == weights[j] * 2 || weights[i] * 4 == weights[j] * 3) {
                    answer++;
                    continue;
                }
            }
        }

        return answer;
    }

}
