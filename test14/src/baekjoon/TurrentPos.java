package baekjoon;

import java.util.Scanner;

public class TurrentPos {
	/*
	 * baekjoon - 1002�� ����
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
		
		//�Է� �ޱ� �Ϸ�
		
		for(int i=0;i<num;i++) {
			System.out.println(checkMeet(x[i],y[i],r[i],x1[i],y1[i],r1[i]));
		}//��� �� ���
		
	}
	
	static int checkMeet(int x,int y,int r,int a,int b,int c) {
		
		double x1=x;
		double y1=y;
		double r1=r;
		//ū ��
		
		double a1=a;
		double b1=b;
		double c1=c;
		//���� ��
		
		if(r<c) {
			x1=a;
			y1=b;
			r1=c;
			//ū ��
			
			a1=x;
			b1=y;
			c1=r;
			//���� ��
		}
		
		double yd;
		double xd;
		
		double distance; 

		xd=Math.pow((a1-x1),2);
		yd=Math.pow((b1-y1),2);
		distance=Math.sqrt(yd+xd);

		//1�� �ܺ� : d > r + r1 ���ϴ� �� : 0
		//r=r1, r1=c1 , r1=ū ��, c1=���� ��
				
		if(distance>r1+c1) {
//			System.out.println("1�� �ܺ�");
			return 0;
		}
		
		//2�� ���� : d = r + r1 ���ϴ� �� : 1
		if(distance==r1+c1) {
//			System.out.println("2�� ����");
			return 1;
		}
		
		//3�� ���� : r - r1 < d < r + r1 ���ϴ� �� : 2
		if(distance > r1 - c1 && distance < r1 + c1) {
//			System.out.println("3�� ����");
			return 2;
		}
		
		//4�� ���� : d = r - r1 ���ϴ� �� : 1
		if(distance == r1 - c1) {
//			System.out.println("4�� ����");
			return 1;
		}
		
		//5�� ���� : r - r1 > d
		if(distance < r1 - c1) {
//			System.out.println("5�� ����");
			return 0;
		}
		
		//6�� ��ħ x1 = a1 , y1 = b1 , r1 = c1
		if(x1 == a1 && y1 == b1 && r1 == c1) {
//			System.out.println("6�� ��ħ");
			return -1;
		}
		
//		System.out.println("��� ���� ���");
		return 0;
	}
	
}
