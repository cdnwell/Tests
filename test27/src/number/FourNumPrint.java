package number;

import java.util.Scanner;

public class FourNumPrint {
	/*
	 * 16번.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		
		System.out.print("입력1 : ");
		arr[0]= sc.nextInt();
		sc.nextLine();
		System.out.print("입력2 : ");
		arr[1]= sc.nextInt();
		sc.nextLine();
		System.out.print("입력3 : ");
		arr[2]= sc.nextInt();
		sc.nextLine();
		System.out.print("입력4 : ");
		arr[3]= sc.nextInt();
		sc.nextLine();
		
		System.out.print("생성한 배열의 모든 요소 : ");
		for(int i=0;i<4;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int count = 0;		//홀수가 있는지 판별하기 위해 만든 변수
		for(int i=0;i<4;i++) {
			if(arr[i]%2==1) {
				count++;
			}//만일 홀수라면 count값을 추가한다.
			
		}
		
		if(count == 0) {
			System.out.println("이 배열에는 짝수만 있음!");
		}else {
			System.out.println("이 배열에는 홀수도 있음!");
		}
		
	}

}
