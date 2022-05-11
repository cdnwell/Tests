package baekjoon;

import java.util.Scanner;

public class RoomNumber {
	/*
	 * baekjoon - 1475번 문제 방 번호
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 1000000 || num < 0) {
			System.out.println("방 번호가 범위를 벗어났습니다.");
			return;
		}
		
		int [][]roomNum =new int[6][9];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				if(j==9) {
					roomNum[i][6]++;
					continue;
				}
				roomNum[i][j]++;
			}
			
			//6의 갯수 2개
			//6과 9를 하나의 배열에 넣는다.
			
		}//각 갯수를 한 개씩 초기화
		
		String str = String.valueOf(num);
		int[] numBox = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			numBox[i] = str.charAt(i)-'0';
		}
		
		for(int i =0;i<numBox.length;i++) {
			if(numBox[i]==9) {
				numBox[i]=6;
			}
		}
		
		
		for(int l=0;l<numBox.length;l++) {
			for(int i=0;i<6;i++) {
				for(int j=0;j<9;j++) {
					if(numBox[l]==j) {
						if(roomNum[i][j]>0) {
							roomNum[i][j]--;
							numBox[l]=-1;
						}
					}
				}

			}
		}// 각 자리에서 빼주기
		
		//몇개의 플라스틱 세트 필요할지 계산하기
		
		int count;
		int plasNum = 6;
		
		for(int i=0;i<6;i++) {
			count = 0;
			for(int j=0;j<9;j++) {
				if(j==6 && roomNum[i][6]==2) {
					count++;
					continue;
				}else if(j==6 && roomNum[i][6]==1 || roomNum[i][6] ==0) {
					continue;
				}
				
				if(roomNum[i][j]==1) {
					count++;
				}
			}
			if(count == 9) {
				plasNum = i;
				break;
			}
			
		}//for 문 끝
		
		System.out.println(plasNum);
		
	}

}
