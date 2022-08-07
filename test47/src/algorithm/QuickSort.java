package algorithm;

import java.util.Arrays;

public class QuickSort {
	/*
	 * 알고리즘 3.
	 * 퀵 정렬
	 */
	public static void main(String[] args) {
		int []arr = {3,1,6,8,10,9,4,7,3};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		if(start>=end) return;
		
		int i = start + 1, j = end, tmp, key = start;
		while(i<=j) {
			while(i <= end && arr[i] <= arr[key]) {
				i++;
			}//키 값보다 큰 값일 때 까지 루프
			
			while (j > start && arr[j] >= arr[key]) {
				j--;
			}//키 값보다 작은 값일 때 까지 루프
			
			if(i>j) { // 엇갈림
				tmp = arr[key];
				arr[key] = arr[j];
				arr[j] = tmp;
			} else {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		
		quickSort(arr,start,j-1);
		quickSort(arr,j+1,end);
	}

}
