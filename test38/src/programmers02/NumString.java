package programmers02;

import java.util.HashMap;

public class NumString {

	public static void main(String[] args) {
		
		String s = "one4seveneight";
		HashMap <Integer, String> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		int answer = 0;
		
		
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		
		
		for(int i=0;i<10;i++) {
			sb.setLength(0);
			sb.append(i);
			String num = sb.toString();
			s=s.replaceAll(map.get(i),num);
		}
		
		char []answerNum = s.toCharArray();
		
		for(int i=0;i<answerNum.length;i++) {
			int answerInt = (int)answerNum[answerNum.length-i-1]-48;
			answer += answerInt*(int)(Math.pow(10, i));
		}

		
		System.out.println(answer);
	}

}
