package baekjoon;

import java.util.Scanner;

public class SortXY {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		int [][]xyPos = new int[N][2];
		
		for(int i=0;i<N;i++) {
			String str=sc.nextLine();
			String[] str_tmp = str.split("\\s");
			xyPos[i][0]=Integer.parseInt(str_tmp[0]);
			xyPos[i][1]=Integer.parseInt(str_tmp[1]);
		}
		
		sortPosition(xyPos);
		
		for(int i=0;i<N;i++) {
			System.out.print(xyPos[i][0]+" ");
			System.out.println(xyPos[i][1]);
		}//정렬된 값 출력
		
	}
	
	public static void sortPosition(int[][] arr) {
		int max= arr.length;
		int tmp;
		
		for(int i=max-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j][0]>arr[j+1][0]) {
					tmp = arr[j][0];
					arr[j][0]=arr[j+1][0];
					arr[j+1][0]=tmp;
					
					tmp = arr[j][1];
					arr[j][1]=arr[j+1][1];
					arr[j+1][1]=tmp;
				}
			}
			
		}//거품 정렬로 xyPos[i][0] 앞쪽 숫자를 정렬
		
		for(int i=max-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j][1]>arr[j+1][1] && arr[j][0]==arr[j+1][0]) {
					tmp = arr[j][0];
					arr[j][0]=arr[j+1][0];
					arr[j+1][0]=tmp;
					
					tmp = arr[j][1];
					arr[j][1]=arr[j+1][1];
					arr[j+1][1]=tmp;
				}
			}
		}//거품 정렬로 xyPos[i][1] 뒤쪽 숫자를 정렬
		
	}

}
