package bj1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int A = Integer.parseInt(strArr[0]);
        int B = Integer.parseInt(strArr[1]);

        int[] numArr = new int[B];
        int index = 0;

        for (int i = 1; i <= B; i++) {
            for (int j = 1; j <= i; j++) {
                if(index == B) break;
                numArr[index] = i;
                if(index < B) index++;
            }
            if(index == B) break;
        }

        int sum = 0;

        for (int i = A - 1; i < B; i++) {
            sum += numArr[i];
        }

        System.out.println(sum);
    }
}
