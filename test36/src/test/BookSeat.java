package test;

import java.util.Scanner;

public class BookSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] seatNo = new char[9][9];
//		int seatMax = 99;
		//좌석수는 9*9 이므로 81개
		int seatMax = 81;
		char alp = 'A';

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
//	            seatNo[n1][j] = 0;
				seatNo[i][j] = '0'; // char에서 숫자 0은 문자 '0'과 다름
			}
		} // 이중 for문 seatNo 초기화하기 위해 설정한 것으로 while문 전에 닫아주어야 함

		while (true) {
			System.out.println("예약 현황 - 작여좌석수 : " + seatMax);
			System.out.println("------------------");
			System.out.print("  ");// println으로 출력을 하면 줄바꿈이 되기 때문에 print로 출력
			for (int i = 1; i < 10; i++) {
				System.out.print(i + " ");// 뒤에 공백 추가를 위해 ""에서 " "로 변경
			}
			System.out.println();

			for (int i = 0; i < 9; i++) {
				System.out.print((char) (alp + i) + " "); // println은 출력후 줄을 바꾸므로 print로 변경
				for (int j = 0; j < 9; j++) {
					System.out.print(seatNo[i][j] + " "); // println은 출력후 줄을 바꾸므로 print로 변경
				}
				System.out.println();
			}

			System.out.println("----------------");
			System.out.print("예약하시겠습니까?(Y 또는 N) "); //글자 뒤에 값을 받기 위해 println에서 print로 변경 
			String check = sc.nextLine();

			System.out.print("예약할 좌석번호 입력 : ");
			String seatNoIn = sc.nextLine(); // I를 L로 바꿔씀

//	      String seatNoIn; // seatNoIn을 이미 변수로 선언했기 때문에 중복해서 선언
			// 하면 안됨
			char[] seatNoArr = seatNoIn.toCharArray();

			if (seatNoArr[0] < 'A' || seatNoArr[0] > 'Z') {// seatNoArr 배열은 예약할 좌석번호를
				// 받은 String을 char형으로 담은 배열이므로 seatNoArr[0]과 seatNoArr[1]에만 값이 들어감
				// 영어 비교를 위한 것이므로 첫번째 글자를 나타내는 seatNoArr[0]의 값을 비교
				System.out.println("좌석번호가 범위를 벗어납니다.");
				continue;
			}
			int[] seatInt = new int[2];

//	      seatint[0]=seatNoArr[0]='A';

			// seatInt의 배열의 값은 seatNo 배열의 값에 접근하기 위한 값이므로 첫번째 배열 요소인 seatInt[0]에
			// 입력받은 값 중 앞 글자인 seatNoArr[0]을 저장함
			seatInt[0] = seatNoArr[0] - 'A';
			// seatNoArr[0]의 영어 단어에서 'A'를 빼주면 알파벳 ABCD...에서 아스키 코드 값인 숫자를 빼줌
			// 만일 seatNoArr[0]의 값이 A라면 'A'를 뺴주면 0이됨 B라면 'A'를 뺴주면 1이 됨

			if (seatNoArr[1] < '1' || seatNoArr[1] > '9') {
				System.out.println("좌석번호가 범위를 벗어납니다");
				continue;
			}
			
			seatInt[1] = seatNoArr[1] - '1';
			
			if (seatNo[seatInt[0]][seatInt[1]] == '0' && check.equals("Y")) {
				
				seatNo[seatInt[0]][seatInt[1]] = '.';
				System.out.println("예약되었습니다.");
				seatMax--;
				
			}else if(seatNo[seatInt[0]][seatInt[1]] == '.' && check.equals("Y")) {
				
				System.out.println("이미 예약된 자리입니다.");
				
			}

		}

	}

}
