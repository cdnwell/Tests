package bj1021;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueTest {
	/*
	 * ���� 1021�� ����
	 * 
	 * ���Ǵ� �޼��� 
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
				//������ �ε��� ���� �迭�� ũ���� ���ݺ��� ���ų� ���� ���.
				//�迭�� ù��° ���� �ڷ� ������.
				for(int j=0; j<idx_num;j++) {
					int temp = queue.pollFirst();
					queue.offerLast(temp);
					count++;
				}
				
			}else {
				//������ �ε��� ���� �迭�� ũ���� ���ݺ��� Ŭ ���
				//�迭�� �ǵ� ���� ù��°�� ���� �Ѵ�.
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
