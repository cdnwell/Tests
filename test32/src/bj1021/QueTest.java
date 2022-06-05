package bj1021;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueTest {
	/*
	 * 백준 1021번 문제
	 * 
	 * 사용되는 메서드 
	 * pollFirst(), offerLast(temp), offerFirst(temp)
	 * size(), pollLast()
	 * 
	 */
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		String [] str_tmp1 = sc.nextLine().split(" ");
		int N = Integer.parseInt(str_tmp1[0]);
		int M = Integer.parseInt(str_tmp1[1]);
		int [] arr_num = new int[M];
		int count = 0;
		
		for(int i= 0 ;i<M ;i++) {
			arr_num[i] = sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		
		
		for(int i =0;i<M;i++) {
			int idx_num = queue.indexOf(arr_num[i]);
			int half_num;
			
			if(queue.size() % 2 == 0) {
				half_num = queue.size() / 2 -1 ;
			}else {
				half_num = queue.size() / 2;
			}
			
			if(idx_num <= half_num ) {
				//숫자의 인덱스 값이 배열의 크기의 절반보다 같거나 작을 경우.
				//배열의 첫번째 값을 뒤로 보낸다.
				for(int j=0; j<idx_num;j++) {
					int temp = queue.pollFirst();
					queue.offerLast(temp);
					count++;
				}
				
			}else {
				//숫자의 인덱스 값이 배열의 크기의 절반보다 클 경우
				//배열의 맨뒤 값을 첫번째로 오게 한다.
				for(int j= 0; j < queue.size() - idx_num ;j++) {
					
					int temp = queue.pollLast();
					queue.offerFirst(temp);
					count++;
					
				}
				
			}
			
			queue.pollFirst();
			
		}
		System.out.println(count);
		
	}

}
