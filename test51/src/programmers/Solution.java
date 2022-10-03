package programmers;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
	
	ArrayList<Integer> pnum (int n, int k){
		ArrayList<Integer> list = new ArrayList<>();
		
		while(n > 0) {
			list.add(n % k);
			n /= k;
		}
		
		Collections.reverse(list);
		return list; 
	}
	
	int isPrime(long n) {
		if (n <= 1) return 0;
		for(long i = 2; i*i <= n; i++) {
			if(n % i == 0) return 0;
		}
		return 1;
	}
	
	public int solution(int n,int k) {
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

		return answer;
	}


}
