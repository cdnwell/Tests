package baekjoon;

import java.util.Scanner;

public class RockGame {
	/*
	 * baekjoon - 9655�� ���� 
	 * �� ����
	 * SK�� ������ ���� �����Ѵ�.
	 * ������ ������ CY, SK�� ���� ��������.
	 * ������ �� �ִ� ���� ���� 1�� Ȥ�� 3�� �̴�.
	 * ���� ������ n�϶� ¦���̸� �ڿ� �������� CY�� �̱��,
	 * Ȧ���̸� SK�� �̱��.
	 * ������ �ּ��� ������� �̷�����ٰ� �����ȴ�.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >1000 || num <1) {
			System.out.println("���ڰ� ������ ����ϴ�.");
			return;
		}
		
		if(num%2==0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
	}

}
