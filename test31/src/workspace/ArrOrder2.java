package workspace;

import java.util.Arrays;

public class ArrOrder2 {
	/*
	 * 23��. (�߰�����)
	 * 
	 */
	public static void main(String[] args) {
		int[] arr2 = {5,1,33,57,12};
		int[] arr1 = new int[5];
		System.out.println("������ �迭 : " + Arrays.toString(arr2));
		
		
		for(int i = 4;i>=0;i--) {
			arr1[4-i] = arr2[i];
		}
		//arr2 �迭�� arr1 �迭�� �ε��� ���� �����ֱ�����
		//4-i�� �ε��� ���� �������־���.
		
		
		System.out.println("������ �迭 : " + Arrays.toString(arr1));
	}

}
