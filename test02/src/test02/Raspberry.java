package test02;

import java.util.Scanner;

public class Raspberry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int m; // 산딸기 개수
		int n;
		// 특정 크기 n을 기준으로 작으면 쥬스로 n크기 이면 생으로 먹고 n보다 크면 케익으로 만들어 먹는다.
		int[] ai = null;

		int tmp;

		int find = 0;
		int idx = 0;
		int find_idx = 0;

		int j;
		
		String m_str;
		String rsp_size;

		m_str = sc.nextLine();

		String[] size_change2 = m_str.split("\\s");
		m = Integer.parseInt(size_change2[0]);

		ai = new int[m];

		rsp_size = sc.nextLine();
		String[] size_change = rsp_size.split("\\s");

		for (int i = 0; i < m; i++) {
			ai[i] = Integer.parseInt(size_change[i]);
		}

//		for(int i=0;i<n;i++)
//		{
//			v[i]=Integer.parseInt(pg_change[i]);
//		}
		// 동적 배열 할당

		// String []cs_change = num_cs.split("\\s");
		// n=Integer.parseInt(cs_change[0]);

		// 문자에서 숫자 추출하는 방법

		n = sc.nextInt();

		// 필요한 변수는 모두 가져옴

		for (int i = 0; i < m; i++) {
			System.out.print(ai[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < m; i++) {

			if (ai[i] < n && find == 0) {
				continue;
			}

			if (ai[i] >= n && find == 0) {
				find++;
				if (ai[i] > ai[i + 1]) {
					idx = i + 1;

					tmp = ai[i + 1];
					ai[i + 1] = ai[i];
					ai[i] = tmp;

					find_idx++;
					if (i + 2 > m - 1) {
						break;
					} else {
						i = i + 2;
					}
					// index값을 조정해준다.

					// idx 초기화 식
				}
			}

			if (ai[i] > n && find_idx != 0 && idx < i) {
				continue;
			}
			
			if (ai[i] <= n && find_idx != 0 && idx < i) {
				// ai[i]가 n과 같거나 작을 경우 바꿔주는 식
				tmp = ai[i];
				
				//System.out.println("i:"+i);
				//System.out.println("tmp:"+tmp);
				//System.out.println("idx:"+idx);
				//설정의 오류를 잡기 위해 만든 프린트 문입니다.
				
				for (j = i; j > idx; j--) {
					ai[j] = ai[j - 1];
				}
				ai[j] = tmp;
				idx++;
			}

		}

		for (int i = 0; i < m; i++) {
			System.out.print(ai[i] + " ");
		}

	}
}
