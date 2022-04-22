package test08;

import java.util.Scanner;

public class NumberNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();
		if (a < 100 || a >= 1000) {
			System.out.println("a값이 범위를 벗어났습니다.");
			return;
		}
		int b = sc.nextInt();
		sc.nextLine();
		if (b < 100 || b >= 1000) {
			System.out.println("b값이 범위를 벗어났습니다.");
			return;
		}
		int c = sc.nextInt();
		sc.nextLine();
		if (c < 100 || c >= 1000) {
			System.out.println("c값이 범위를 벗어났습니다.");
			return;
		}

		// 997,002,999 ~ 1,000,000

		int result = a * b * c;

//		int ten8, ten7, ten6, ten5, ten4, ten3, ten2, ten, one;
//		ten8 = result / 100000000;
//		ten7 = result / 10000000;
//		ten6 = result / 1000000;
//		ten5 = result / 100000;
//		ten4 = result / 10000;
//		ten3 = result / 1000;
//		ten2 = result / 100;
//		ten = result / 10;

		int one = result % 10;
		double[] ten_tmp = new double[8];
		int[] ten = new int[8];

		for (int i = 0; i < 8; i++) {
			ten_tmp[i] = result / (Math.pow(10, i + 1));
		}

		for (int i = 0; i < 8; i++) {
			System.out.println("ten[" + i + "]:" + ten_tmp[i]);
		}

		for (int i = 0; i < 8; i++) {
			ten[i] = (int) ten_tmp[i];
			ten[i] = ten[i] % 10;
			System.out.println("ten[" + i + "]:" + ten[i]);
		}

		int[] number = new int[10];
		for (int i = 0; i < 10; i++) {
			number[i] = 0;
		}

		int maxNum;

		if (ten[7] >= 1) {
			// 10^8일 경우
			maxNum = 8;
			numReturn(ten, number, maxNum, one);
		} else if (ten[6] >= 1) {
			// 10^7일 경우
			maxNum = 7;
			numReturn(ten, number, maxNum, one);
		} else if (ten[5] >= 1) {
			// 10^6일 경우
			maxNum = 6;
			numReturn(ten, number, maxNum, one);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(number[i]);
		}
	}

	public static void numReturn(int[] ten, int[] number, int maxNum, int one) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < maxNum; j++) {
				if (ten[j] == i) {
					number[i] += 1;
					System.out.println("number[" + j + "]:" + i);
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if (one == i) {
				number[i] += 1;
			}
		}
	}

}
