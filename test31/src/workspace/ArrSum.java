package workspace;

import java.util.Arrays;

public class ArrSum {
	/*
	 * 24.���� �־��� 2���� �迭�� ��ģ �迭�� ���
	 * 
	 */
	public static void main(String[] args) {
		int[] arrA = {12,57,33,1};
		int[] arrB = {5, 7, 9};
		int[] arrC = new int[7];
		
		for(int i = 0;i<4;i++) {
			arrC[i]=arrA[i];
		}
		
		int count = 0;
		
		for(int i=4;i<7;i++) {
			arrC[i]=arrA[count];
			count++;
		}
		//count ������ �������־� arrA �迭�� 0���� ���ʷ� �����ϴ� 
		//�ݺ����� ����� �迭 ��Ҹ� �־���.
		
		System.out.println("���ο� �迭(���� "+arrC.length+") : "+Arrays.toString(arrC));
	}

}
