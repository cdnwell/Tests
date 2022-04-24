package test09;

import java.util.Arrays;
import java.util.Scanner;

public class HomeNum {
	static int []aparts=new int[625];
	static int apartNum=0;
	static int n;
	static boolean [][]visit=new boolean[25][25];
	static int []dx= {0,0,1,-1};
	static int []dy= {1,-1,0,0};
	static int [][] num =new int[25][25];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		num = new int[n][n];
		visit = new boolean[n][n];
		
		for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                num[i][j] = input.charAt(j)-'0';
            }
        }
//		sc.nextLine();
//		
//		if(n<5|| n>25) {
//			System.out.println("n의 범위는 5이상 25이하입니다.");
//			return;
//		}
//		
//		String[]num_tmp=new String[n];
//		
//		for(int i=0;i<n;i++) {
//			num_tmp[i]=sc.nextLine();
//		}
//		
//		String[][]str_final=new String[n][n];
//		
//		for(int i=0;i<n;i++) {
//			String []str=num_tmp[i].split("");
//			String []str_tmp=str.clone();
//			for(int j=0;j<str_tmp.length;j++) {
//				str_final[i][j]=str_tmp[j];
//			}
//		}
//		
//		 
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				num[i][j]=Integer.parseInt(str_final[i][j]);
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(num[i][j]);
//			}
//			System.out.println();
//		}
		
		//----------숫자 입력 완료----------//
		//num[n][n]에 모든 숫자 들어있음
		
		
		
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(num[i][j]==1 && !visit[i][j]) {
					apartNum++;
					
					dfs(i,j);
				}
			}
		}
		
		Arrays.sort(aparts);
		System.out.println(apartNum);
		
		for(int i=0;i<aparts.length;i++) {
			if(aparts[i] == 0) {
				
			}else {
				System.out.println(aparts[i]);
			}
		}
		
	}//main 메서드 종료

	static void dfs (int x, int y) {
		visit[x][y]=true;
		aparts[apartNum]++;
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<n && ny <n) {
				if(num[nx][ny] ==1&& !visit[nx][ny]) {
					dfs(nx,ny);
				}
			}
 		}
		
		
	}
	
}
