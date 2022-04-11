package test04;

import java.util.Scanner;

public class Array_re {

	public static void main(String[] args) {
		//4명의 학생 국,영,수 세 과목 점수 입력
		int [][]score=new int[4][3];
		String []subject = {"국어","영어","수학"};
		int []total=new int[4];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {		
			System.out.println(i+1+"번째 학생 점수---");
			for(int j=0;j<3;j++) {
				System.out.print(subject[j]+":");
				score[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i+1+"번째 학생 점수---");
			for(int j=0;j<3;j++) {
				System.out.println(subject[j]+":"+score[i][j]);
			}
			for(int j=0;j<3;j++)
			{
				total[i]+=score[i][j];
			}
			System.out.println("총합:"+total[i]);
			System.out.println("평균:"+total[i]/3);
			System.out.println("---------");
		}
		
	}

}
