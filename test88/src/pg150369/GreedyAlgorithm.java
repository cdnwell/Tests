package pg150369;

import java.util.Scanner;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, result = 0;
        n = sc.nextInt();

        result += n / 500;
        n %= 500;
        result += n / 100;
        n %= 100;
        result += n / 50;
        n %= 50;
        result += n / 10;

        System.out.println(result);
    }

}
