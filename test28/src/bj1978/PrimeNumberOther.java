package bj1978;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumberOther {
	/*
	 * first: <- 라벨 for문을 써서 필요없는 연산을 줄였다.
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");
		int len = 0;
		int count = 0;
		
		first:for (int i = 0; i < numbers.length; i++)
		{
			len = Integer.parseInt(numbers[i]);
			
			if (len == 1)
				continue;
			
			for (int j = 2; j <= len; j++)
				if ( len % j == 0 && len != j)
					continue first;
			
			count++;
		}
		System.out.println(count);
	}
}