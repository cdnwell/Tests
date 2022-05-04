package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortInside {
	/*
	 * baekjoon - 1427�� ����
	 * �з¹��� ���� ���ڸ� �������� ����
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n>1000000000) {
			System.out.println("n�� ���� ������ ������ϴ�.");
			return;
		}
		
		String str =String.valueOf(n);
		int [] arr = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i) -'0';
		}//�迭�� ���ڸ� ���ڸ� �־��ش�.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}//ArrayList list�� �־��ش�.
		
		Collections.sort(list);//������������
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}//�ڿ������� ������������ ���
		
	}

}
