package number;

import java.util.Scanner;

public class FourNumPrint {
	/*
	 * 16��.
	 * 
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
		}
		System.out.println();
		
		int count = 0;		//Ȧ���� �ִ��� �Ǻ��ϱ� ���� ���� ����
		for(int i=0;i<4;i++) {
			if(arr[i]%2==1) {
				count++;
			}//���� Ȧ����� count���� �߰��Ѵ�.
			
		}
		
		if(count == 0) {
			System.out.println("�� �迭���� ¦���� ����!");
		}else {
			System.out.println("�� �迭���� Ȧ���� ����!");
		}
		
	}

}
