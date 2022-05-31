package bj1978;

import java.util.Scanner;

public class PrimeNumberOtherShort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), n, c = 0, p, i;
		while (t > 0) {
			n = s.nextInt();
			p = 0;
			for (i = 2; i < n; i++)
				if (n % i == 0)
					p = 1;
			if ((n > 2 && p == 0) || n == 2)
				c++;
			t--;
		}
		System.out.print(c);

	}

}