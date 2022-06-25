package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPushTest {

	public static void main(String[] args) {

		int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
//		String hand = "left";
		String answer = "";
		StringBuilder sb = new StringBuilder();
		HashMap<Integer,ArrayList<String>> map = new HashMap<>();
		ArrayList<String> strArr = new ArrayList<>();
		
		// '*' = 10
//		String []num1 = {"0 1","8 2","5 3","2 4"};
//		map.put(10, num1);
		strArr.add("0 1");
		strArr.add("8 2");
		strArr.add("5 3");
		strArr.add("2 4");
		map.put(10, strArr);
		
		// '7'
//		String []num2 = {"8 1","0 2","5 2","2 3"};
		strArr.clear();
		strArr.add("8 1");
		strArr.add("0 2");
		strArr.add("5 2");
		strArr.add("2 3");
		map.put(7,strArr);
		
		// '4'
//		String []num3 = {"5 1","8 2","2 2","0 3"};
		strArr.clear();
		strArr.add("5 1");
		strArr.add("8 2");
		strArr.add("2 2");
		strArr.add("0 3");
		map.put(4, strArr);
		
		// '1'
//		String []num4 = {"2 1","5 2","8 3","0 4"};
		strArr.clear();
		strArr.add("2 1");
		strArr.add("5 2");
		strArr.add("8 3");
		strArr.add("0 4");
		map.put(1,strArr);
		//값 모두 넣기 완료
		
		// 값 불러오기
		
		for(int i=1;i<=10;i=i+3) {
			System.out.println("key : "+i);
			for(String str : map.get(i)) {
				System.out.println(str);
			}
			System.out.println();
		}
	}

}
