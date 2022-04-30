package baekjoon;

import java.util.Scanner;

public class BaseballSeat {
	/*
	 * baekjoon - 14652�� ����
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		int N,M,K;
		
		
		String []temp_split = temp.split("\\s");

		N=Integer.parseInt(temp_split[0]);
		M=Integer.parseInt(temp_split[1]);
		K=Integer.parseInt(temp_split[2]);
		
		//���� ���� üũ
		
		if(N<1 || M<1) {
			return;
		}
		
		if(M>30000) {
			return;
		}
		
		if(K<0 && K > N*M-1 ) {
			return;
		}
		
		//���� ���� üũ �Ϸ�
		
		//�迭�� �ڸ���ȣ �ֱ�
		
		int [][] arrSeat = new int[N][M];
		for(int i=0;i<N;i++) {
//			System.out.println(N+"��:");
			for(int j=0;j<M;j++) {
				arrSeat[i][j]=i*4+j;
//				System.out.print(arrSeat[i][j]);
			}
//			System.out.println();
		}
		
		//�迭�� �ڸ���ȣ �ֱ� �Ϸ�
		
		//�迭�� �ִ� ��ȣ�� �������ִ� �ڸ���ȣ(K) ���ؼ� �ڸ� ã��
		
		int seatN=0,seatM=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arrSeat[i][j]==K) {
					seatN=i;
					seatM=j;
				}
			}
		}
		
		//�ڸ� ã�� �Ϸ�
		
		//�ڸ� ���
		
		System.out.println(seatN+" "+seatM);
		
	}

}
