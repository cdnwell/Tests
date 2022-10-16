package programmers;

import java.util.ArrayList;

class Solution {

    public int[] solution(int rows, int columns, int[][] queries) {
        int [][]array = new int[rows][columns];
        int []answer = new int[queries.length];

        int count = 0;
        for(int i = 0;i<rows;i++){
            for(int j =0;j<columns;j++){
                array[i][j]=++count;
            }
        }

        for(int i=0;i<queries.length;i++){
            answer[i] = cal(array,queries[i]);

        }

        return answer;
    }

    static int cal(int [][]array, int []queries){
        ArrayList<Integer> list = new ArrayList<>();
        int x_fst = queries[0]-1;
        int y_fst = queries[1]-1;
        int x_lst = queries[2]-1;
        int y_lst = queries[3]-1;

        for (int i=y_fst;i<=y_lst;i++){
            list.add(array[x_fst][i]);
        }
        for (int j=x_fst+1;j<=x_lst;j++){
            list.add(array[j][y_lst]);
        }
        for (int k=y_lst-1;k>=y_fst;k--){
            list.add(array[x_lst][k]);
        }
        for (int l=x_lst-1;l>x_fst;l--){
            list.add(array[l][y_fst]);
        }

        int fin = list.size()-1;
        array[x_fst][y_fst] = list.get(fin);

        int count = 0;

        for (int i=y_fst+1;i<=y_lst;i++){
            array[x_fst][i]=list.get(count++);
        }
        for (int j=x_fst+1;j<=x_lst;j++){
            array[j][y_lst]=list.get(count++);
        }
        for (int k=y_lst-1;k>=y_fst;k--){
            array[x_lst][k]=list.get(count++);
        }
        for (int l=x_lst-1;l>x_fst;l--){
            array[l][y_fst]=list.get(count++);
        }

        int min = list.get(0);
        for(int i=0;i<list.size();i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
        }

        return min;
    }

}
