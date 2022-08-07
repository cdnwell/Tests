package algorithm;

import java.util.Arrays;

public class SelectionSort {
	/*
	 * 알고리즘 1.
	 * 선택 정렬
	 */
	public static void main(String[] args) {
		int i,j,least,tmp;
		int arr[] = {1,3,8,7,4,6};
		for(i =0;i<arr.length;i++) {
			least = i;
			for(j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[least]) {
					least = j;
				}
			}
			
			if(least != i) {
				tmp = arr[least];
				arr[least] = arr[i];
				arr[i] = tmp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
