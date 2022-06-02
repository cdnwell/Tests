package workspace;

import java.util.Arrays;

public class ArrOrder2 {
	/*
	 * 23번. (추가문제)
	 * 
	 */
	public static void main(String[] args) {
		int[] arr2 = {5,1,33,57,12};
		int[] arr1 = new int[5];
		System.out.println("원래의 배열 : " + Arrays.toString(arr2));
		
		
		for(int i = 4;i>=0;i--) {
			arr1[4-i] = arr2[i];
		}
		//arr2 배열과 arr1 배열의 인덱스 값을 맞춰주기위해
		//4-i로 인덱스 값을 설정해주었다.
		
		
		System.out.println("뒤집은 배열 : " + Arrays.toString(arr1));
	}

}
