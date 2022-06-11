package bj1158;

import java.util.LinkedList;
import java.util.Scanner;

public class JosephusProb {
	/*
	 * 백준 1158번 문제
	 * 
	 * 사용되는 메서드 
	 * pollFirst(), offerLast(temp), offerFirst(temp)
	 * size(), pollLast(), offer(num)
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer>queue = new LinkedList<Integer>();
		String [] str_tmp = sc.nextLine().split(" ");
		int N = Integer.parseInt(str_tmp[0]);
		int K = Integer.parseInt(str_tmp[1]);
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ;i<= N;i++) {
			queue.offer(i);
		}
		
		sb.append("<");
		while(true) {
			
			if(queue.size()>1) {
				for(int i =0 ; i< K -1;i++) {
					int temp = queue.pollFirst();
					queue.offerLast(temp);
				}	
			}
			
			if(queue.size()==0) {
				break;
			}else if(queue.size()==1) {
				sb.append(queue.poll()+">");
			}else {
				sb.append(queue.poll()+", ");
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
