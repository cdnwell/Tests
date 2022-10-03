package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeNumberEaChecker {
	
	/*
	 * 1. 정수 n을 k진법으로 바꿔 주는 메소드
	 */
	static ArrayList<Integer> pnum (int n, int k){
		ArrayList<Integer> list = new ArrayList<>();
		
		while(n > 0) {
			list.add(n % k);
			n /= k;
		}
		
		Collections.reverse(list);
		return list; 
	}
	
	/*
	 * 2. 소수 판별하기
	 */
	static int isPrime(long n) {
		if (n <= 1) return 0;
		for(long i = 2; i*i <= n; i++) {
			if(n % i == 0) return 0;
		}
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		
		ArrayList<Integer> list = pnum(n,k);
		long cur = 0;
		int answer = 0;
		
		for(int num : list) {
			if(num == 0) {
				answer += isPrime(cur);
				cur = 0;
			}
			cur = cur * 10 + num;
		}
		
		answer += isPrime(cur);

		System.out.println(answer);
	}

}
