package bj1978;

import java.util.Scanner;

public class PrimeNumber {
	/*
	 * �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ�
	 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String tmpNum = sc.nextLine();
		int pNum = 0;
		String[] strNum = tmpNum.split(" ");
		int [] arrNum = new int[strNum.length];
		
		for(int i = 0 ; i < strNum.length; i++) {
			 arrNum[i] = Integer.parseInt(strNum[i]);
			 
		}
		
		for(int i = 0; i < N ; i++) {
			int count = 0;
			for(int j = 2; j < arrNum[i]; j++) {
				if(arrNum[i]%j == 0 && arrNum[i] != 2) {
					count++;
				}
				
			}
			if(arrNum[i] == 1) {
				count++;
			}
			if(count == 0 ) {
				pNum++;
			}
		}
		
		System.out.println(pNum);
		
	}

}
