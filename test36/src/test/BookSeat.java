package test;

import java.util.Scanner;

public class BookSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] seatNo = new char[9][9];
//		int seatMax = 99;
		//�¼����� 9*9 �̹Ƿ� 81��
		int seatMax = 81;
		char alp = 'A';

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
//	            seatNo[n1][j] = 0;
				seatNo[i][j] = '0'; // char���� ���� 0�� ���� '0'�� �ٸ�
			}
		} // ���� for�� seatNo �ʱ�ȭ�ϱ� ���� ������ ������ while�� ���� �ݾ��־�� ��

		while (true) {
			System.out.println("���� ��Ȳ - �ۿ��¼��� : " + seatMax);
			System.out.println("------------------");
			System.out.print("  ");// println���� ����� �ϸ� �ٹٲ��� �Ǳ� ������ print�� ���
			for (int i = 1; i < 10; i++) {
				System.out.print(i + " ");// �ڿ� ���� �߰��� ���� ""���� " "�� ����
			}
			System.out.println();

			for (int i = 0; i < 9; i++) {
				System.out.print((char) (alp + i) + " "); // println�� ����� ���� �ٲٹǷ� print�� ����
				for (int j = 0; j < 9; j++) {
					System.out.print(seatNo[i][j] + " "); // println�� ����� ���� �ٲٹǷ� print�� ����
				}
				System.out.println();
			}

			System.out.println("----------------");
			System.out.print("�����Ͻðڽ��ϱ�?(Y �Ǵ� N) "); //���� �ڿ� ���� �ޱ� ���� println���� print�� ���� 
			String check = sc.nextLine();

			System.out.print("������ �¼���ȣ �Է� : ");
			String seatNoIn = sc.nextLine(); // I�� L�� �ٲ㾸

//	      String seatNoIn; // seatNoIn�� �̹� ������ �����߱� ������ �ߺ��ؼ� ����
			// �ϸ� �ȵ�
			char[] seatNoArr = seatNoIn.toCharArray();

			if (seatNoArr[0] < 'A' || seatNoArr[0] > 'Z') {// seatNoArr �迭�� ������ �¼���ȣ��
				// ���� String�� char������ ���� �迭�̹Ƿ� seatNoArr[0]�� seatNoArr[1]���� ���� ��
				// ���� �񱳸� ���� ���̹Ƿ� ù��° ���ڸ� ��Ÿ���� seatNoArr[0]�� ���� ��
				System.out.println("�¼���ȣ�� ������ ����ϴ�.");
				continue;
			}
			int[] seatInt = new int[2];

//	      seatint[0]=seatNoArr[0]='A';

			// seatInt�� �迭�� ���� seatNo �迭�� ���� �����ϱ� ���� ���̹Ƿ� ù��° �迭 ����� seatInt[0]��
			// �Է¹��� �� �� �� ������ seatNoArr[0]�� ������
			seatInt[0] = seatNoArr[0] - 'A';
			// seatNoArr[0]�� ���� �ܾ�� 'A'�� ���ָ� ���ĺ� ABCD...���� �ƽ�Ű �ڵ� ���� ���ڸ� ����
			// ���� seatNoArr[0]�� ���� A��� 'A'�� ���ָ� 0�̵� B��� 'A'�� ���ָ� 1�� ��

			if (seatNoArr[1] < '1' || seatNoArr[1] > '9') {
				System.out.println("�¼���ȣ�� ������ ����ϴ�");
				continue;
			}
			
			seatInt[1] = seatNoArr[1] - '1';
			
			if (seatNo[seatInt[0]][seatInt[1]] == '0' && check.equals("Y")) {
				
				seatNo[seatInt[0]][seatInt[1]] = '.';
				System.out.println("����Ǿ����ϴ�.");
				seatMax--;
				
			}else if(seatNo[seatInt[0]][seatInt[1]] == '.' && check.equals("Y")) {
				
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
				
			}

		}

	}

}
