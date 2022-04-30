package baekjoon;

import java.util.Scanner;

public class BaseballSeat {
	/*
	 * baekjoon - 14652번 문제
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
		
		//숫자 범위 체크
		
		if(N<1 || M<1) {
			return;
		}
		
		if(M>30000) {
			return;
		}
		
		if(K<0 && K > N*M-1 ) {
			return;
		}
		
		//숫자 범위 체크 완료
		
		//배열에 자리번호 넣기
		
		int [][] arrSeat = new int[N][M];
		for(int i=0;i<N;i++) {
//			System.out.println(N+"열:");
			for(int j=0;j<M;j++) {
				arrSeat[i][j]=i*4+j;
//				System.out.print(arrSeat[i][j]);
			}
//			System.out.println();
		}
		
		//배열에 자리번호 넣기 완료
		
		//배열에 있는 번호랑 가지고있는 자리번호(K) 비교해서 자리 찾기
		
		int seatN=0,seatM=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arrSeat[i][j]==K) {
					seatN=i;
					seatM=j;
				}
			}
		}
		
		//자리 찾기 완료
		
		//자리 출력
		
		System.out.println(seatN+" "+seatM);
		
	}

}
