package test;

import java.util.Scanner;

public class BookSystem {
	/*
	 * 25�� �¼�����ý��� ������Ȳ - �ܿ��¼��� : 10 
	 * -------------------- 
	 * 1 2 3 4 5 6 7 8 9 10(�¼���ȣ)
	 * 0 0 0 0 0 0 0 0 0 0 (�������) 
	 * -------------------- 
	 * �����Ͻðڽ��ϱ�? (Y�Ǵ� N) 
	 * ������ �¼���ȣ �Է� :
	 * ����Ǿ����ϴ�. / �̹� ����� �ڸ��Դϴ�.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] seatNo = new char[10];
		// ����(.)�� ǥ���ϱ����� char�� �迭 10�� ������ֱ�
		int seatMax = 10;

		for (int i = 0; i < 10; i++) {
			seatNo[i] = '0';
		} // seatNo �迭�� ��� ��Ҹ� 0���� �ʱ�ȭ
			// char���̱� ������ '0' <- '�� ����
		while (true) {
			System.out.println("������Ȳ - �ܿ��¼��� : " + seatMax);
			System.out.println("--------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			} // ��ȣ�� ���� ���
			System.out.println("(�¼���ȣ)");
			for (int i = 0; i < 10; i++) {
				System.out.print(seatNo[i] + " ");
			} // �¼��迭�� ����Ǿ����� ���

			System.out.println("(�������)");
			System.out.print("�����Ͻðڽ��ϱ�? (Y�Ǵ� N) ");
			String check = sc.nextLine();
			// ������ ���� �ޱ� ���� check ���� ����
			
			System.out.print("������ �¼���ȣ �Է� : ");
			int seatNoIn = sc.nextInt();
			sc.nextLine();
			// �¼���ȣ�� ����Ǿ��մ��� Ȯ���ϱ� ���� ������ ����

			if (seatNoIn < 1 || seatNoIn > 10) {
				System.out.println("�¼���ȣ�� ������ ����ϴ�.");
				continue;
				// while���� ù��°�� �ٽ� ���ư���
			} else {
				seatNoIn = seatNoIn - 1;
				// index���� �����ֱ� ���� 1�� ����
			}

			if (seatNo[seatNoIn] == '0' && check.equals("Y")) {
				seatNo[seatNoIn] = '.';
				// �¼� ����� ���·� �ٲ���
				System.out.println("����Ǿ����ϴ�.");
				seatMax--;
			} else if(seatNo[seatNoIn] == '.' && check.equals("Y")) {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}

		}
	}

}
