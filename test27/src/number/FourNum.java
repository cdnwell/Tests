package number;

import java.util.Scanner;

public class FourNum {
	/*
	 * 15��. 4���� ������ �Է¹޾Ƽ�, �迭�� ���� �� (1) �迭�� ��ü ���� ���
	 * (2) ¦���� ����ϴ� �ڵ带 �ۼ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		
		System.out.print("�Է�1 : ");
		arr[0]= sc.nextInt();
		sc.nextLine();
		System.out.print("�Է�2 : ");
		arr[1]= sc.nextInt();
		sc.nextLine();
		System.out.print("�Է�3 : ");
		arr[2]= sc.nextInt();
		sc.nextLine();
		System.out.print("�Է�4 : ");
		arr[3]= sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �迭�� ��� ��� : ");
		for(int i=0;i<4;i++) {
			System.out.print(arr[i]+" ");
		}//������ �迭�� ��� ���� ó������ ������ ����Ѵ�.
		System.out.println();
		
		System.out.print("������ �迭�� ��ҵ� �� ¦�� : ");
		for(int i=0;i<4;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}//���� ¦����� arr[i]�� ����Ѵ�.
			
		}//�迭 ��� 4���� ó������ ������ Ȯ���Ѵ�.
		
	}

}
