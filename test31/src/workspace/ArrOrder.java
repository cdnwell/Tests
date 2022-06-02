package workspace;

import java.util.Arrays;

public class ArrOrder {
	/*
	 * 23번. 배열의 순서를 뒤집은 배열을 만들어 출력
	 * 
	 */
	public static void main(String[] args) {
		int[] arr1 = {12,57,33,1,5};
		int[] arr2 = new int[5];
		System.out.println("원래의 배열 : " + Arrays.toString(arr1));
		
		
		for(int i = 4;i>=0;i--) {
			arr2[4-i] = arr1[i];
		}
		//arr2 배열과 arr1 배열의 인덱스 값을 맞춰주기위해
		//4-i로 인덱스 값을 설정해주었다.
		
		System.out.println("뒤집은 배열 : " + Arrays.toString(arr2));
	}

}
