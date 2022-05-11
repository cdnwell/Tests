package baekjoon;

import java.util.Scanner;

public class RoomNumber {
	/*
	 * baekjoon - 1475�� ���� �� ��ȣ
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 1000000 || num < 0) {
			System.out.println("�� ��ȣ�� ������ ������ϴ�.");
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
			
			//6�� ���� 2��
			//6�� 9�� �ϳ��� �迭�� �ִ´�.
			
		}//�� ������ �� ���� �ʱ�ȭ
		
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
		}// �� �ڸ����� ���ֱ�
		
		//��� �ö�ƽ ��Ʈ �ʿ����� ����ϱ�
		
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
			
		}//for �� ��
		
		System.out.println(plasNum);
		
	}

}
