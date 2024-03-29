package pg150369;

import java.util.Collection;
import java.util.Collections;

public class Solution1 {
    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0L;

        for(int i = n - 1; i >= 0; i--){
            // 배달을 위해 현재 집에 필요한 방문횟수
            int delCount = deliveries[i] == 0 ? 0 : (deliveries[i] - 1) / cap + 1;
            // 수거를 위해 현재 집에 필요한 방문횟수
            int pickCount = pickups[i] == 0 ? 0 : (pickups[i] - 1) / cap + 1;

            // 둘 다 0이면 방문 필요 없으므로 빠르게 건너뛰자
            if(delCount == 0 && pickCount == 0){
                continue;
            }

            Collections collections;
            Collection<String> collection;

            // 방문횟수 둘 중 최대값을 선택하고, 이동거리 계산해서 누적
            int count = Math.max(delCount, pickCount);
            answer += count * (i + 1) * 2L;

            // 배달 가능 상자 수와 수거 가능 상자 수
            int delBox = count * cap;
            int pickBox = count * cap;

            // 현인덱스부터 앞쪽으로 살피며 남은 상자 수를 변경해준다
            for(int j = i; j >= 0; j--){
                // 배달 가능 / 수거 가능한 상자 수가 바닥나면 더 이상 돌 이유가 없다
                if(delBox == 0 && pickBox == 0){
                    break;
                }
                // 투포인터를 썼으면 굳이 if문 체크 필요없겠지만
                // 하나의 인덱스로 접근하므로 오계산을 막기 위해 배달 가능 상자가 있는지 확인
                if(delBox > 0){
                    int box = Math.min(delBox, deliveries[j]);
                    deliveries[j] -= box;
                    delBox -= box;
                }
                // 마찬가지로 확인
                if(pickBox > 0){
                    int box = Math.min(pickBox, pickups[j]);
                    pickups[j] -= box;
                    pickBox -= box;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        long answer = solution(2,3, new int[]{2,2,3}, new int[]{0,0,1});
        System.out.println(answer);
    }

}
