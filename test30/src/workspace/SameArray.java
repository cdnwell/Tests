package workspace;

import java.util.Scanner;

public class SameArray {
	/*
	 * 21�� �迭 ��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 A�� �� : ");
		int []arrA = new int [5];
		int []arrB = new int [5];
		
		for(int i=0;i<5;i++) {
			arrA[i]=sc.nextInt();
		}//�迭 A�� ���� ���⸦ �������� �޾Ƽ� �־��ش�.
		//���͸� ġ�� ���� �� ��, ���� 5�� �־�� �Ѵ�.
		
		System.out.print("�迭 B�� �� : ");
		for(int i=0;i<5;i++) {
			arrB[i]=sc.nextInt();
		}//�迭 B�� ���� ���⸦ �������� �޾Ƽ� �־��ش�.
		//���� ��������
		
		for(int i = 0; i< arrA.length;i++) {
			if(arrA[i]!=arrB[i]) {
				System.out.println("�� �迭�� �ٸ�");
				break;
				//�� �迭�� �ε��� ���� ���� ��츸 ���Ѵ�.
				//�ϳ��� �ٸ��� "�� �迭�� �ٸ�" ������ ����ǰ� for������ �������´�. 
			}
			if(i == arrA.length-1) {
				System.out.println("�� �迭�� ����");
				//���� ���ǹ��� ������� ������ �� �������� i���� ���� ���ǹ��̴�. 
				//"�� �迭�� �ٸ�"�� ���ǽ��� ������� �ʾ����Ƿ� "�� �迭�� ����" 
			}
		}
		
	}

}
