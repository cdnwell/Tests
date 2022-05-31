package workspace;

import java.util.Arrays;
import java.util.Random;

public class RandomNum {
	/*
	 * 19번 , 가운데 값 삭제하고 배열 출력
	 */
	public static void main(String[] args) {
		Random r = new Random();	
		//난수를 만들기 위해 클래스 Random의 객체 r 생성
		int []arr= new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i]=r.nextInt(10);
		}//난수 만들고 배열에 넣기
		
		System.out.println("원래 : "+ Arrays.toString(arr));
		
		int []arr02 = new int[4];	
		//가운데 값을 제외하고 원래 배열의 값을 받아기 위해 선언되는 배열 
		
		arr02[0]=arr[0];
		arr02[1]=arr[1];
		arr02[2]=arr[3];	//가운데 값인 arr[2]를 건너 뛰고 배열에 넣기
		arr02[3]=arr[4];
		
		System.out.println("삭제 후 : "+ Arrays.toString(arr02));
	}

}
