package test05;

import java.util.Scanner;

public class test_study {
	
	public static void main(String []args) {
		
		//String[] num= center.split("\\s");
		//a=Integer.parseInt(num[0]);
		//b=Integer.parseInt(num[1]);
		//���� �ڸ��� �� ��� ���ϴ� ���
		
		//ù ��° �ٿ� �θ��� ������ ����(AA, AO, BB, BO, OO, AB) 2���� �����̽��� ���еǾ� �Էµȴ�.
		
		//�ڳడ ���� �� �ִ� �������� ���ڿ� ������������ ��� ����Ѵ�.
		
		//�Է� ���� 
		//AB AB
		
		//��� ����
		//A AB B
		
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String[] block = str.split("\\s");
		
		String sum;
		
		//��ü.charAt(id)
		//��ü�� id��° ���� �о�´�.
		
		char []sum_chr=new char[2];
		sum_chr[0]=block[0].charAt(0);
		sum_chr[1]=block[0].charAt(1);
		
		char []sum_chr2=new char[2];
		sum_chr2[0]=block[1].charAt(0);
		sum_chr2[1]=block[1].charAt(1);
		
		String []temp_str= new String[2];
		String []temp_str2= new String[2];
		
		temp_str[0]=Character.toString(sum_chr[0]);
		temp_str[1]=Character.toString(sum_chr[1]);
		
		temp_str2[0]=Character.toString(sum_chr2[0]);
		temp_str2[1]=Character.toString(sum_chr2[1]);
	
		String[] sum_str =new String[4];
		int idx=0;
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++) {
				idx=j*2+k;
				sum_str[idx]=temp_str[j]+temp_str2[k];
			}
		}
		
		//��� ����� �� �����ִ� for��
		
//		for(int j=0;j<4;j++) {
//			System.out.println(sum_str[j]);
//		}
		
		//sum_str[idx] idx = 0~3 ��� �� ����
		
		
		
		
		//------�ߺ� ���ְ� ������������ �����ϱ�-----
		
		
		//�ߺ� ���ֱ�
		
		for(int i=0;i<4;i++) {
			sum_str[i]=DoubleStr(sum_str[i]);
		}
		
		
		//--------

		int []list=new int[4];
		
		for(int i=0;i<4;i++) {
			list[i]=numMethod(sum_str[i]);
		}
		
		//�������� ������ ���� ���� int�� Ÿ���� list �迭 ����
		
		selectionSort(list);
		
		//���� ���� ���� �Ϸ�
		
		
		for(int i=0;i<4;i++) {
			if(list[i]==1) {
				if(i != 0 && list[i-1]==1) {
					continue;
				}else {
					System.out.print("A ");
				}
			}else if(list[i]==2) {
				if(i != 0 && list[i-1]==2) {
					continue;
				}else {
					System.out.print("AB ");
				}
			}else if(list[i]==3) {
				if(i != 0 && list[i-1]==3) {
					continue;
				}else {
				System.out.print("B ");
				}
			}else if(list[i]==4) {
				if(i != 0 && list[i-1]==4  ) {
					continue;
				}else {
				System.out.print("O ");
				}
			}
		}
		
		//main �Լ� ��
	}
	
	public static int numMethod(String str) {
		int result=0;
		
		if(str.equals("A")) {
			result=1;
		}else if(str.equals("AB")) {
			result=2;
		}else if(str.equals("B")) {
			result=3;
		}else if(str.equals("O")) {
			result=4;
		}
	
		return result;
	}
	
	public static String DoubleStr(String str) {
		String result=null;
		
		if(str.equals("AA")||str.equals("AO")||str.equals("OA")) {
			result = "A";
		}else if(str.equals("AB")||str.equals("BA")) {
			result = "AB";
		}else if(str.equals("OO")) {
			result = "O";
		}else if(str.equals("BO")||str.equals("OB")){
			result = "B";
		}
		
		return result;
	}
	
	public static void selectionSort(int list[]) {
		int i,j,least,tmp;
		for(i=0;i<list.length-1;i++) {
			least=i;
			for(j=i+1;j<list.length;j++) {
				if(list[j]<list[least]) {
					least=j;
				}
			}
			
			if(least != i) {
				tmp=list[i];
				list[i]=list[least];
				list[least]=tmp;
			}
			
		}
	}
	
}
