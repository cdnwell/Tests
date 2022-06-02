package workspace;

import java.util.Arrays;

public class ArrSum {
	/*
	 * 24.임의 주어진 2개의 배열을 합친 배열을 출력
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
		//count 변수를 설정해주어 arrA 배열의 0부터 차례로 증가하는 
		//반복문을 만들어 배열 요소를 넣었다.
		
		System.out.println("새로운 배열(길이 "+arrC.length+") : "+Arrays.toString(arrC));
	}

}
