package pg134240;

import java.util.Stack;

public class FoodFighter {

    public static void main(String[] args){
        int[] food = {1,3,4,6};
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        // 1. 반으로 나눴을 때 총 개수 구하기
        for (int i = 1; i < food.length; i++) {
            count += food[i] / 2;
        }

        // 2. 구한 개수만큼의 배열 만들기
        int[] foodStore = new int [count * 2 + 1];

        // 3. stack에 넣으면서 값 배열에 넣기
        int foodNum = 0;
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                foodStore[foodNum++] = i;
                stack.add(i);
            }
        }

        // 4. 중간에 물 추가하기
        foodStore[foodNum++] = 0;
        int size = stack.size();

        // 5. 스택의 값 모두 반환
        for (int i = 0; i < size; i++) {
            foodStore[foodNum++] = stack.pop();
        }

//        System.out.println(Arrays.toString(foodStore));

        System.out.print("\"");
        for (int i = 0 ; i < foodStore.length ; i++){
            System.out.print(foodStore[i]);
        }
        System.out.println("\"");
    }

}
