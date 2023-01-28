package bj1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasySolving {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int A = Integer.parseInt(strArr[0]);
        int B = Integer.parseInt(strArr[1]);

        int[] numArr = new int[B];
        int index = 0;

        //1. 더하기 위한 배열을 만들어줌
        for (int i = 1; i <= B; i++) {
            for (int j = 1; j <= i; j++) {
                if(index == B) break;
                numArr[index] = i;
                if(index < B) index++;
            }
            if(index == B) break;
        }

        //2. 배열 출력 테스트
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.print(numArr[i]+" ");
//        }
//        System.out.println();

        int sum = 0;

        //2. 입력 값을 기반으로 배열에 접근해 더해주기
        for (int i = A - 1; i < B; i++) {
            sum += numArr[i];
        }

        System.out.println(sum);
    }
}
