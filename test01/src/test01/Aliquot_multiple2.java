package test01;

import java.util.Scanner;

public class Aliquot_multiple2 {

	public static void main(String[] args) {

		int m;				//���ϸ����� �� �ڿ��� m
		int []v=null;		//������� �� 1~m ������ �ڿ��� v
		//int n;				//������� ��
		int v_tmp[]=null;	
		//���� : ���ϸ����� 1~m ������ �� �� �� v�� ���ؼ� ��� �Ǵ� ����� �Ǵ� �ڿ����� ������ ���Ѵ�.
		//�̶� ���� ������� n������.
		//n�� ���� 1�̻� 1000000����
		//m�� ���� 1�̻� 10000000����
		//v1�� ���� ������ 1�̻� m����
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("������� ��, ���ϸ����� �� �ڿ���(�����̽��� ���̿� �ΰ� �� ���� �Է��մϴ�.):");
		System.out.println("�Է��ϰڽ��ϴ�.");
		int n=sc.nextInt();
		if(n>=1 && n<=1000000) {
			v=new int[n];
			v_tmp=new int[n];
			//v�迭 v_tmp�迭�� ���� �Ҵ�
			
			m=sc.nextInt();
			for(int i=0;i<n;i++) {
				v_tmp[i]=1;
			}
			//System.out.println("������� �� �ڿ���(�����̽��� ���̿� �ΰ� ���� �Է��մϴ�.)");
			//System.out.println("�Է��ϼž� �� �� ������ " + n + " �� �Դϴ�.");
			//System.out.println("���ϸ����� �� �ڿ����� " + m + " �Դϴ�.");
			//System.out.print("�Է����ּ���:");
			for(int i=0;i<n;i++) {
				v[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				if(v[i]==1) {
					v_tmp[i]=m;
					continue;
				}
				for(int j=2;j<=m;j++) {
					
					if(v[i]>=1 && v[i]<=m) {
						 if(v[i]==j) {
								//System.out.println("v_tmp["+i+"]++ j��:"+j);
								v_tmp[i]++;
							}
						
						else if(v[i]<j) {
							if(j%v[i]==0) {
								//System.out.println("v_tmp["+i+"]++ j��:"+j);
								v_tmp[i]++;
							}
						}else if(v[i]>j) {
							if(v[i]%j==0) {

								//System.out.println("v_tmp["+i+"]++ j��:"+j);
								v_tmp[i]++;
							}
						}
						//else�� ���� �ڸ�
					}else{
					//System.out.println("������� �� �ڿ����� �� �� �ϳ��� �ǹٸ��� �ʽ��ϴ�.");
					System.exit(0);
					}
				}
			}
			for(int i=0;i<n;i++) {
				System.out.println(v_tmp[i]);
			}
		
		}else {
			//System.out.println("������ ���� 1�̻� 1000000������ �ڿ����� �����ž� �մϴ�.");
		}
		
	}

}