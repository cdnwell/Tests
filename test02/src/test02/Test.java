package test02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String m_str; // ����� ����
		int m;
		int n;
		// Ư�� ũ�� n�� �������� ������ �꽺�� nũ�� �̸� ������ �԰� n���� ũ�� �������� ����� �Դ´�.
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
