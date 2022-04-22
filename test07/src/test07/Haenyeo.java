package test07;

import java.util.Scanner;

public class Haenyeo {

	public static void main(String[] args) {
		//String center =sc.nextLine();
		//String[] num= center.split("\\s");
		//a=Integer.parseInt(num[0]);
		//b=Integer.parseInt(num[1]);
		//문장 자르고 각 요소 구하는 방법
		Scanner sc =new Scanner(System.in);
		int a, b, c;
		//a 보말>한치, b 한치>전복, c 전복>다금바리
		
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n<1 || n>1000000000) {
			System.out.println("입력하신 값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
		String str=sc.nextLine();
		String[] num = str.split("\\s");
		
		a=Integer.parseInt(num[0]);
		b=Integer.parseInt(num[1]);
		c=Integer.parseInt(num[2]);
		
		if(a<1 || a>100) {
			System.out.println("입력하신 값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		if(b<1 || b>100) {
			System.out.println("입력하신 값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		if(c<1 || c>100) {
			System.out.println("입력하신 값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
		int btoh, htoj, jtod;
		
		btoh=(n/12)*a;
		htoj=(btoh/8)*b;
		jtod=(htoj/5)*c;
		
		System.out.println(jtod);
		
	}

}
