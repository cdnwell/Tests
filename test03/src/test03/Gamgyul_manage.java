package test03;

import java.util.Scanner;

public class Gamgyul_manage {

	public static void main(String[] args) {
		String center;
		String radius;
		String position;
		int a,b;		//���ֹ��� �߽� ��ǥ 	(a,b)
		int r;			//���� ������			r
		int c,d;		//���� ������ ��ǥ 		(c,d)
		
		int check;
		
		Scanner sc=new Scanner(System.in);
		
		center=sc.nextLine();
		
		String[] num= center.split("\\s");
		
		a=Integer.parseInt(num[0]);
		b=Integer.parseInt(num[1]);
		
		if(a<-1000 || a>1000) {
			System.out.println("aȤ�� b�� ���� ������ ������ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		if(b<-1000 || b>1000) {
			System.out.println("aȤ�� b�� ���� ������ ������ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		radius=sc.nextLine();
		
		String[] num1= radius.split("\\s");
		
		r=Integer.parseInt(num1[0]);
		
		if(r<1 || r>1000000) {
			System.out.println("r�� ���� 1���� �۰ų� 1000000���� Ů�ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		
		position=sc.nextLine();
		
		String[] num2=position.split("\\s");
		
		c=Integer.parseInt(num2[0]);
		d=Integer.parseInt(num2[1]);
		
		if(c<-1000 || c>1000) {
			System.out.println("c Ȥ�� d�� ���� ������ ������ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		if(d<-1000 || d>1000) {
			System.out.println("c Ȥ�� d�� ���� ������ ������ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		//��� ���� �޾ҽ��ϴ�.
		
		if( ((c-a)*(c-a)+(d-b)*(d-b))>r*r ) {
			System.out.println("out");
		}else if( ((c-a)*(c-a)+(d-b)*(d-b))==r*r ) {
			System.out.println("on");
		}else if( ((c-a)*(c-a)+(d-b)*(d-b))<r*r ) {
			System.out.println("in");
		}
		
	}

}
