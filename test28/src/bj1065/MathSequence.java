package bj1065;

import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int countNum = 99;

		if (N > 100) {

			for (int j = 101; j <= N; j++) {
				int count = 0;
				String tmpNum02 = String.valueOf(j);
				int[] arrNum = new int[tmpNum02.length()];
				int[] tmpNum = new int[tmpNum02.length() - 1];

				for (int i = 0; i < arrNum.length; i++) {
					arrNum[i] = tmpNum02.charAt(i);
				}

				for (int i = 0; i < tmpNum.length; i++) {
					tmpNum[i] = -1;
				}

				for (int i = 0; i < tmpNum.length; i++) {
					tmpNum[i] = arrNum[i + 1] - arrNum[i];
				}

				for (int i = 0; i < tmpNum.length - 1; i++) {
					if (tmpNum[i] != tmpNum[i + 1]) {
						count++;
					}
				}

				if (count == 0) {
					countNum++;
				}

			}

			N = countNum;

		}
		
		
		System.out.println(N);
		sc.close();
		
	}

}
