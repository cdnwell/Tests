package numberchange;

import java.util.Scanner;

public class NumberChange {
	/*
	 * ���� �ϳ��� �Է¹޾� �Ʒ��� ���� '������' ���ڸ� ����ϰ�
     *   �� �ڸ����� ���� ����ϴ� �ڵ�.
     *   (������) ���� �Է� : 34824(����)
     *            �������� : 42843             
     *            �� �ڸ����� �� : 21 // = 4 +2 + 8 + 4 + 3 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String num = sc.nextLine();		//������ String���� �޾ƿ���
		
		int arrLength = num.length();	//�迭�� ���̸� ���ϱ� ���� ������ ���� 
		int[] arr = new int[arrLength];	//������ �� �ڸ��� �޾ƿ� �迭 arr
		
		for(int i=0;i<arrLength;i++) {
			arr[i]=num.charAt(i)-'0';
		}//charAt�޼���� num(String)�� �迭�� ���� ���� ���� �������
		//charAt(i)�� num�� i��° ���ڸ� �ǹ�
		//arr[0]�� ������ ù��° �ڸ��� �ǹ�, arr[1]�� ������ �ι�° �ڸ�... �̾���
		
		System.out.print("�������� : ");
		for(int i=arrLength-1;i>=0;i--) {
			System.out.print(arr[i]);
		}//���ڸ� �ǵ��ڸ����� ������� �о��
		
		System.out.println();
		
		System.out.print("�� �ڸ����� �� : ");
		int sum = 0;		//������ ���� ���� int�� ����
		
		for(int i =0;i<arrLength;i++) {
			sum = sum + arr[i];
		}//���ڸ� ù��°�ڸ����� ���ڸ����� �־��ֱ�
		System.out.print(sum);		//����� ������ �ڸ����� ���� ���
		
	}

}
