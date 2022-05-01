package baekjoon;

import java.util.Scanner;

public class TurrentPos {
	/*
	 * baekjoon - 1002번 문제
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		String[] pos = new String[num];
		
		for(int i=0;i<num;i++) {
			pos[i]=sc.nextLine();
		}
		
		int []x = new int[num];
		int []x1 = new int[num];
		
		int []y = new int[num];
		int []y1 = new int[num];
		
		int []r = new int[num];
		int []r1 = new int[num];
		
		for(int i=0;i<num;i++) {
			String[]tmp_str=pos[i].split(" ");
			x[i]=Integer.parseInt(tmp_str[0]);
			y[i]=Integer.parseInt(tmp_str[1]);
			r[i]=Integer.parseInt(tmp_str[2]);
			x1[i]=Integer.parseInt(tmp_str[3]);
			y1[i]=Integer.parseInt(tmp_str[4]);
			r1[i]=Integer.parseInt(tmp_str[5]);
		}
		
		//입력 받기 완료
		
		for(int i=0;i<num;i++) {
			System.out.println(checkMeet(x[i],y[i],r[i],x1[i],y1[i],r1[i]));
		}//계산 및 출력
		
	}
	
	static int checkMeet(int x,int y,int r,int a,int b,int c) {
		
		double x1=x;
		double y1=y;
		double r1=r;
		//큰 원
		
		double a1=a;
		double b1=b;
		double c1=c;
		//작은 원
		
		if(r<c) {
			x1=a;
			y1=b;
			r1=c;
			//큰 원
			
			a1=x;
			b1=y;
			c1=r;
			//작은 원
		}
		
		double yd;
		double xd;
		
		double distance; 

		xd=Math.pow((a1-x1),2);
		yd=Math.pow((b1-y1),2);
		distance=Math.sqrt(yd+xd);

		//1번 외부 : d > r + r1 접하는 점 : 0
		//r=r1, r1=c1 , r1=큰 원, c1=작은 원
				
		if(distance>r1+c1) {
//			System.out.println("1번 외부");
			return 0;
		}
		
		//2번 외접 : d = r + r1 접하는 점 : 1
		if(distance==r1+c1) {
//			System.out.println("2번 외접");
			return 1;
		}
		
		//3번 만남 : r - r1 < d < r + r1 접하는 점 : 2
		if(distance > r1 - c1 && distance < r1 + c1) {
//			System.out.println("3번 만남");
			return 2;
		}
		
		//4번 내접 : d = r - r1 접하는 점 : 1
		if(distance == r1 - c1) {
//			System.out.println("4번 내접");
			return 1;
		}
		
		//5번 내부 : r - r1 > d
		if(distance < r1 - c1) {
//			System.out.println("5번 내부");
			return 0;
		}
		
		//6번 겹침 x1 = a1 , y1 = b1 , r1 = c1
		if(x1 == a1 && y1 == b1 && r1 == c1) {
//			System.out.println("6번 겹침");
			return -1;
		}
		
//		System.out.println("모든 조건 통과");
		return 0;
	}
	
}
