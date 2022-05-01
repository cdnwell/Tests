package baekjoon;

import java.util.Scanner;

public class AlphabetInput {
	/*
	 * baekjoon - 2941번 문제
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * c=, c-, dz=, d-, lj, nj, s=, z=
		 * 나머지 알파벳은 갯수 하나로 센다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//한개의 알파벳으로 치환한다.
		str=str.replace("c=", "a");
		str=str.replace("c-","a");
		str=str.replace("dz=","a");
		str=str.replace("d-", "a");
		str=str.replace("lj", "a");
		str=str.replace("nj", "a");
		str=str.replace("s=", "a");
		str=str.replace("z=", "a");
		
		System.out.println(str.length());
		
	}

}
