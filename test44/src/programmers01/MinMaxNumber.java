package programmers01;

import java.util.TreeSet;

public class MinMaxNumber {
	/*
	 * [문제]
	 * 최대값, 최소값 구하기
	 * 
	 */
	public static void main(String[] args) {
		
		String s = "1 2 3 4";
		
		TreeSet<Integer> ts = new TreeSet<>();
		String[] arr = s.split(" ");
		for(String str : arr) {
			ts.add(Integer.parseInt(str));
		}
		
		String answer = ts.first() + " " + ts.last();
		
		System.out.println(answer);
	}
	
}
