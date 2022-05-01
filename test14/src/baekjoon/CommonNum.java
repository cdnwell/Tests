package baekjoon;

import java.util.Scanner;

public class CommonNum {
	/*
	 * baekjoon - 2609번 문제
	 * 최대공약수와 최소공배수 문제
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		String [] str_tmp=str.split("\\s");
		int x=Integer.parseInt(str_tmp[0]);
		int y=Integer.parseInt(str_tmp[1]);
		
		int max = 0;
		int min = 1;
		
		for(int i=1;i<10000;i++) {
			if(i%x ==0 && i%y==0) {
				max=i;
				break;
				
			}
		}//최소공배수 구하기
		
		for(int i=1;i<=x||i<=y;i++) {
			if(x%i==0 && y%i==0) {
				min =i;
			}
		}//최대공약수 구하기
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
