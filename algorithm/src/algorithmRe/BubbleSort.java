package algorithmRe;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = { 3, 4, 2, 5, 9, 7, 1, 2 };

		bubbleSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr) {
		int tmp;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	
}
