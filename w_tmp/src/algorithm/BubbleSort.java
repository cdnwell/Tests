package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 8, 12 };

		BubbleSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	static void BubbleSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

	}

}
