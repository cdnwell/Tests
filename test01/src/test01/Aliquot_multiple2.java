package test01;

import java.util.Scanner;

public class Aliquot_multiple2 {

	public static void main(String[] args) {

		int m;				//돌하르방이 고른 자연수 m
		int []v=null;		//흑돼지가 고른 1~m 사이의 자연수 v
		//int n;				//흑돼지의 수
		int v_tmp[]=null;	
		//문제 : 돌하르방은 1~m 사이의 값 중 각 v에 대해서 약수 또는 배수가 되는 자연수의 개수를 답한다.
		//이때 고르는 흑돼지는 n마리다.
		//n의 값은 1이상 1000000이하
		//m의 값은 1이상 10000000이하
		//v1의 값의 범위는 1이상 m이하
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("흑돼지의 수, 돌하르방이 고른 자연수(스페이스를 사이에 두고 두 수를 입력합니다.):");
		System.out.println("입력하겠습니다.");
		int n=sc.nextInt();
		if(n>=1 && n<=1000000) {
			v=new int[n];
			v_tmp=new int[n];
			//v배열 v_tmp배열의 동적 할당
			
			m=sc.nextInt();
			for(int i=0;i<n;i++) {
				v_tmp[i]=1;
			}
			//System.out.println("흑돼지가 고른 자연수(스페이스를 사이에 두고 수를 입력합니다.)");
			//System.out.println("입력하셔야 할 수 갯수는 " + n + " 개 입니다.");
			//System.out.println("돌하르방이 고른 자연수는 " + m + " 입니다.");
			//System.out.print("입력해주세요:");
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
								//System.out.println("v_tmp["+i+"]++ j값:"+j);
								v_tmp[i]++;
							}
						
						else if(v[i]<j) {
							if(j%v[i]==0) {
								//System.out.println("v_tmp["+i+"]++ j값:"+j);
								v_tmp[i]++;
							}
						}else if(v[i]>j) {
							if(v[i]%j==0) {

								//System.out.println("v_tmp["+i+"]++ j값:"+j);
								v_tmp[i]++;
							}
						}
						//else문 넣을 자리
					}else{
					//System.out.println("흑돼지가 고른 자연수의 값 중 하나가 옳바르지 않습니다.");
					System.exit(0);
					}
				}
			}
			for(int i=0;i<n;i++) {
				System.out.println(v_tmp[i]);
			}
		
		}else {
			//System.out.println("돼지의 수는 1이상 1000000이하의 자연수로 적으셔야 합니다.");
		}
		
	}

}