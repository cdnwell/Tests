package bj1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] numArr = sc.nextLine().split(" ");

        int A = Integer.parseInt(numArr[0]);
        int B = Integer.parseInt(numArr[1]);

        System.out.println(A+B);
    }
}
