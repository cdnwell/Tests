package nextInt;

import java.util.Arrays;
import java.util.Scanner;

public class TokenSeparate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
