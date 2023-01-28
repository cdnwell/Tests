package bj1083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer>A = new ArrayList<>();
        int S = Integer.parseInt(br.readLine());

        int num = 0;

        while (st.hasMoreTokens()){
            A.add(Integer.parseInt(st.nextToken()));
        }

        int initIdx = 0;
        int max = 0;
        int maxIdx = -1;
        int moveIdx = 0;

        while( initIdx < N - 1 && moveIdx <= S ) {
            max = A.get(initIdx);
            maxIdx = -1;

            int cmpIdx = initIdx + 1;
            while ( cmpIdx < N && moveIdx + cmpIdx - initIdx <= S ) {
                if(A.get(cmpIdx) > max){
                    max = A.get(cmpIdx);
                    maxIdx = cmpIdx;
                }
                cmpIdx++;
            }

            if(maxIdx != -1){
                A.remove(maxIdx);
                A.add(initIdx,max);
                moveIdx = moveIdx + maxIdx - initIdx;
            }

            initIdx++;
        }

        for (int j = 0; j < A.size(); j++) {
            System.out.print(A.get(j) + " ");
        }

    }

}
