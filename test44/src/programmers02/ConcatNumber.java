package programmers02;

import java.util.Arrays;
import java.util.Comparator;

public class ConcatNumber {

	public static void main(String[] args) {
		int[] numbers = {3,30,34,5,9};
		
		String answer = "";
		
		String[] str = new String[numbers.length];
		
		for(int i = 0;i < numbers.length;i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return (b+a).compareTo(a+b);
			}
			
		});
	
		if(str[0].equals("0")) answer="0";
		
		for(String s : str) answer += s;
		
		System.out.println(answer);
		
	}
	
}
