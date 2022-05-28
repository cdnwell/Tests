package numberchange;

import java.util.Scanner;

public class NumberChange {
	/*
	 * 정수 하나를 입력받아 아래와 같이 '뒤집은' 숫자를 출력하고
     *   각 자릿수의 합을 출력하는 코드.
     *   (실행결과) 정수 입력 : 34824(엔터)
     *            뒤집으면 : 42843             
     *            각 자릿수의 합 : 21 // = 4 +2 + 8 + 4 + 3 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String num = sc.nextLine();		//정수를 String으로 받아오기
		
		int arrLength = num.length();	//배열의 길이를 구하기 위해 선언한 변수 
		int[] arr = new int[arrLength];	//정수의 각 자리를 받아올 배열 arr
		
		for(int i=0;i<arrLength;i++) {
			arr[i]=num.charAt(i)-'0';
		}//charAt메서드로 num(String)을 배열의 값에 들어가기 좋게 만들어줌
		//charAt(i)는 num의 i번째 숫자를 의미
		//arr[0]은 숫자의 첫번째 자리를 의미, arr[1]은 숫자의 두번째 자리... 이어짐
		
		System.out.print("뒤집으면 : ");
		for(int i=arrLength-1;i>=0;i--) {
			System.out.print(arr[i]);
		}//숫자를 맨뒷자리부터 순서대로 읽어옴
		
		System.out.println();
		
		System.out.print("각 자리수의 합 : ");
		int sum = 0;		//숫자의 합을 넣을 int형 변수
		
		for(int i =0;i<arrLength;i++) {
			sum = sum + arr[i];
		}//숫자를 첫번째자리부터 끝자리까지 넣어주기
		System.out.print(sum);		//계산이 끝나고 자리수의 합을 출력
		
	}

}
