package baekjoon1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DfsBfs {
    static int N;
    static int M;
    static int V;
    static ArrayList<ArrayList<Integer>> arr;
    static boolean [] vstDfs;
    static boolean [] vstBfs;


    public static void dfs(int x){
        if(vstDfs[x]) return;
        vstDfs[x] = true;
        System.out.print(x+" ");
        for (int i=0;i<arr.get(x).size();i++){
            int y = arr.get(x).get(i);
            dfs(y);
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vstBfs[start] = true;
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
            for (int i=0;i<arr.get(x).size();i++){
                int y = arr.get(x).get(i);
                if(!vstBfs[y]){
                    q.add(y);
                    vstBfs[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] init = br.readLine().split(" ");

        N = Integer.parseInt(init[0]);
        M = Integer.parseInt(init[1]);
        V = Integer.parseInt(init[2]);

        // 0 : 값이 없음
        // 1 : 값이 있음 [true]
        //첫번째 ArrayList 초기화
        arr = new ArrayList<>(N+1);
        vstDfs = new boolean[N+1];
        vstBfs = new boolean[N+1];

        //두번째 ArrayList 초기화
        for(int i=0;i<=N;i++){
            arr.add(new ArrayList<>());
        }

        for(int i =0;i<M;i++){
            String[] tmp = br.readLine().split(" ");
            int fst = Integer.parseInt(tmp[0]);
            int snd = Integer.parseInt(tmp[1]);

            arr.get(fst).add(snd);
            arr.get(snd).add(fst);
        }

        for(int i=0;i<=N;i++){
            Collections.sort(arr.get(i));
        }

        dfs(V);
        System.out.println();
        bfs(V);
    }
}
