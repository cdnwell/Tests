package baekjoon;

import java.util.Scanner;

public class RockGame {
	/*
	 * baekjoon - 9655번 문제 
	 * 돌 게임
	 * SK가 게임을 먼저 시작한다.
	 * 게임의 참가자 CY, SK는 돌을 가져간다.
	 * 가져갈 수 있는 돌의 수는 1개 혹은 3개 이다.
	 * 돌의 갯수가 n일때 짝수이면 뒤에 가져가는 CY가 이기고,
	 * 홀수이면 SK가 이긴다.
	 * 게임은 최선의 방법으로 이루어졌다고 가정된다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >1000 || num <1) {
			System.out.println("숫자가 범위를 벗어납니다.");
			return;
		}
		
		if(num%2==0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
	}

}
