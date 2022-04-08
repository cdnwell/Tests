package test02;

import java.util.Scanner;

public class Aliquot_multiple_str {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num_cs;
		String num_pg;
		int n,m;
		int v[]=null;
		int count[]=null;
		
		num_cs=sc.nextLine();
		
		String []cs_change = num_cs.split("\\s");
		
		n=Integer.parseInt(cs_change[0]);
		m=Integer.parseInt(cs_change[1]);
		
		
		//System.out.println("흑돼지 수 n:"+n); 
		//System.out.println("돌하르방이 고른 자연수 m:"+m);
		 
		 
		v=new int[n];
		count=new int[n];
		
		num_pg=sc.nextLine();
		
		String[] pg_change=num_pg.split("\\s");
		
		
		for(int i=0;i<n;i++)
		{
			v[i]=Integer.parseInt(pg_change[i]);
		}
		
//		for(int i=0;i<n;i++) {
//			System.out.print(v[i]+" ");
//		}
//		System.out.println();
//		
		//값이 들어갔는지 확인한다.
		for(int i=0;i<n;i++) {
			count[i]=1;
		}
		// 1이 약수일 경우 계산이 안될 것 같아 초기값으로 1을 넣고 시작했다.
		
		for(int i=0;i<n;i++) {
			for(int j=2;j<=m;j++) {
				if(v[i]==1) {
					count[i]=1;
				}else if(v[i]==2 && j==2) {
					count[i]=2;
				}else if(v[i]==j) {
					count[i]++;
				}else if(v[i]>j) {
					if(v[i]%j==0) {
						count[i]++;
					}
				}else if(v[i]<j) {
					if(j%v[i]==0) {
						count[i]++;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(count[i]);
		}
		
	}

}
