package workspace;

import java.util.Arrays;

public class ArrOrder {
	/*
	 * 23��. �迭�� ������ ������ �迭�� ����� ���
	 * 
	 */
	public static void main(String[] args) {
		int[] arr1 = {12,57,33,1,5};
		int[] arr2 = new int[5];
		System.out.println("������ �迭 : " + Arrays.toString(arr1));
		
		
		for(int i = 4;i>=0;i--) {
			arr2[4-i] = arr1[i];
		}
		//arr2 �迭�� arr1 �迭�� �ε��� ���� �����ֱ�����
		//4-i�� �ε��� ���� �������־���.
		
		System.out.println("������ �迭 : " + Arrays.toString(arr2));
	}

}
