package test01;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest01 {
	public static void main(String[] args) {
		int [] arr = { 1, 2, 3, 4 };
		Integer [] arr02 = { 1, 2, 3, 4 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr02));
		
		System.out.println(list);
		
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		System.out.println(Arrays.toString(arr02));
	}
}
