package bj11576;

import java.util.Scanner;

public class NotationConvert {
	/*
	 * baekjoon - 11576번 문제 
	 * A진법의 수를 B진법의 수로 변환하세요.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		int m;
		String[] str_tmp = sc.nextLine().split("\\s");
		A = Integer.parseInt(str_tmp[0]);
		B = Integer.parseInt(str_tmp[1]);
		m = sc.nextInt();
		sc.nextLine();
		double [] numArray = new double[m];
		str_tmp = sc.nextLine().split("\\s");
		for(int i=0;i<m;i++) {
			numArray[i] = Double.parseDouble(str_tmp[i]);
		}
		
		double sum = 0;
		
		for(int i=0;i<m;i++) {
			sum += numArray[i] * Math.pow( A, numArray.length-(i+1));
		}//A수 10진법으로 바꾸기
		
		int disNum = -1;
		int pos;
		for(pos=1; disNum != 0; pos++) {
			disNum = (int)(sum / Math.pow(B, pos));
		}

		pos =  pos - 1;
		
		//pos는 B진법의 최대 자리수
		
		double []numArray02 = new double[pos];
		double tempNum = sum;
		for(int i=0; i<pos ; i++ ) {
			numArray02[i] = tempNum / Math.pow(B, pos-i-1);
			tempNum = tempNum % Math.pow(B, pos-i-1);
		}//10진법으로 나타낸 A를 B진법으로 바꾼다. 
		
		for(int i =0; i<pos ; i++) {
			System.out.print((int)numArray02[i] + " ");
		}//출력
	}

}
