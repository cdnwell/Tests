package test07;

import java.util.Scanner;

public class Haenyeo {

	public static void main(String[] args) {
		//String center =sc.nextLine();
		//String[] num= center.split("\\s");
		//a=Integer.parseInt(num[0]);
		//b=Integer.parseInt(num[1]);
		//���� �ڸ��� �� ��� ���ϴ� ���
		Scanner sc =new Scanner(System.in);
		int a, b, c;
		//a ����>��ġ, b ��ġ>����, c ����>�ٱݹٸ�
		
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n<1 || n>1000000000) {
			System.out.println("�Է��Ͻ� ���� ������ ������ϴ�.");
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
		
		String str=sc.nextLine();
		String[] num = str.split("\\s");
		
		a=Integer.parseInt(num[0]);
		b=Integer.parseInt(num[1]);
		c=Integer.parseInt(num[2]);
		
		if(a<1 || a>100) {
			System.out.println("�Է��Ͻ� ���� ������ ������ϴ�.");
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
		if(b<1 || b>100) {
			System.out.println("�Է��Ͻ� ���� ������ ������ϴ�.");
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
		if(c<1 || c>100) {
			System.out.println("�Է��Ͻ� ���� ������ ������ϴ�.");
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}
		
		int btoh, htoj, jtod;
		
		btoh=(n/12)*a;
		htoj=(btoh/8)*b;
		jtod=(htoj/5)*c;
		
		System.out.println(jtod);
		
	}

}
