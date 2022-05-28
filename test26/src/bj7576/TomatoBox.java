package bj7576;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TomatoBox {
	/*
	 * baekjoon - 7576번 문제 
	 * M * N 상자에 1,익은토마토 0,익지않은토마토, -1토마토없음 의 숫자가 들어간다.
	 * 토마토는 4방향으로 영향을 주며 하루면 익는다.
	 * 
	 */
	static int M;
	static int N;
	
	static int[] dx = { -1, 1, 0 , 0};
	static int[] dy = { 0, 0, -1, 1};
	
	static int[][] board;
	
	static Queue<tomato> que;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); 	//가로
		N = sc.nextInt();	//세로
		
		board = new int[N][M];
		
		que = new LinkedList<tomato>();
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < M ; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1)
					que.add(new tomato(i,j));
			}
		}
		
	}

}

class tomato{
	private int x;
	private int y;

	public tomato(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
