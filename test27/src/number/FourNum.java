package number;

import java.util.Scanner;

public class FourNum {
	/*
	 * 15번. 4개의 정수를 입력받아서, 배열에 담은 후 (1) 배열의 전체 내용 출력
	 * (2) 짝수만 출력하는 코드를 작성.
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
		}//생성한 배열의 모든 값을 처음부터 끝까지 출력한다.
		System.out.println();
		
		System.out.print("생성한 배열의 요소들 중 짝수 : ");
		for(int i=0;i<4;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}//만일 짝수라면 arr[i]를 출력한다.
			
		}//배열 요소 4개의 처음부터 끝까지 확인한다.
		
	}

}
