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
		
		
		//System.out.println("����� �� n:"+n); 
		//System.out.println("���ϸ����� �� �ڿ��� m:"+m);
		 
		 
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
		//���� ������ Ȯ���Ѵ�.
		for(int i=0;i<n;i++) {
			count[i]=1;
		}
		// 1�� ����� ��� ����� �ȵ� �� ���� �ʱⰪ���� 1�� �ְ� �����ߴ�.
		
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
