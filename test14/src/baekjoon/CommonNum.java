package baekjoon;

import java.util.Scanner;

public class CommonNum {
	/*
	 * baekjoon - 2609�� ����
	 * �ִ������� �ּҰ���� ����
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		String [] str_tmp=str.split("\\s");
		int x=Integer.parseInt(str_tmp[0]);
		int y=Integer.parseInt(str_tmp[1]);
		
		int max = 0;
		int min = 1;
		
		for(int i=1;i<10000;i++) {
			if(i%x ==0 && i%y==0) {
				max=i;
				break;
				
			}
		}//�ּҰ���� ���ϱ�
		
		for(int i=1;i<=x||i<=y;i++) {
			if(x%i==0 && y%i==0) {
				min =i;
			}
		}//�ִ����� ���ϱ�
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
