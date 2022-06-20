package test;

import java.util.Scanner;

public class BookSeat {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char[][] seatNo = new char[9][9];
      int seatMax = 81;
      char alp = 'A';

      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            seatNo[i][j] = '0'; 
         }
      }

      while (true) {
         System.out.println("예약 현황 - 잔여좌석수 : " + seatMax);
         System.out.println("--------------------");
         System.out.print("  ");
         for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
         }
         System.out.println();

         for (int i = 0; i < 9; i++) {
            System.out.print((char) (alp + i) + " ");
            for (int j = 0; j < 9; j++) {
               System.out.print(seatNo[i][j] + " ");
            }
            System.out.println();
         }

         System.out.println("--------------------");
         System.out.print("예약하시겠습니까?(Y 또는 N) ");
         String check = sc.nextLine();

         if(!check.equals("Y")) continue;
         
         System.out.print("예약할 좌석번호 입력 : ");
         String seatNoIn = sc.nextLine();

         char[] seatNoArr = seatNoIn.toCharArray();

         if ((seatNoArr[0] < 'A' || seatNoArr[0] > 'Z') || (seatNoArr[1] < '1' || seatNoArr[1] > '9')) {
            System.out.println("좌석번호가 범위를 벗어납니다.");
            continue;
         }
         
         int[] seatInt = new int[2];

         seatInt[0] = seatNoArr[0] - 'A';
         seatInt[1] = seatNoArr[1] - '1';
         
         if(seatNo[seatInt[0]][seatInt[1]] == '0') {
        	 seatNo[seatInt[0]][seatInt[1]] = '.';
        	 System.out.println("예약되었습니다.");
        	 seatMax--;
         }else {
            System.out.println("이미 예약된 자리입니다.");
         }

      }

   }

}