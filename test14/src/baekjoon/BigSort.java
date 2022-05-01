package baekjoon;

import java.util.Scanner;

public class BigSort {
	/*
	 * baekjoon - 7568번 문제
	 * 큰 덩치의 순서대로 등수를 정한다.
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
		}//덩치 값 받기, 행에는 몸무게, 열에는 키
		
		int [][]sort =new int[num][3];
		
		for(int i=0;i<num;i++) {
			sort[i][0]=0;	//정렬위한 수
			sort[i][1]=i;	//몇번째 수인지
			sort[i][2]=0;	//순위
		}//sort배열 초기화
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(bigNum[i][0]>bigNum[j][0] && bigNum[i][1]>bigNum[j][1]) {
					//bigNum[i]이 bigNum[j]보다 크다.
					sort[i][0]++;
				}
			}
		}//순서 매기기
		
		bubbleSortRe(sort);//내림차순 버블정렬

//		for(int i=0;i<num;i++) {
//			System.out.println("sort["+i+"][0]:"+sort[i][0]);
//		}
//		테스트 프린트 문
		
		bigSort(sort);//순위 매기기
		
		
		bubbleSort(sort);//오름차순 버블정렬
		
		
		for(int i=0;i<num;i++) {
			System.out.print(sort[i][2]+" ");
		}
		
	}//main 메서드 끝
	
	
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
	}//bubbleSort 내림차순 메서드

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
	}//중복 순위 포함 순위매기기
	
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
					//같은 자리의 순위를 바꿔준다.
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			
		}
	}//bubbleSort 오름차순 메서드

}
