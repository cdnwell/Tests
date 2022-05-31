package workspace;

import java.util.Scanner;

public class SameArray {
	/*
	 * 21번 배열 비교
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 A의 값 : ");
		int []arrA = new int [5];
		int []arrB = new int [5];
		
		for(int i=0;i<5;i++) {
			arrA[i]=sc.nextInt();
		}//배열 A의 값을 띄어쓰기를 기준으로 받아서 넣어준다.
		//엔터를 치면 값이 다 들어감, 값은 5개 넣어야 한다.
		
		System.out.print("배열 B의 값 : ");
		for(int i=0;i<5;i++) {
			arrB[i]=sc.nextInt();
		}//배열 B의 값을 띄어쓰기를 기준으로 받아서 넣어준다.
		//위와 마찬가지
		
		for(int i = 0; i< arrA.length;i++) {
			if(arrA[i]!=arrB[i]) {
				System.out.println("두 배열은 다름");
				break;
				//두 배열의 인덱스 값이 같은 경우만 비교한다.
				//하나라도 다르면 "두 배열은 다름" 문장이 실행되고 for문에서 빠져나온다. 
			}
			if(i == arrA.length-1) {
				System.out.println("두 배열은 같음");
				//위의 조건문이 실행되지 않으면 맨 마지막의 i값일 때의 조건문이다. 
				//"두 배열은 다름"의 조건식이 실행되지 않았으므로 "두 배열은 같음" 
			}
		}
		
	}

}
