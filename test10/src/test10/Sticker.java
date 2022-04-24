package test10;

import java.util.Scanner;

public class Sticker {
	/*
	 * 비버고등학교에서는 아래 규칙에 따라 칭찬 스티커를 발급한다.
		- 칭찬 스티커는 평일, 주말에 관계없이 매일 발급한다.
		- 각 학생은 1년에 1개의 스티커만 받을 수 있으며, 한 번 스티커를 받으면 다시는 받지 못한다.
		- 3월 1일에 학생 중 한 명을 선정하여 칭찬 스티커를 발급한다.
		- 칭찬 스티커를 받은 학생은 다음 날 새로운 학생들에게 칭찬 스티커를 발급하는데, 발급하는 날의 날짜가 소수인지 아닌지에 따라 다음과 같이 발급하는 스티커의 개수가 달라진다.
	  	- 날짜가 소수가 아닌 경우 : 전날 스티커를 발급받은 학생이 2명의 학생에게 스티커를 발급
	  	- 날짜가 소수인 경우 : 전날 스티커를 발급받은 학생이 3명의 학생에게 스티커를 발급
		- 비버고등학교의 학생이 n명이라고 할 때, 모든 학생이 칭찬 스티커를 받기 위해서 최소 몇 일이 필요할까?
		- 칭찬 스티커 제도는 3월 1일에 처음 시작된다.
	 */
	static int month=3;
	static int date=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int []student = new int[n];
		
		int count=1;
		int dateCount=0;
		
		student[0]=1;
		
		int sum=1;
			for(int i=0;n-sum>0;i++) {
				
				for(int j=1;j<=31;j++) {
					if((date+1)%j==0) {
						dateCount++;
					}
				}
				
				if(dateCount>2) {
					student[i+1]=student[i]*2;
				}else {
					student[i+1]=student[i]*3;
				}
				
				dateCount=0;
				sum+=student[i+1];
				count++;
				date++;
				dateCal(month,date);
				
			}
		System.out.println(count);
//		System.out.println("현재 날짜:"+date);
	}

	static void dateCal(int month, int date) {
		if(month==1 || month ==3 || month ==5|| month ==7 || month ==8 ||month==10||month==12) {
			//31일
			if(date >31) {
				if(date/31 >= 1) {
					month++;
					if(month>12) {
						month =1;
					}
				}
				date=date-31;
			}
		}else if(month ==2) {
			//28일
			if(date > 28) {
				if(date/28 >= 1) {
					month++;
					if(month>12) {
						month =1;
					}
				}
				date=date-28;
			}
		}else {
			//30일
			if(date > 30) {
				if(date/30 >= 1) {
					month++;
					if(month>12) {
						month =1;
					}
				}
				date =date-30;
			}
		}
	}
	
}
