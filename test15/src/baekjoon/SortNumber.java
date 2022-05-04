package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			sc.nextLine();
			list.add(num);
		}
		
		Collections.sort(list);
		
		for(int n : list) {
			System.out.println(n);
		}
		
	}

}
