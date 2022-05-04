package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortWords {
	/*
	 * baekjoon - 1427번 문제
	 * 압력받은 문자의 오름차순 정리, 1.문자열의 길이 2.문자열의 각자리의 알파벳 순서
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();

		int N = sc.nextInt();
		sc.nextLine();

		if (N < 1 || N > 20000) {
			System.out.println("N의 값이 범위를 벗어났습니다.");
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
