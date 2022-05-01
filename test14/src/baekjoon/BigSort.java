package baekjoon;

import java.util.Scanner;

public class BigSort {
	/*
	 * baekjoon - 7568�� ����
	 * ū ��ġ�� ������� ����� ���Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int bigNum[][]=new int[num][2];
		
		for(int i=0;i<num;i++) {
			String str=sc.nextLine();
			String[] str_tmp = str.split("\\s");
			bigNum[i][0]=Integer.parseInt(str_tmp[0]);
			bigNum[i][1]=Integer.parseInt(str_tmp[1]);
		}//��ġ �� �ޱ�, �࿡�� ������, ������ Ű
		
		int [][]sort =new int[num][3];
		
		for(int i=0;i<num;i++) {
			sort[i][0]=0;	//�������� ��
			sort[i][1]=i;	//���° ������
			sort[i][2]=0;	//����
		}//sort�迭 �ʱ�ȭ
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(bigNum[i][0]>bigNum[j][0] && bigNum[i][1]>bigNum[j][1]) {
					//bigNum[i]�� bigNum[j]���� ũ��.
					sort[i][0]++;
				}
			}
		}//���� �ű��
		
		bubbleSortRe(sort);//�������� ��������

//		for(int i=0;i<num;i++) {
//			System.out.println("sort["+i+"][0]:"+sort[i][0]);
//		}
//		�׽�Ʈ ����Ʈ ��
		
		bigSort(sort);//���� �ű��
		
		
		bubbleSort(sort);//�������� ��������
		
		
		for(int i=0;i<num;i++) {
			System.out.print(sort[i][2]+" ");
		}
		
	}//main �޼��� ��
	
	
	static void bubbleSortRe(int [][]sort) {
		int num=sort.length;
		
		for(int i=num-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(sort[j][0]<sort[j+1][0]) {
					int tmp=sort[j+1][0];
					sort[j+1][0]=sort[j][0];
					sort[j][0]=tmp;
					
					tmp = sort[j+1][1];
					sort[j+1][1]=sort[j][1];
					sort[j][1]=tmp;
				}
			}
		}
	}//bubbleSort �������� �޼���

	static void bigSort(int [][]sort) {
		int num=sort.length;
		int ranking =1;
		sort[0][2]=ranking;
		
		for(int i=0;i<num-1;i++) {
			if(sort[i][0]==sort[i+1][0]) {
				sort[i+1][2]=sort[i][2];
			}else if(sort[i][0]!=sort[i+1][0]){
				sort[i+1][2]=i+1+1;
				
			}
		}
	}//�ߺ� ���� ���� �����ű��
	
	static void bubbleSort(int [][]sort) {
		int num=sort.length;
		
		for(int i=num-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(sort[j][1]>sort[j+1][1]) {
					int tmp=sort[j][1];
					sort[j][1]=sort[j+1][1];
					sort[j+1][1]=tmp;
					
					tmp=sort[j][2];
					sort[j][2]=sort[j+1][2];
					sort[j+1][2]=tmp;
					//���� �ڸ��� ������ �ٲ��ش�.
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			
		}
	}//bubbleSort �������� �޼���

}
