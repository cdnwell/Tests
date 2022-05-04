package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortWords {
	/*
	 * baekjoon - 1427�� ����
	 * �з¹��� ������ �������� ����, 1.���ڿ��� ���� 2.���ڿ��� ���ڸ��� ���ĺ� ����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();

		int N = sc.nextInt();
		sc.nextLine();

		if (N < 1 || N > 20000) {
			System.out.println("N�� ���� ������ ������ϴ�.");
			return;
		}
		int strMax = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			set.add(str);
			if (strMax < str.length()) {
				strMax = str.length();
			}
		}
		ArrayList<String> list = new ArrayList<String>(set);

		Collections.sort(list);

		for (int i = 1; i <= strMax; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).length() == i) {
					System.out.println(list.get(j));
					list.remove(j);
				}
			}
		}

	}

}
