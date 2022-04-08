package test02;

import java.util.Scanner;

public class Raspberry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;	//산딸기 개수
		int n;	
		//특정 크기 n을 기준으로 작으면 쥬스로 n크기 이면 생으로 먹고 n보다 크면 케익으로 만들어 먹는다.
		int []ai=null;
		int tmp;
		int find=0;
		
		String rsp_size;
		
		
		Scanner sc=new Scanner(System.in);
		
		m=sc.nextInt();
		ai=new int[m];
		rsp_size=sc.nextLine();
		String []size_change =rsp_size.split("\\s");
		
		for(int i=0;i<m;i++) {
			ai[i]=Integer.parseInt(size_change[i]);
		}
		//동적 배열 할당
		
		//String []cs_change = num_cs.split("\\s");
		//n=Integer.parseInt(cs_change[0]);
		
		//문자에서 숫자 추출하는 방법
		
		n=sc.nextInt();
		
		for(int i=0;i<m;i++) {
			
		}
		
	}

}
