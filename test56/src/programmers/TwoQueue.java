package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class TwoQueue {
    public static void main(String[] args){
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};
//        int[] queue1 = {1, 2, 1, 2};
//        int[] queue2 = {1, 10, 1, 2};
//        int[] queue1 = {1, 1};
//        int[] queue2 = {1, 5};
        int min = 300001;
        int answer = 30001;

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for(int i = 0;i<queue1.length;i++){
            list1.add(queue1[i]);
            list2.add(queue2[i]);
        }

        for(int i=0;i<queue2.length;i++){
            list1.add(queue2[i]);
            list2.add(queue1[i]);
        }

        int result1;
        int result2;
        int end;
        ArrayList<String> result = new ArrayList<>();

        // 두 result가 같은 경우 찾기
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

                    System.out.print("result1 : " );
                    for(int k=j;k<=j+i && k<list1.size();k++){
                        result1 += list1.get(k);
                        System.out.print(list1.get(k) + " ");
                        if(k== list1.size() -1 && j+i > list1.size()-1){
                            end = j+i - list1.size() -1;
                            for(int l=0;l<=end;l++){
                                result1 += list1.get(l);
                                System.out.print(list1.get(k) + " ");
                            }
                        }
                    }
                    System.out.println();

                    System.out.print("result2 : ");
                    for (int k=0;k<j;k++){
                        result2 += list1.get(k);
                        System.out.print(list1.get(k)+" ");
                    }

                    for (int k=j+i+1;k<list1.size();k++){
                        result2 += list1.get(k);
                        System.out.print(list1.get(k)+" ");
                    }
                    System.out.println();
                }

            }

        }

        System.out.println(result);

        // result1과 result2가 같은 경우가 없을 때 answer == -1
        if(result.isEmpty()){
            answer = -1;
            System.out.println("같은 경우가 없습니다.");
            System.out.println(answer);
            return;
        }

        // map에 설정된 값 까지 최소 값 구하기
        // 1번 리스트로 최소값 구하기

        for(String key : result){
            int length = Integer.parseInt(key.split(" ")[0])+1;
            int head = Integer.parseInt(key.split(" ")[1])+1;
            int half = list1.size()/2;
//            System.out.println("i : "+i);
//            System.out.println("j : "+j);

            int head1 = half-length+1;
            int cal1 = (head-head1)*2 + (half-length);

            //두 번 째 비교
            head = head - half;
            int cal2 = half-length + Math.abs(head-half) * 2;

            int cal = Math.min(cal1,cal2);
            min = Math.min(cal,min);

        }

        System.out.println("result(min) : " + min);

    }
}
