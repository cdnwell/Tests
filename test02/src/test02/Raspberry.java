package test02;

import java.util.Scanner;

public class Raspberry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int m; // ����� ����
		int n;
		// Ư�� ũ�� n�� �������� ������ �꽺�� nũ�� �̸� ������ �԰� n���� ũ�� �������� ����� �Դ´�.
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
		// ���� �迭 �Ҵ�

		// String []cs_change = num_cs.split("\\s");
		// n=Integer.parseInt(cs_change[0]);

		// ���ڿ��� ���� �����ϴ� ���

		n = sc.nextInt();

		// �ʿ��� ������ ��� ������

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
					// index���� �������ش�.

					// idx �ʱ�ȭ ��
				}
			}

			if (ai[i] > n && find_idx != 0 && idx < i) {
				continue;
			}
			
			if (ai[i] <= n && find_idx != 0 && idx < i) {
				// ai[i]�� n�� ���ų� ���� ��� �ٲ��ִ� ��
				tmp = ai[i];
				
				//System.out.println("i:"+i);
				//System.out.println("tmp:"+tmp);
				//System.out.println("idx:"+idx);
				//������ ������ ��� ���� ���� ����Ʈ ���Դϴ�.
				
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
