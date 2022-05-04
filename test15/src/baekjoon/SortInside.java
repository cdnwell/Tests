package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortInside {
	/*
	 * baekjoon - 1427번 문제
	 * 압력받은 수의 각자리 내림차순 정리
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n>1000000000) {
			System.out.println("n의 값이 범위를 벗어났습니다.");
			return;
		}
		
		String str =String.valueOf(n);
		int [] arr = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i) -'0';
		}//배열에 각자리 숫자를 넣어준다.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}//ArrayList list에 넣어준다.
		
		Collections.sort(list);//오름차순정렬
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}//뒤에서부터 내림차순으로 출력
		
	}

}
