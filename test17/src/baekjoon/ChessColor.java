package baekjoon;

import java.util.Scanner;
	/*
	 * baekjoon - 1018�� ����
	 * ü���� �ٽ� ĥ�ϱ�
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
		//arr�迭�� ���������� ������ ��𼭵� ���� �����ϰ� �������
		
		for(int i=0;i<N;i++) {
			String chessPlate = sc.next();
			for(int j=0;j<M;j++) {
				if(chessPlate.charAt(j) == 'W') {
					arr[i][j] = true;
					//W�� true
				}else {
					arr[i][j] = false;
					//B�� false
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
		//N*M�� ��� 8*8���簢���� ������ �� �ִ��� ���
		
		System.out.println(min);
		
	}//main method end
	
	public static void find(int x, int y) {
		int max_x=x+8;
		int max_y=y+8;
		int count=0;
		
		boolean TF = arr[x][y];
		//ù ��° ĭ�� ��
		
		for(int i=x;i<max_x;i++) {
			for(int j=y;j<max_y;j++) {
				if(arr[i][j] != TF) {
					count++;
				}
				TF = !TF;	
			}
			TF = !TF;
			//���� ���� ���� ���� ���� ���� ó�� ���� ����.
		}
		
		count = Math.min(count, 64-count);
		//ù ��° ĭ�� ���� �޶��� ���, ����� �� 64-count�� ���� ����
		
		min = Math.min(min, count);
		//min�� ���� 64�� �ʱ�ȭ�� ������ �� �𸣰���
	}
	
}
