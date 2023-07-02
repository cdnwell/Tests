package src.bj1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ACMCraftReview {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] nAndK = br.readLine().split(" ");
            int N = Integer.parseInt(nAndK[0]);
            int K = Integer.parseInt(nAndK[1]);

            int[] DArr = new int[N+1];

            String[] buildTime = br.readLine().split(" ");

            for (int j = 1; j <= N; j++) {
                DArr[j] = Integer.parseInt(buildTime[j-1]);
            }

            String[] XAndY = new String[K];
            for (int j = 0; j < K; j++) {
                XAndY[j] = br.readLine();
            }

            ArrayList<ArrayList<Builder>> list = new ArrayList<>(N+1);

            for (int j = 0; j < K; j++) {
                int X = Integer.parseInt(XAndY[j].split(" ")[0]);
                int Y = Integer.parseInt(XAndY[j].split(" ")[1]);

                // X번 (start)에 해당하는 list를 가져온다.
                ArrayList<Builder> builderList = list.get(X);
                builderList = new ArrayList<>();

                Builder builder = new Builder();

                builder.start = X;
                builder.end = Y;
                builder.buildTime = DArr[Y];

                builderList.add(builder);
            }

        }

    }

    public static void topologySort(ArrayList<ArrayList<Builder>> list) {
        Queue<ArrayList<Builder>> queue = new LinkedList<>();
        findStart(list, queue);

        while(!queue.isEmpty()) {

        }
    }

    public static void findStart(ArrayList<ArrayList<Builder>> list, Queue<ArrayList<Builder>> queue) {
        for(ArrayList<Builder> builderList : list) {
            if(builderList.size() == 1) queue.offer(builderList);
        }
    }

}

class Builder {
    int start;
    int end;
    int buildTime;
    int related;

    Builder() { }

    Builder(int start, int end, int buildTime) {
        this.start = start;
        this.end = end;
        this.buildTime = buildTime;
    }

}