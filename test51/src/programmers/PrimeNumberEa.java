package programmers;

import java.util.ArrayList;

public class PrimeNumberEa {

	public static void main(String[] args) {
		// 1 <= n <= 1000000
		int n = 110011;
		int src = n;
		// 3 <= k <= 10
		int k = 10;
		
		int answer = -1;
		StringBuilder sb = new StringBuilder();
		
		// 1. 정수n k진법으로 변환하기
		while(n > 0) {
			sb.append(n % k);
			
			n /= k;
		}
		
		// k진법으로 변환된 n
		String k_num = sb.reverse().toString();
		
		
		// 2. n(k진법) 0을 기준으로 숫자 나누기
//		String[] k_num_arr = k_num.split("0");
		
		char[] k_num_ch = k_num.toCharArray();
		
		ArrayList<String> str_list = new ArrayList<>();
		StringBuilder sb_tmp = new StringBuilder();
		int sb_pass = 0;
		
		for(int i =0;i<k_num_ch.length;i++) {
			if(k_num_ch[i] != '0') {
				sb_tmp.append(k_num_ch[i]);
				sb_pass++;
			} else {
				if(sb_pass != 0) {
					str_list.add(sb_tmp.toString());
					sb_tmp.delete(0, sb_tmp.length());
					sb_pass = 0;
				}
			}
			
			if(i == k_num_ch.length-1) {
				if(sb_pass != 0)
					str_list.add(sb_tmp.toString());
			}
		}
		
		System.out.println("forEach문 : ");
		for(String s : str_list) {
			System.out.println(s);
		}
		System.out.println("-----------");
		
		//-----------------------------//
		
		
		//소수를 담을 int형 배열 생성
		ArrayList<Integer> list = new ArrayList<>();
		
		for(String s : str_list) {
			int tmp = Integer.parseInt(s);
			int count = 0;
			
			if(tmp == 1) continue;
			
			for(int i=2;i*i<=tmp;i++) {
				if(tmp % i == 0) count++;
			}
//			System.out.println(tmp + " : " + count +"번");
			
			if(count == 0) {
				list.add(tmp);
			}
		}
		
		System.out.println("after sort : ");
		for(int i : list) {
			System.out.println(i);
		}
		
		answer = list.size();
		
		System.out.println("result(ea) : ");
		System.out.println(answer);
		
//		System.out.println(k+"진법("+src+") : " + sb.reverse());
		
//		System.out.println(answer);
	}

}
