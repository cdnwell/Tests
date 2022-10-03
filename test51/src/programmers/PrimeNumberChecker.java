package programmers;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, chk = 0;
		System.out.print("숫자 입력 : ");
		number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			if(number % i == 0)
				chk++;
			if(chk > 2) {
				System.out.println(number + "는 소수가 아닙니다.");
				return;
			}
		}
		
		System.out.println(number + "는 소수 입니다.");
	}

}
