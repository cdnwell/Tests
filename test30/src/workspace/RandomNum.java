package workspace;

import java.util.Arrays;
import java.util.Random;

public class RandomNum {
	/*
	 * 19�� , ��� �� �����ϰ� �迭 ���
	 */
	public static void main(String[] args) {
		Random r = new Random();	
		//������ ����� ���� Ŭ���� Random�� ��ü r ����
		int []arr= new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i]=r.nextInt(10);
		}//���� ����� �迭�� �ֱ�
		
		System.out.println("���� : "+ Arrays.toString(arr));
		
		int []arr02 = new int[4];	
		//��� ���� �����ϰ� ���� �迭�� ���� �޾Ʊ� ���� ����Ǵ� �迭 
		
		arr02[0]=arr[0];
		arr02[1]=arr[1];
		arr02[2]=arr[3];	//��� ���� arr[2]�� �ǳ� �ٰ� �迭�� �ֱ�
		arr02[3]=arr[4];
		
		System.out.println("���� �� : "+ Arrays.toString(arr02));
	}

}
