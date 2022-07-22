package array;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntegration {

	public static int[] arrConcat(int[] arr,int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(int i=0; i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		
		int[] arr3 = new int[set.size()];
		
		int j = 0;
		for(int i : set) {
			arr3[j]=i;
			j++;
		}
		
		return arr3;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,7};
		int[] arr2 = {2,6,8};
		int[] arr3 = arrConcat(arr,arr2);
		System.out.println("두 배열을 합친 배열 : " + Arrays.toString(arr3));
	}

}
