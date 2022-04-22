package test07;

import java.util.Scanner;

public class AddBieber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		if(n<1 || n>100) {
			System.out.println("값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
		String str=sc.nextLine();
		int []num=new int[n];
		String[] strNum= str.split("\\s");
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(strNum[i]);
		}
		
		String str2=sc.nextLine();
		int a,b;
		String[] strNum2=str2.split("\\s");
		a=Integer.parseInt(strNum2[0]);
		b=Integer.parseInt(strNum2[1]);
		a=a-1;
		b=b-1;
		
		if(a>b || b<1 || b>n) {
			System.out.println("값이 범위를 벗어납니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum +=num[i];
		}
//		System.out.println("sum:"+sum);
		
		int sum_tmp[]=new int[n];
		
		for(int i=0;i<n;i++) {
			sum_tmp[i]=0;
		}
		
		int count=0;
		
		for(int j=0;j<n;j++) {
			for(int i=j;i<n;i++) {
				sum_tmp[j]+=num[i];

				if(sum_tmp[j]==sum) {
					count++;
//					System.out.println("sum_tmp[j]의 j값:"+j);
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}
