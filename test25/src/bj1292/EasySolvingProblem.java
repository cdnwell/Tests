package bj1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasySolvingProblem {
	/*
	 * baekjoon - 1292번 문제 
	 * 쉽게 푸는 문제, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 ....
	 * 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] strTmp = br.readLine().split("\\s");
		int A = Integer.parseInt(strTmp[0]);
		int B = Integer.parseInt(strTmp[1]);
		
		if(A < 1 || A > B || B > 1000) {
			System.out.println("A 혹은 B의 값의 범위가 잘못되었습니다.");
			return;
		}
		
		int [] number = new int[1001];
		number[0]=0;
		
		int j = 1;
		int count =1;
		
		for(int i =1; i<=1000;i++) {
			number[i] = j;
			if(count == j) {
				count = 0;
				j++;
			}
			count++;
		}
		
		int sum = 0;
		
		for(int i = A;i<=B;i++) {
			sum += number[i];
		}
		
		System.out.println(sum);
	}

}
