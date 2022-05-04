package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Decimal {
	/*
	 * baekjoon - 2581번 문제 M이상 N이하 자연수 중 소수인 것을 찾아 
	 * 첫째 줄에는 그 합을 둘째 줄 에는 그 중 최소값을 출력한다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int M = sc.nextInt();
		sc.nextLine();
		int N = sc.nextInt();
		sc.nextLine();

		if (M > N || M < 1 || N < 1 || M > 10000 || N > 10000) {
			System.out.println("값이 범위를 벗어났습니다.");
			return;
		}

		list = decimalFound(M, N);
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			int sum = 0;
			for (int n : list) {
				sum += n;
			}
			System.out.println(sum);// 소수의 합

			Collections.sort(list);

			System.out.println(list.get(0));// 소수 중 가장 낮은 수
		}
	}

	static ArrayList<Integer> decimalFound(int M, int N) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count;
		int i, j;

		for (i = M; i <= N; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				list.add(i);
		}

		return list;
	}

}
