package baekjoon;

import java.util.Scanner;

public class AlphabetInput {
	/*
	 * baekjoon - 2941�� ����
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * c=, c-, dz=, d-, lj, nj, s=, z=
		 * ������ ���ĺ��� ���� �ϳ��� ����.
		 */
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//�Ѱ��� ���ĺ����� ġȯ�Ѵ�.
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
