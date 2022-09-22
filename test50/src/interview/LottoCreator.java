package interview;

import java.util.HashSet;
import java.util.Random;

public class LottoCreator {

	public static void main(String[] args) {
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		HashSet<Integer> set = new HashSet<>();

		while (set.size() < 7) {
			set.add(r.nextInt(45) + 1);
		}

		System.out.print("로또 번호 : ");
		for (int i : set) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1~9단
//		for(int i=2;i<=9;i++) {
//			System.out.println(i+"단");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+" * "+j+" = "+j*i);
//			}
//		}

		// 3단에서 4의 배수 제외하고 출력
		for (int i = 1; i < 10; i++) {
			if ((3 * i) % 4 == 0)
				continue;

			System.out.println("3 * " + i + " = " + 3 * i);
		}

		// 1에서 100까지 더하기
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println("1~100까지의 합 : " + total);
	}

}
