package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberSort {
	/*
	 * baekjoon - 2751¹ø ¹®Á¦
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = sc.nextInt();
		int listNum;
		
		for(int i=0;i<num;i++) {
			listNum=sc.nextInt();
			sc.nextLine();
			list.add(listNum);
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			System.out.println(i);
		}
		
	}

}
