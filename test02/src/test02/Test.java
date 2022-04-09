package test02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String m_str; // 산딸기 개수
		int m;
		int n;
		// 특정 크기 n을 기준으로 작으면 쥬스로 n크기 이면 생으로 먹고 n보다 크면 케익으로 만들어 먹는다.
		int[] ai = null;

		
		String rsp_size;


		m_str = sc.nextLine();
		
		String[] size_change2= m_str.split("\\s");
		m=Integer.parseInt(size_change2[0]);
		
		ai = new int[m];
		rsp_size = sc.nextLine();
		
//		String[] size_change = rsp_size.split("\\s");
//
//		for (int i = 0; i < m; i++) {
//			ai[i] = Integer.parseInt(size_change[i]);
//		}
	}

}
