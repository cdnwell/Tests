package workspace;

import java.util.Scanner;

public class SameArray02 {
	/*
	 * 22��. ������ ���� ���� �迭 ��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 A : ");
		int [] arrA = new int[5];
		int [] arrB = new int[5];
		
		for(int i = 0; i<5;i++) {
			arrA[i]=sc.nextInt();
		}
		
		System.out.print("�迭 B : ");
		for(int i = 0 ; i<5;i++) {
			arrB[i]=sc.nextInt();
		}
		
		for(int i = 0; i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arrA[i]==arrB[j]) {
					arrA[i]=-1;		
					//�迭�� ���� ������ �����߱� ������ ������ �������� ���Ѵ�.
					//�׷��� -1�� �������༭ ���� �迭���� Ȯ�� �����ϰ� ���� �־���
					break;
					//���� �Ѱ��� �����ϰ� ����� ���� break�� int j�� �ִ� for���� ������.
				}
			}
		}
		
		int count = 0;
		
		for(int i =0;i<5;i++) {
			if(arrA[i]==-1)
				count++;
		}//arrA�� -1�� �󸶳� ���ԵǾ����� Ȯ���Ѵ�.
		//��� ���� -1�� ���� �Ǿ��ٸ� �� �迭�� ����.(= count�� 5�̴�.)
		
		if(count == 5) {
			System.out.println("�� �迭�� ����");
		}else {
			System.out.println("�� �迭�� �ٸ�");
		}
	}

}
