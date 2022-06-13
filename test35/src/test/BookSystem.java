package test;

import java.util.Scanner;

public class BookSystem {
	/*
	 * 25번 좌석예약시스템 예약현황 - 잔여좌석수 : 10 
	 * -------------------- 
	 * 1 2 3 4 5 6 7 8 9 10(좌석번호)
	 * 0 0 0 0 0 0 0 0 0 0 (예약상태) 
	 * -------------------- 
	 * 예약하시겠습니까? (Y또는 N) 
	 * 예약할 좌석번호 입력 :
	 * 예약되었습니다. / 이미 예약된 자리입니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] seatNo = new char[10];
		// 예약(.)을 표시하기위해 char로 배열 10개 만들어주기
		int seatMax = 10;

		for (int i = 0; i < 10; i++) {
			seatNo[i] = '0';
		} // seatNo 배열의 모든 요소를 0으로 초기화
			// char형이기 때문에 '0' <- '를 붙임
		while (true) {
			System.out.println("예약현황 - 잔여좌석수 : " + seatMax);
			System.out.println("--------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			} // 번호만 따로 출력
			System.out.println("(좌석번호)");
			for (int i = 0; i < 10; i++) {
				System.out.print(seatNo[i] + " ");
			} // 좌석배열이 예약되었는지 출력

			System.out.println("(예약상태)");
			System.out.print("예약하시겠습니까? (Y또는 N) ");
			String check = sc.nextLine();
			// 예약할 값을 받기 위해 check 변수 선언
			
			System.out.print("예약할 좌석번호 입력 : ");
			int seatNoIn = sc.nextInt();
			sc.nextLine();
			// 좌석번호가 예약되어잇는지 확인하기 위해 생성한 변수

			if (seatNoIn < 1 || seatNoIn > 10) {
				System.out.println("좌석번호가 범위를 벗어납니다.");
				continue;
				// while문의 첫번째로 다시 돌아가기
			} else {
				seatNoIn = seatNoIn - 1;
				// index값을 맞춰주기 위해 1을 빼기
			}

			if (seatNo[seatNoIn] == '0' && check.equals("Y")) {
				seatNo[seatNoIn] = '.';
				// 좌석 예약된 상태로 바꿔줌
				System.out.println("예약되었습니다.");
				seatMax--;
			} else if(seatNo[seatNoIn] == '.' && check.equals("Y")) {
				System.out.println("이미 예약된 자리입니다.");
			}

		}
	}

}
