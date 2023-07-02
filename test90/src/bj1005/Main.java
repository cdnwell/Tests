package bj1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] nAndK = br.readLine().split(" ");
            int n = Integer.parseInt(nAndK[0]);
            int k = Integer.parseInt(nAndK[1]);

            int[] building = new int[n + 1];
            ArrayList<Integer>[] list = new ArrayList[n + 1];
            String[] buildingArr = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                building[j] = Integer.parseInt(buildingArr[j - 1]);
                list[j] = new ArrayList<>();
            }
            list[0] = new ArrayList<>();

            // 도착지로 설정 된 n번 값, indegree[n] 값이 0일 경우, 시작점
            int[] indegree = new int[n + 1];
            for(int j = 0; j < k; j++) {
                String[] sAndE = br.readLine().split(" ");
                int s = Integer.parseInt(sAndE[0]);
                int e = Integer.parseInt(sAndE[1]);
                list[s].add(e);
                indegree[e]++;
            }
            int w = Integer.parseInt(br.readLine());

            int[] buildCost = new int[n + 1];
            buildCost = topologySort(list, building, buildCost, indegree);
            sb.append(buildCost[w] + "\n");
        }
        System.out.println(sb);
    }

    public static int[] topologySort(ArrayList<Integer>[] list, int[] building, int[] buildCost, int[] indegree) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < indegree.length ; i++) {
            if(indegree[i] == 0) {
                // indegree[i] == 0 은 i번 째가 시작하는 지점이라는 의미다.
                // 시작점이므로 buildCost는 i번째 building 건설 가격과 같다.
                buildCost[i] = building[i];
                // queue에 시작 점을 넣음
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int current = q.poll();

            // list[current].size()는 current번째가 시작 지점일 때,
            // 그 시작 지점으로부터 도달할 수 있는 종점(end)의 개수를 나타냅니다.
            for (int i = 0; i < list[current].size(); i++) {
                // list[current]의 i번째 인덱스에 있는 값을 next에 할당합니다.
                int next = list[current].get(i);
                // buildCost는 시작 지점(current)부터 종점(next)까지의 건설 비용을 나타내며,
                // 현재 값(buildCost[current] + building[next])과 기존 값(buildCost[next]) 중 더 큰 값을 선택합니다.
                buildCost[next] = Math.max(buildCost[current] + building[next], buildCost[next]);
                // indegree는 해당 지점(next)으로 들어오는 간선의 개수를 나타내며,
                // 간선이 제거될 때마다 값을 1씩 감소시킵니다.
                indegree[next]--;
                // indegree[next]가 0이 되면, 해당 지점(next)은 이제 시작할 수 있는 지점이 되었으므로 큐(q)에 추가합니다.
                if (indegree[next] == 0)
                    q.offer(next);
            }
        }

        return buildCost;

    }

}
