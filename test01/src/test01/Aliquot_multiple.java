package test01;

import java.util.Scanner;

public class Aliquot_multiple {

	public static void main(String[] args) {
		int n;		//���ϸ����� �� �ڿ��� n
		int m;		//������ �Ҹ��� 1~n������ �� �� �� �ڿ��� m
		int tmp;	//tmp�� �ӽð��Դϴ�.
		int count=0;
		int count2=0;
		int multiple[]=new int[256];
		int aliquot[]=new int[256];
		//���� : ���ϸ����� m�� ��� �Ǵ� ����� �Ǵ� �ڿ����� ������ ���Ѵ�.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ϸ����� �ڿ��� n�� ���ϴ�:");
		n=sc.nextInt();
		if(n>=0){
			System.out.print("������ �Ҹ��� 1~n������ �� �� �ڿ��� �ϳ�(m)�� ���ϴ�:");
			m=sc.nextInt();
			if(m>=1 && m<=n) {
				if(m==1) {
					System.out.println("m�� ���� 1�Դϴ�. ����� 1�̻� m������ �� ��� �Դϴ�.");
				}else {
					for(int i=2;i<=n;i++) {
						if(i%m==0) {
							multiple[count]=i;
							count++;
						}
					}
					for(int i=1;i<=m;i++) {
						if(m==i) {
							continue;
						}
						else if (m%i==0) {
							aliquot[count2]=i;
							count2++;
						}
					}
					
					System.out.print("m�� ��� �Ǵ� ���:");
					for(int i=0;i<count2;i++) {
						System.out.print(aliquot[i]+" ");
					}
					for(int i=0;i<count;i++)
					{
						System.out.print(multiple[i]+" ");
					}
					
					System.out.println();
					System.out.println("����!");
				}
				
			}
			else {
				System.out.println("m���� 1~n������ ���� �ƴմϴ�.");
			}
		}
		else {
			System.out.println("n�� ���� �ڿ����� �ƴմϴ�.");
		}
			
	}

}
