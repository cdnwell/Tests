package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SelfNumber {
	/*
	 * baekjoon - 4673¹ø ¹®Á¦
	 * 
	 */
	public static HashSet<Integer> list = new HashSet<Integer>();
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10000;i++) {
			list.add(i);
		}
		
		for(int i=1;i<=10000;i++) {
			selfNum(i);
		}
		
		ArrayList<Integer> al = new ArrayList<>(list);
		
		Collections.sort(al);
		
		for(int x : al) {
			System.out.println(x);
		}
		
	}
	
	public static void selfNum(int num) {
		String strNum=String.valueOf(num);
		int[] intNum=new int[strNum.length()];
		int sum=num;
		
		for(int i=0;i<strNum.length();i++) {
			intNum[i]=strNum.charAt(i)-'0';
		}
		
		for(int i=0;i<intNum.length;i++) {
			sum+=intNum[i];
		}
		
		if(sum>10000)
			return;
		list.remove(sum);
		selfNum(sum);
	}
	
}
