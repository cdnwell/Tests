package baekjoon;

import java.util.Scanner;

public class NumberSort {
	/*
	 * 2750번. 수 정렬하기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i,j,temp;
		int []arr = new int[N];
		
		for(i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}//숫자 순서대로 받기
		
		for(i = 0;i<N;i++) {
			for(j =0;j<N-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}//버블 정렬
		
		for(i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
