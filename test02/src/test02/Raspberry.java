package test02;

import java.util.Scanner;

public class Raspberry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;	//����� ����
		int n;	
		//Ư�� ũ�� n�� �������� ������ �꽺�� nũ�� �̸� ������ �԰� n���� ũ�� �������� ����� �Դ´�.
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
		//���� �迭 �Ҵ�
		
		//String []cs_change = num_cs.split("\\s");
		//n=Integer.parseInt(cs_change[0]);
		
		//���ڿ��� ���� �����ϴ� ���
		
		n=sc.nextInt();
		
		for(int i=0;i<m;i++) {
			
		}
		
	}

}
