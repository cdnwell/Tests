package test;

import java.util.Scanner;

public class BookSystem2D {
	/*
	 * 27번. 2차원 좌석 예약
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] seatNo = new char[9][9];
		// 예약(.)을 표시하기위해 char로 2차원배열 배열 9개씩 만들어주기
		int seatMax = 81;
		char alp = 'A';
		
		for (int i = 0; i < 9; i++) {
			for(int j =0;j<9;j++) {
				seatNo[i][j] = '0';
			}
			
		} // seatNo 배열의 모든 요소를 0으로 초기화
			// char형이기 때문에 '0' <- '를 붙임
		while (true) {
			System.out.println("예약현황 - 잔여좌석수 : " + seatMax);
			System.out.println("--------------------");
			System.out.print("  ");
			for (int i = 1; i < 10; i++) {
				System.out.print(i + " ");
			} // 번호만 따로 출력
			System.out.println();
			//줄을 바꾸기 위해 써준 명령문
			
			for (int i = 0; i < 9; i++) {
				System.out.print((char)(alp+i)+" ");
				for(int j=0; j<9;j++) {
					System.out.print(seatNo[i][j] + " ");
				}
				System.out.println();
			} // 좌석배열이 예약되었는지 출력
			System.out.println("--------------------");
			System.out.print("예약하시겠습니까? (Y또는 N) ");
			String check = sc.nextLine();
			// 예약할 값을 받기 위해 check 변수 선언
			
			System.out.print("예약할 좌석번호 입력 : ");
			String seatNoIn = sc.nextLine();
			// 좌석번호가 예약되어잇는지 확인하기 위해 생성한 변수 
			// 영어와 숫자가 같이 있어서 String으로 받아준다.
			
			char []seatNoArr = seatNoIn.toCharArray();
			//toCharArray 메서드를 써서 입력받은 seatNoIn을 char형 타입으로 바꿔서
			//배열에 각각 넣어준다.
			//영어와 숫자로 바꿔주기 위해 char형 배열로 받아준다.

			if (seatNoArr[0] < 'A' || seatNoArr[1] > 'I') {
				System.out.println("좌석번호가 범위를 벗어납니다.");
				continue;
				// while문의 첫번째로 다시 돌아가기
			}
			//좌석이 지정된 영어를 벗어나는지 확인한다.
			//좌석이 범위를 벗어나면 while 첫번째로 돌아가므로 else문을 설정하지 않는다.
			
			int [] seatInt = new int[2];
			//입력받은 좌석번호를 배열에 넣기 위해 변환하기 위해 배열을 선언해서
			//char 형으로 받은 영어 한자리와 숫자 한자리를 seatInt[0]와 seatInt[1]에 각각 넣어준다.
			//이 값으로 배열에 접근해 체크해준다.
			
			seatInt[0]=seatNoArr[0]-'A';
			
			if (seatNoArr[1] < '1' || seatNoArr[1] > '9') {
				System.out.println("좌석번호가 범위를 벗어납니다.");
				continue;
				// while문의 첫번째로 다시 돌아가기
			}
			
			seatInt[1] = seatNoArr[1] - '1';
			// index값을 맞춰주기 위해 1을 빼기

			if (seatNo[seatInt[0]][seatInt[1]] == '0' && check.equals("Y")) {
				seatNo[seatInt[0]][seatInt[1]] = '.';
				// 좌석 예약된 상태로 바꿔줌
				System.out.println("예약되었습니다.");
				seatMax--;
			}else if(seatNo[seatInt[0]][seatInt[1]] == '.' && check.equals("Y")) {
				System.out.println("이미 예약된 자리입니다.");
			}

		}
		
	}

}
