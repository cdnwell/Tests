<<<<<<< HEAD
package programmers;

import java.util.HashMap;

public class CodingTest01 {

	public static void main(String[] args) {
		String[] survey = {"TR","RT","TR"}; 
		int[] choices = {5,3,2,7,5};
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("A", 0);
		map.put("C", 0);
		map.put("F", 0);
		map.put("J", 0);
		map.put("M", 0);
		map.put("N", 0);
		map.put("R", 0);
		map.put("T", 0);
		
		for(int i = 0;i<survey.length;i++) {
			String div_str1 = survey[i].substring(0, 1);
			String div_str2 = survey[i].substring(1, 2);
			
			choices[i] = choices[i] - 4;
			
			//성격 값 계산하기
			if(choices[i]<0) {
				map.put(div_str1, map.get(div_str1)-choices[i]);
			}else if(choices[i]>0) {
				map.put(div_str2, map.get(div_str2)+choices[i]);
			}//음수일경우 앞의 글자에 값을 더하고 양수일경우 뒤의 글자에 값을 더한다.
			
		}
		
		//첫 번 째 지표
		if(map.get("R")>map.get("T")) {
			answer += "R";
		}else if(map.get("R")<map.get("T")) {
			answer += "T";
		}else {
			answer += "R";
		}
		
		//두 번 째 지표
		if(map.get("C")>map.get("F")) {
			answer += "C";
		}else if(map.get("C")<map.get("F")) {
			answer += "F";
		}else {
			answer += "C";
		}
		
		//세 번 째 지표
		if(map.get("J")>map.get("M")) {
			answer += "J";
		}else if(map.get("J")<map.get("M")) {
			answer += "M";
		}else {
			answer += "J";
		}
		
		//네 번 째 지표
		if(map.get("A")>map.get("N")) {
			answer += "A";
		}else if(map.get("A")<map.get("N")) {
			answer += "N";
		}else {
			answer += "A";
		}
		
		System.out.println(answer);
	
	}

}
=======
package programmers;

import java.util.HashMap;

public class CodingTest01 {

	public static void main(String[] args) {
		String[] survey = {"TR","RT","TR"}; 
		int[] choices = {5,3,2,7,5};
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("A", 0);
		map.put("C", 0);
		map.put("F", 0);
		map.put("J", 0);
		map.put("M", 0);
		map.put("N", 0);
		map.put("R", 0);
		map.put("T", 0);
		
		for(int i = 0;i<survey.length;i++) {
			String div_str1 = survey[i].substring(0, 1);
			String div_str2 = survey[i].substring(1, 2);
			
			choices[i] = choices[i] - 4;
			
			//성격 값 계산하기
			if(choices[i]<0) {
				map.put(div_str1, map.get(div_str1)-choices[i]);
			}else if(choices[i]>0) {
				map.put(div_str2, map.get(div_str2)+choices[i]);
			}//음수일경우 앞의 글자에 값을 더하고 양수일경우 뒤의 글자에 값을 더한다.
			
		}
		
		//첫 번 째 지표
		if(map.get("R")>map.get("T")) {
			answer += "R";
		}else if(map.get("R")<map.get("T")) {
			answer += "T";
		}else {
			answer += "R";
		}
		
		//두 번 째 지표
		if(map.get("C")>map.get("F")) {
			answer += "C";
		}else if(map.get("C")<map.get("F")) {
			answer += "F";
		}else {
			answer += "C";
		}
		
		//세 번 째 지표
		if(map.get("J")>map.get("M")) {
			answer += "J";
		}else if(map.get("J")<map.get("M")) {
			answer += "M";
		}else {
			answer += "J";
		}
		
		//네 번 째 지표
		if(map.get("A")>map.get("N")) {
			answer += "A";
		}else if(map.get("A")<map.get("N")) {
			answer += "N";
		}else {
			answer += "A";
		}
		
		System.out.println(answer);
	
	}

}
>>>>>>> 5db064a680869ecb03bed11af53a9ba7817703ec
