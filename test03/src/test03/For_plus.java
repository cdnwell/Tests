package test03;

import java.util.Scanner;

public class For_plus {

	public static void main(String[] args) {

		String str1;

		Scanner sc=new Scanner(System.in);
		
		str1=sc.nextLine();
		
		String[] words= str1.split("\\s");
		for(String wo : words ) {
			System.out.println(wo);
		}
		
		//확장 for 문 예제 1
		//for (TYPE 변수명 : 배열)
		//{ System.out.println(변수명) }
		//배열안의 데이터를 변수의 타입으로 처음 부터 배열의 끝까지 읽어 낸다. 
		//String, int 등 데이터 타입은 다 된다.
		
		//확장 for문 예제 2
		//for(int a : arr)
		//{ sum+=a; }
		//arr배열의 각 인덱스의 모든 int형 요소를 sum에 더한다.
		
	}

}
