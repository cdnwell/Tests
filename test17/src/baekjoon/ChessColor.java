package baekjoon;

import java.util.Scanner;
	/*
	 * baekjoon - 1018번 문제
	 * 체스판 다시 칠하기
	 * 
	 */
public class ChessColor {
	public static boolean [][]arr=null;
	public static int min = 64;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String []tmp = str.split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		
		arr = new boolean[N][M]; 
		//arr배열을 전역변수로 선언해 어디서든 접근 가능하게 만들어줌
		
		for(int i=0;i<N;i++) {
			String chessPlate = sc.next();
			for(int j=0;j<M;j++) {
				if(chessPlate.charAt(j) == 'W') {
					arr[i][j] = true;
					//W면 true
				}else {
					arr[i][j] = false;
					//B면 false
				}
			}
		}
		
		int N_row = N - 7;
		int M_col = M - 7;
		for(int i=0;i<N_row;i++) {
			for(int j=0;j<M_col;j++) {
				find(i,j);
			}
		}
		//N*M에 몇개의 8*8정사각형이 존재할 수 있는지 계산
		
		System.out.println(min);
		
	}//main method end
	
	public static void find(int x, int y) {
		int max_x=x+8;
		int max_y=y+8;
		int count=0;
		
		boolean TF = arr[x][y];
		//첫 번째 칸의 색
		
		for(int i=x;i<max_x;i++) {
			for(int j=y;j<max_y;j++) {
				if(arr[i][j] != TF) {
					count++;
				}
				TF = !TF;	
			}
			TF = !TF;
			//판의 행의 끝의 색과 다음 행의 처음 색은 같다.
		}
		
		count = Math.min(count, 64-count);
		//첫 번째 칸의 색이 달랐을 경우, 경우의 수 64-count의 값이 나옴
		
		min = Math.min(min, count);
		//min의 값이 64로 초기화된 이유는 잘 모르겠음
	}
	
}
