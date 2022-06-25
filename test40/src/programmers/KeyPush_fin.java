package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPush_fin {
	public static void main(String[] args) {
		int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
//		String hand = "left";
		String answer = "";
		StringBuilder sb = new StringBuilder();
		HashMap<Integer,ArrayList<String>> map = new HashMap<>();
		
		ArrayList<String> strArr5 = new ArrayList<>();
		strArr5.add("2 0");
		strArr5.add("5 1");
		strArr5.add("8 2");
		strArr5.add("0 3");
		map.put(2, strArr5);
		
		ArrayList<String> strArr6 = new ArrayList<>();
		strArr6.add("2 1");
		strArr6.add("5 0");
		strArr6.add("8 1");
		strArr6.add("0 2");
		map.put(5, strArr6);
		
		ArrayList<String> strArr7 = new ArrayList<>();
		strArr7.add("2 2");
		strArr7.add("5 1");
		strArr7.add("8 0");
		strArr7.add("0 1");
		map.put(8, strArr7);
		
		ArrayList<String> strArr8 = new ArrayList<>();
		strArr8.add("2 3");
		strArr8.add("5 2");
		strArr8.add("8 1");
		strArr8.add("0 0");
		map.put(0, strArr8);
		
		ArrayList<String> strArr1 = new ArrayList<>();
		strArr1.add("0 1");
		strArr1.add("8 2");
		strArr1.add("5 3");
		strArr1.add("2 4");
		map.put(10, strArr1);
		map.put(12, strArr1);
		
		ArrayList<String> strArr2 = new ArrayList<>();
		strArr2.add("8 1");
		strArr2.add("0 2");
		strArr2.add("5 2");
		strArr2.add("2 3");
		map.put(7,strArr2);
		map.put(9, strArr2);
		
		ArrayList<String> strArr3 = new ArrayList<>();
		strArr3.add("5 1");
		strArr3.add("8 2");
		strArr3.add("2 2");
		strArr3.add("0 3");
		map.put(4, strArr3);
		map.put(6, strArr3);
		
		ArrayList<String> strArr4 = new ArrayList<>();
		strArr4.add("2 1");
		strArr4.add("5 2");
		strArr4.add("8 3");
		strArr4.add("0 4");
		map.put(1,strArr4);
		map.put(3,strArr4);
		
		
		int numLeft = 10;		
		int numRight = 12;		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				sb.append("L");
				numLeft=numbers[i];
				continue;
				
			}
			
			if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				sb.append("R");
				numRight = numbers[i]; 
				continue;
			}
			
			
			int distLeft = 0;
			ArrayList <String> mapTmp1 = map.get(numLeft);
			
			for(String strTmp : mapTmp1) {
				int pushNum = Integer.parseInt(strTmp.split(" ")[0]);
				if(numbers[i]==pushNum) {
					distLeft = Integer.parseInt(strTmp.split(" ")[1]);
				}
			}
			
			int distRight = 0;
			ArrayList <String> mapTmp2 = map.get(numRight);
			
			for(String strTmp : mapTmp2) {
				int pushNum = Integer.parseInt(strTmp.split(" ")[0]);
				if(numbers[i]==pushNum) {
					distRight = Integer.parseInt(strTmp.split(" ")[1]);
				}
			}
			
			if(distLeft > distRight) {
				sb.append("R");
				numRight = numbers[i];
			}else if(distLeft == distRight) {
				if(hand.equals("right")) {
					sb.append("R");
					numRight = numbers[i];
				}else {
					sb.append("L");
					numLeft = numbers[i];
				}
			}else {
				sb.append("L");
				numLeft = numbers[i];
			}
			
		}
		
		answer = sb.toString();
		System.out.println(answer);
		
	}

}
