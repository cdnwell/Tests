package test04;

import java.util.Scanner;

public class Array_re {

	public static void main(String[] args) {
		//4���� �л� ��,��,�� �� ���� ���� �Է�
		int [][]score=new int[4][3];
		String []subject = {"����","����","����"};
		int []total=new int[4];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {		
			System.out.println(i+1+"��° �л� ����---");
			for(int j=0;j<3;j++) {
				System.out.print(subject[j]+":");
				score[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i+1+"��° �л� ����---");
			for(int j=0;j<3;j++) {
				System.out.println(subject[j]+":"+score[i][j]);
			}
			for(int j=0;j<3;j++)
			{
				total[i]+=score[i][j];
			}
			System.out.println("����:"+total[i]);
			System.out.println("���:"+total[i]/3);
			System.out.println("---------");
		}
		
	}

}
