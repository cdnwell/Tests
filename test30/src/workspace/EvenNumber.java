package workspace;

import java.util.Arrays;
import java.util.Random;

public class EvenNumber {
	/*
	 * 20��. ���� 7�� ������ ¦�� ����
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr=new int[7];
		
		for(int i=0;i<7;i++) {
			arr[i]=r.nextInt(10);
		}//������ �����ؼ� �迭�� �ִ´�.
		
		System.out.println("���� : "+ Arrays.toString(arr));
		
		int num_count=0;
		
		for(int i=0;i<7;i++) {
			if(arr[i]%2==1) {
				num_count++;
			}//arr�迭�� ���� Ȧ���̸� num_count�� 1�� �����Ѵ�.
			//num_count�� 
		}
		
		int[] num_arr = new int[num_count];
		int arr_count = 0;
		
		for(int i=0;i<7;i++) {
			if(arr[i]%2==1) {
				num_arr[arr_count]=arr[i];	
				arr_count++;
			}
		}
		
		System.out.println("¦�� ���� �� : "+ Arrays.toString(num_arr));
		
	}

}
