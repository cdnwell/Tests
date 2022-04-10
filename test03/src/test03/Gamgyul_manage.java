package test03;

import java.util.Scanner;

public class Gamgyul_manage {

	public static void main(String[] args) {
		String center;
		String radius;
		String position;
		int a,b;		//감귤밭의 중심 좌표 	(a,b)
		int r;			//밭의 반지름			r
		int c,d;		//감귤 나무의 좌표 		(c,d)
		
		int check;
		
		Scanner sc=new Scanner(System.in);
		
		center=sc.nextLine();
		
		String[] num= center.split("\\s");
		
		a=Integer.parseInt(num[0]);
		b=Integer.parseInt(num[1]);
		
		if(a<-1000 || a>1000) {
			System.out.println("a혹은 b의 값이 범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		if(b<-1000 || b>1000) {
			System.out.println("a혹은 b의 값이 범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		radius=sc.nextLine();
		
		String[] num1= radius.split("\\s");
		
		r=Integer.parseInt(num1[0]);
		
		if(r<1 || r>1000000) {
			System.out.println("r의 값이 1보다 작거나 1000000보다 큽니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		
		position=sc.nextLine();
		
		String[] num2=position.split("\\s");
		
		c=Integer.parseInt(num2[0]);
		d=Integer.parseInt(num2[1]);
		
		if(c<-1000 || c>1000) {
			System.out.println("c 혹은 d의 값이 범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		if(d<-1000 || d>1000) {
			System.out.println("c 혹은 d의 값이 범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		//모든 값을 받았습니다.
		
		if( ((c-a)*(c-a)+(d-b)*(d-b))>r*r ) {
			System.out.println("out");
		}else if( ((c-a)*(c-a)+(d-b)*(d-b))==r*r ) {
			System.out.println("on");
		}else if( ((c-a)*(c-a)+(d-b)*(d-b))<r*r ) {
			System.out.println("in");
		}
		
	}

}
