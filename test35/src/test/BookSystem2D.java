package test;

import java.util.Scanner;

public class BookSystem2D {
	/*
	 * 27��. 2���� �¼� ����
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] seatNo = new char[9][9];
		// ����(.)�� ǥ���ϱ����� char�� 2�����迭 �迭 9���� ������ֱ�
		int seatMax = 81;
		char alp = 'A';
		
		for (int i = 0; i < 9; i++) {
			for(int j =0;j<9;j++) {
				seatNo[i][j] = '0';
			}
			
		} // seatNo �迭�� ��� ��Ҹ� 0���� �ʱ�ȭ
			// char���̱� ������ '0' <- '�� ����
		while (true) {
			System.out.println("������Ȳ - �ܿ��¼��� : " + seatMax);
			System.out.println("--------------------");
			System.out.print("  ");
			for (int i = 1; i < 10; i++) {
				System.out.print(i + " ");
			} // ��ȣ�� ���� ���
			System.out.println();
			//���� �ٲٱ� ���� ���� ��ɹ�
			
			for (int i = 0; i < 9; i++) {
				System.out.print((char)(alp+i)+" ");
				for(int j=0; j<9;j++) {
					System.out.print(seatNo[i][j] + " ");
				}
				System.out.println();
			} // �¼��迭�� ����Ǿ����� ���
			System.out.println("--------------------");
			System.out.print("�����Ͻðڽ��ϱ�? (Y�Ǵ� N) ");
			String check = sc.nextLine();
			// ������ ���� �ޱ� ���� check ���� ����
			
			System.out.print("������ �¼���ȣ �Է� : ");
			String seatNoIn = sc.nextLine();
			// �¼���ȣ�� ����Ǿ��մ��� Ȯ���ϱ� ���� ������ ���� 
			// ����� ���ڰ� ���� �־ String���� �޾��ش�.
			
			char []seatNoArr = seatNoIn.toCharArray();
			//toCharArray �޼��带 �Ἥ �Է¹��� seatNoIn�� char�� Ÿ������ �ٲ㼭
			//�迭�� ���� �־��ش�.
			//����� ���ڷ� �ٲ��ֱ� ���� char�� �迭�� �޾��ش�.

			if (seatNoArr[0] < 'A' || seatNoArr[1] > 'I') {
				System.out.println("�¼���ȣ�� ������ ����ϴ�.");
				continue;
				// while���� ù��°�� �ٽ� ���ư���
			}
			//�¼��� ������ ��� ������� Ȯ���Ѵ�.
			//�¼��� ������ ����� while ù��°�� ���ư��Ƿ� else���� �������� �ʴ´�.
			
			int [] seatInt = new int[2];
			//�Է¹��� �¼���ȣ�� �迭�� �ֱ� ���� ��ȯ�ϱ� ���� �迭�� �����ؼ�
			//char ������ ���� ���� ���ڸ��� ���� ���ڸ��� seatInt[0]�� seatInt[1]�� ���� �־��ش�.
			//�� ������ �迭�� ������ üũ���ش�.
			
			seatInt[0]=seatNoArr[0]-'A';
			
			if (seatNoArr[1] < '1' || seatNoArr[1] > '9') {
				System.out.println("�¼���ȣ�� ������ ����ϴ�.");
				continue;
				// while���� ù��°�� �ٽ� ���ư���
			}
			
			seatInt[1] = seatNoArr[1] - '1';
			// index���� �����ֱ� ���� 1�� ����

			if (seatNo[seatInt[0]][seatInt[1]] == '0' && check.equals("Y")) {
				seatNo[seatInt[0]][seatInt[1]] = '.';
				// �¼� ����� ���·� �ٲ���
				System.out.println("����Ǿ����ϴ�.");
				seatMax--;
			}else if(seatNo[seatInt[0]][seatInt[1]] == '.' && check.equals("Y")) {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}

		}
		
	}

}
