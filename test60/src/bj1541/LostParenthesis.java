package bj1541;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LostParenthesis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> signList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(expression, "+-");
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            numList.add(num);
        }

        System.out.println(numList);

        StringTokenizer sign = new StringTokenizer(expression, "0123456789");
        while (sign.hasMoreTokens()){
            String signToken = sign.nextToken();
            System.out.println(signToken);
            signList.add(signToken);
        }

        System.out.println(signList);

        ArrayList<Integer> numStore = new ArrayList<>();

        int result = numList.get(0);

        for(int i=0;i<numList.size()-1;i++){
            if(!numStore.isEmpty()){
                if(signList.get(i).equals("+")){
                    numStore.add(numList.get(i+1));
                } else {
                    for(int num : numStore){
                        result -= num;
                    }
                    result -= numList.get(i+1);
                    numStore.clear();
                }
            } else if(signList.get(i).equals("+")){
                result += numList.get(i+1);
            } else {
                numStore.add(numList.get(i+1));
            }
        }

        if(!numStore.isEmpty()){
            for(int num : numStore){
                result -= num;
            }
        }

        System.out.println("result : "+result);

    }
}
