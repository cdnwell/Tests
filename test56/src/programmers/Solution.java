package programmers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int min = 300001;
        int answer = 30001;

        LinkedList<Integer> list1 = new LinkedList<>();

        for(int i = 0;i<queue1.length;i++){
            list1.add(queue1[i]);
        }

        for(int i=0;i<queue2.length;i++){
            list1.add(queue2[i]);
        }

        long result1;
        long result2;
        int end;
        ArrayList<String> result = new ArrayList<>();

        for(int i=0;i<list1.size()/2+1;i++){
            for(int j=0;j<list1.size();j++){
                result1=0;
                result2=0;
                for(int k=j;k<=j+i && k<list1.size();k++){
                    result1 += list1.get(k);
                    if(k==list1.size()-1 && j+i > list1.size()-1){
                        end = j+i - list1.size() -1;
                        for(int l=0;l<=end;l++){
                            result1 += list1.get(l);
                        }
                    }
                }

                for (int k=0;k<j;k++){
                    result2 += list1.get(k);
                }

                for (int k=j+i+1;k<list1.size();k++){
                    result2 += list1.get(k);
                }

                if(result1 == result2){
                    result.add(i+" "+j);
                }

            }

        }

        if(result.isEmpty()){
            answer = -1;
            return answer;
        }

        for(String key : result){
            int length = Integer.parseInt(key.split(" ")[0])+1;
            int half = list1.size()/2;
            int head = Integer.parseInt(key.split(" ")[1])+1;
            head = head > half ? head : head + half;

            int head1 = half-length+1;
            int cal1 = (head-head1)*2 + (half-length);

            head = head - half;
            int cal2 = 300001;
            if(head >= head1){
                if(head1 == 1){
                    cal2 = (head-head1)*2;
                }else{
                    cal2 = (head-head1)*2 + head1;
                }
            }

            int cal = Math.min(cal1,cal2);
            min = Math.min(cal,min);
        }

        answer = min;

        return answer;
    }
}
