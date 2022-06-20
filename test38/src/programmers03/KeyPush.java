package programmers03;

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
		HashMap<Integer,String[]> map = new HashMap<>();
		
		// '*' = 10
		String []num1 = {"0 1","8 2","5 3","2 4"};
		map.put(10, num1);
		
		// '7'
		String []num2 = {"8 1","0 2","5 2","2 3"};
		map.put(7,num2);
		
		// '4'
		String []num3 = {"5 1","8 2","2 2","0 3"};
		map.put(4, num3);
		
		// '1'
		String []num4 = {"2 1","5 2","8 3","0 4"};
		map.put(1,num4);
		//값 모두 넣기 완료
		
		
		for(int i=1;i<=12;i=i+3) {
			map.put(i+2, map.get(i));
		}//대칭되는 값 자동으로 넣기
		//좌 우 값 모두 넣음
		
		
		boolean firstLeft = false;
		boolean firstRight = false;
		int numLeft = 10;		// '*' 값 = 10
		int numRight = 12;		// '#' 값 = 12
		for(int i=0;i<numbers.length;i++) {
			int cmpLeft = 0;		//비교할 왼쪽 손 값
			int cmpRight = 0;		//비교할 오른쪽 손 값
			
			
			//numbers 배열 이름
			if(firstLeft) {
				
			}else {//왼손 처음 사용할 경우
				firstLeft= true;
			}
			
			if(firstRight) {
				
			}else {//오른손 처음 사용할 경우
				
				firstRight= true;
			}
		}
		
	}

}
