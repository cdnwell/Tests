package algorithm;

import java.util.Arrays;

public class InsertionSort {
	/*
	 * 알고리즘 2.
	 * 삽입 정렬
	 */
	public static void main(String[] args) {
		int []arr = {3,1,6,8,10,9,4,7,3};
		int i,j,tmp;
		
		for(i = 0;i < arr.length;i++) {
			j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
