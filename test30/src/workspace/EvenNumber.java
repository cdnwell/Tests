package workspace;

import java.util.Arrays;
import java.util.Random;

public class EvenNumber {
	/*
	 * 20번. 난수 7개 생성후 짝수 제거
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr=new int[7];
		
		for(int i=0;i<7;i++) {
			arr[i]=r.nextInt(10);
		}//난수를 생성해서 배열에 넣는다.
		
		System.out.println("원래 : "+ Arrays.toString(arr));
		
		int num_count=0;
		
		for(int i=0;i<7;i++) {
			if(arr[i]%2==1) {
				num_count++;
			}//arr배열의 값이 홀수이면 num_count가 1씩 증가한다.
			//num_count는 
		}
		
		int[] num_arr = new int[num_count];
		int arr_count = 0;
		
		for(int i=0;i<7;i++) {
			if(arr[i]%2==1) {
				num_arr[arr_count]=arr[i];	
				arr_count++;
			}
		}
		
		System.out.println("짝수 제거 후 : "+ Arrays.toString(num_arr));
		
	}

}
