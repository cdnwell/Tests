package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EasySolvingProblem {
	/*
	 * baekjoon - 1292번 문제 
	 * 쉽게 푸는 문제, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 ....
	 * 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strTmp = br.readLine().split("\\s");
		int A, B;
		A = Integer.parseInt(strTmp[0]);
		B = Integer.parseInt(strTmp[1]);

		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(0);
		arr.add(1);
		int j = 1;
		
		while(true) {
			arr.add(j+arr.get(j));
			if(arr.get(j)>1000) {
				break;
			}
			j++;
		}
		
		int AStart = 0;
		int BStart = 0;
		
		int Length = arr.size();
		
		for (int i = 1; i < Length-1; i++) {

			if (A >= arr.get(i) && A < arr.get(i+1)) {
				AStart = i;
			}
			if (B >= arr.get(i) && B < arr.get(i+1)) {
				BStart = i;
			}

			if (A >= arr.get(Length - 1)) {
				AStart = Length - 1;
			}
			if (B >= arr.get(Length-1)) {
				BStart = Length - 1;
			}

		}
		
		int sum = 0;
		
		if(AStart == Length - 1) {
			sum = AStart * (B-A+1);
			br.close();
			System.out.println(sum);
			return;
		}
		//AStart가 마지막 숫자와 같을 경우 간단하게 계산이 가능해진다.
		
		sum = sum + AStart *(arr.get(AStart+1)-A);
		//AStart 값 부터 구해주기
		
		if(BStart-AStart >= 2) {
			for(int i = AStart+1;i<BStart;i++) {
				sum = sum + i * (arr.get(i+1)-arr.get(i)) ;
			}
		}
		
		sum = sum + BStart * (B-arr.get(BStart)+1);
		//BStart 값 더해서 마무리
		
		System.out.println(sum);
		br.close();
	}//main 메서드 end

	
	
}
