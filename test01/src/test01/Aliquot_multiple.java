package test01;

import java.util.Scanner;

public class Aliquot_multiple {

	public static void main(String[] args) {
		int n;		//돌하르방이 고른 자연수 n
		int m;		//설문대 할망이 1~n사이의 값 중 고른 자연수 m
		int tmp;	//tmp는 임시값입니다.
		int count=0;
		int count2=0;
		int multiple[]=new int[256];
		int aliquot[]=new int[256];
		//문제 : 돌하르방이 m의 약수 또는 배수가 되는 자연수의 개수를 답한다.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("돌하르방이 자연수 n을 고릅니다:");
		n=sc.nextInt();
		if(n>=0){
			System.out.print("설문대 할망이 1~n사이의 값 중 자연수 하나(m)를 고릅니다:");
			m=sc.nextInt();
			if(m>=1 && m<=n) {
				if(m==1) {
					System.out.println("m의 값이 1입니다. 배수는 1이상 m이하의 수 모두 입니다.");
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
					
					System.out.print("m의 약수 또는 배수:");
					for(int i=0;i<count2;i++) {
						System.out.print(aliquot[i]+" ");
					}
					for(int i=0;i<count;i++)
					{
						System.out.print(multiple[i]+" ");
					}
					
					System.out.println();
					System.out.println("종료!");
				}
				
			}
			else {
				System.out.println("m값이 1~n사이의 값이 아닙니다.");
			}
		}
		else {
			System.out.println("n의 값이 자연수가 아닙니다.");
		}
			
	}

}
