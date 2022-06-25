package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPush {
	/*
	 * [키패드 모양]
	 * 	1 2 3
	 * 	4 5 6
	 * 	7 8 9
	 * 	* 0 #
	 * 
	 */
	// '#' = 35
	// '*' = 42
	// '0' = 48
	// '9' = 57
	
	// '*' = 10
	// '#' = 12
	public static void main(String[] args) {
		int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
//		String hand = "left";
		String answer = "";
		StringBuilder sb = new StringBuilder();
		HashMap<Integer,ArrayList<String>> map = new HashMap<>();
		
		// '2'
		ArrayList<String> strArr5 = new ArrayList<>();
		strArr5.add("2 0");
		strArr5.add("5 1");
		strArr5.add("8 2");
		strArr5.add("0 3");
		map.put(2, strArr5);
		
		// '5'
		ArrayList<String> strArr6 = new ArrayList<>();
		strArr6.add("2 1");
		strArr6.add("5 0");
		strArr6.add("8 1");
		strArr6.add("0 2");
		map.put(5, strArr6);
		
		// '8'
		ArrayList<String> strArr7 = new ArrayList<>();
		strArr7.add("2 2");
		strArr7.add("5 1");
		strArr7.add("8 0");
		strArr7.add("0 1");
		map.put(8, strArr7);
		
		// '0'
		ArrayList<String> strArr8 = new ArrayList<>();
		strArr8.add("2 3");
		strArr8.add("5 2");
		strArr8.add("8 1");
		strArr8.add("0 0");
		map.put(0, strArr8);
		
		// '*' = 10
//		String []num1 = {"0 1","8 2","5 3","2 4"};
		ArrayList<String> strArr1 = new ArrayList<>();
//		map.put(10, num1);
		strArr1.add("0 1");
		strArr1.add("8 2");
		strArr1.add("5 3");
		strArr1.add("2 4");
		map.put(10, strArr1);
		map.put(12, strArr1);
		
		// '7'
//		String []num2 = {"8 1","0 2","5 2","2 3"};
		ArrayList<String> strArr2 = new ArrayList<>();
		strArr2.add("8 1");
		strArr2.add("0 2");
		strArr2.add("5 2");
		strArr2.add("2 3");
		map.put(7,strArr2);
		map.put(9, strArr2);
		
		// '4'
//		String []num3 = {"5 1","8 2","2 2","0 3"};
		ArrayList<String> strArr3 = new ArrayList<>();
		strArr3.add("5 1");
		strArr3.add("8 2");
		strArr3.add("2 2");
		strArr3.add("0 3");
		map.put(4, strArr3);
		map.put(6, strArr3);
		
		// '1'
//		String []num4 = {"2 1","5 2","8 3","0 4"};
		ArrayList<String> strArr4 = new ArrayList<>();
		strArr4.add("2 1");
		strArr4.add("5 2");
		strArr4.add("8 3");
		strArr4.add("0 4");
		map.put(1,strArr4);
		map.put(3,strArr4);
		//값 모두 넣기 완료
		
		// 값 불러오기
		
//		for(int i=1;i<=10;i=i+3) {
//			System.out.println("key : "+i);
//			for(String str : map.get(i)) {
//				System.out.println(str);
//			}
//			System.out.println();
//		}
		
		
		int numLeft = 10;		// '*' 값 = 10
		int numRight = 12;		// '#' 값 = 12
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				//왼손을 누름
				//sb에 L을 추가해준다.
				sb.append("L");
				//비교할 왼손의 위치를 정해준다.
				numLeft=numbers[i];
//				System.out.println(numLeft+"L 0");
				continue;
				
			}
			
			if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				//오른손으로 누름
				//sb에 R을 추가해준다.
				sb.append("R");
				//비교할 오른손의 위치를 정해준다.
				numRight = numbers[i]; 
//				System.out.println(numRight+"R 0");
				continue;
			}
			
			
			//numbers 배열 이름
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
				//Left가 더 멀다. 그래서 right가 됨
				sb.append("R");
				//numRight 재정의
				numRight = numbers[i];
//				System.out.println(numbers[i]+"R"+ " r:"+distRight+" l:"+distLeft+" rightshand:"+numbers[i]);
//				continue;
			}else if(distLeft == distRight) {
				if(hand.equals("right")) {
					//오른손잡이 일 경우
					sb.append("R");
					numRight = numbers[i];
//					System.out.println(numbers[i]+"R"+ " r:"+distRight+" l:"+distLeft+" righthand:"+numbers[i]);
//					continue;
				}else {
					//왼손잡이 일 경우
					sb.append("L");
					numLeft = numbers[i];
//					System.out.println(numbers[i]+"L"+ " r:"+distRight+" l:"+distLeft+" lefthand:"+numbers[i]);
//					continue;
				}
			}else {
				//Right가 더 멀다. 그래서 left가 됨
				sb.append("L");
				numLeft = numbers[i];
//				System.out.println(numbers[i]+"L"+ " r:"+distRight+" l:"+distLeft+" lefthand:"+numbers[i]);
//				continue;
			}
			
		}
		
		answer = sb.toString();
		System.out.println(answer);
		
	}

}
