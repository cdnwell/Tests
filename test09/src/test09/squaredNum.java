package test09;

import java.util.Scanner;

public class squaredNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min,max;
		min = sc.nextInt();
		sc.nextLine();
		if (min < 1 || min > 1000000000) {
			System.out.println("min의 값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			return;
		}
		max = sc.nextInt();
		sc.nextLine();
		if (max < min || max > min + 1000000) {
			System.out.println("min의 값이 범위를 벗어났습니다.");
			System.out.println("시스템을 종료합니다.");
			return;
		}

		//-------최소값 최대값 입력 받기------------//
		
		int arrMax = max - min + 1;
		int jbox[] = new int[arrMax];

		calArr(jbox, arrMax);
		System.out.println(arrMax - returnArr(jbox, arrMax));

	}// main_method

	static int returnArr(int[] jbox, int arrMax) {
		int count = 0;
		for (int i = 0; i < arrMax; i++) {
			if (jbox[i] == 0) {
				count = i;
				break;
			}
		}
//		for(int i=0;i<count;i++) {
//			System.out.println(jbox[i]);
//		}
		
		return count;
		
	}// returnArr_method

	static void calArr(int[] jbox, int arrMax) {
		int count=0;
		int j_count=0;
		for(int i=1;i<=arrMax;i++) {
			j_count =0;
			for(int j=2;(j*j)<=arrMax;j++) {
				if(i%(j*j)==0 &&j_count ==0) {
					jbox[count]=i;
					count++;
					j_count=1;
					continue;
				}
			}
		}
	}//calArr_method

}
