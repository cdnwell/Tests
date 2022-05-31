package workspace;

import java.util.Scanner;

public class SameArray02 {
	/*
	 * 22번. 순서가 같지 않은 배열 비교
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 A : ");
		int [] arrA = new int[5];
		int [] arrB = new int[5];
		
		for(int i = 0; i<5;i++) {
			arrA[i]=sc.nextInt();
		}
		
		System.out.print("배열 B : ");
		for(int i = 0 ; i<5;i++) {
			arrB[i]=sc.nextInt();
		}
		
		for(int i = 0; i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arrA[i]==arrB[j]) {
					arrA[i]=-1;		
					//배열은 양의 정수만 저장했기 때문에 음수를 저장하지 못한다.
					//그래서 -1을 저장해줘서 같은 배열인지 확인 가능하게 값을 넣어줌
					break;
					//값을 한개만 대응하게 만들기 위해 break로 int j가 있는 for문을 나간다.
				}
			}
		}
		
		int count = 0;
		
		for(int i =0;i<5;i++) {
			if(arrA[i]==-1)
				count++;
		}//arrA에 -1이 얼마나 대입되었는지 확인한다.
		//모든 값에 -1이 대입 되었다면 두 배열은 같다.(= count는 5이다.)
		
		if(count == 5) {
			System.out.println("두 배열은 같음");
		}else {
			System.out.println("두 배열은 다름");
		}
	}

}
