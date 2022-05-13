package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
	/*
	 * baekjoon - 11728�� ����
	 * �迭 ��ġ��
	 * ���ĵǾ��ִ� �� �迭 A�� B�� �־�����. �� �迭�� ��ģ ���� �����ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []str = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);
		
		int [] numStore1 = new int [num1+num2];
		int [] numStore2 = new int [num2];
		
		str = sc.nextLine().split(" ");
		for(int i=0;i<num1;i++) {
			numStore1[i]=Integer.parseInt(str[i]);
		}
		
		str = sc.nextLine().split(" ");
		for(int i=0;i<num2;i++) {
			numStore2[i]=Integer.parseInt(str[i]);
		}
		
		int j = 0;
		for(int i=num1;i<num1+num2;i++) {
			numStore1[i]=numStore2[j] ;
			j++;
		}//�迭 ��ġ��
		
		BubbleSort(numStore1);
		
		System.out.println(Arrays.toString(numStore1));
		
	}//main ��

	static void BubbleSort(int []arr) {
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}//�� ���� �޼���
	
}
