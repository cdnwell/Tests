package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Decimal {
	/*
	 * baekjoon - 2581�� ���� M�̻� N���� �ڿ��� �� �Ҽ��� ���� ã�� 
	 * ù° �ٿ��� �� ���� ��° �� ���� �� �� �ּҰ��� ����Ѵ�.
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
			System.out.println("���� ������ ������ϴ�.");
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
			System.out.println(sum);// �Ҽ��� ��

			Collections.sort(list);

			System.out.println(list.get(0));// �Ҽ� �� ���� ���� ��
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
