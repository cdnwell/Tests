package pg134240;

import java.util.Stack;

public class Solution {

    public static void main(String[] args){
        String answer = "";

        int[] food = {1,3,4,6};
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 1; i < food.length; i++) {
            count += food[i] / 2;
        }

        int[] foodStore = new int [count * 2 + 1];

        int foodNum = 0;
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                foodStore[foodNum++] = i;
                stack.add(i);
            }
        }

        foodStore[foodNum++] = 0;
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            foodStore[foodNum++] = stack.pop();
        }

        for (int i = 0; i < foodStore.length; i++){
            answer += foodStore[i];
        }

        System.out.println(answer);

    }

}
