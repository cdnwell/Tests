package test10;

import java.util.Scanner;

public class Sticker {
	/*
	 * �������б������� �Ʒ� ��Ģ�� ���� Ī�� ��ƼĿ�� �߱��Ѵ�.
		- Ī�� ��ƼĿ�� ����, �ָ��� ������� ���� �߱��Ѵ�.
		- �� �л��� 1�⿡ 1���� ��ƼĿ�� ���� �� ������, �� �� ��ƼĿ�� ������ �ٽô� ���� ���Ѵ�.
		- 3�� 1�Ͽ� �л� �� �� ���� �����Ͽ� Ī�� ��ƼĿ�� �߱��Ѵ�.
		- Ī�� ��ƼĿ�� ���� �л��� ���� �� ���ο� �л��鿡�� Ī�� ��ƼĿ�� �߱��ϴµ�, �߱��ϴ� ���� ��¥�� �Ҽ����� �ƴ����� ���� ������ ���� �߱��ϴ� ��ƼĿ�� ������ �޶�����.
	  	- ��¥�� �Ҽ��� �ƴ� ��� : ���� ��ƼĿ�� �߱޹��� �л��� 2���� �л����� ��ƼĿ�� �߱�
	  	- ��¥�� �Ҽ��� ��� : ���� ��ƼĿ�� �߱޹��� �л��� 3���� �л����� ��ƼĿ�� �߱�
		- �������б��� �л��� n���̶�� �� ��, ��� �л��� Ī�� ��ƼĿ�� �ޱ� ���ؼ� �ּ� �� ���� �ʿ��ұ�?
		- Ī�� ��ƼĿ ������ 3�� 1�Ͽ� ó�� ���۵ȴ�.
	 */
	static int month=3;
	static int date=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int []student = new int[n];
		
		int count=1;
		int dateCount=0;
		
		student[0]=1;
		
		int sum=1;
			for(int i=0;n-sum>0;i++) {
				
				for(int j=1;j<=31;j++) {
					if((date+1)%j==0) {
						dateCount++;
					}
				}
				
				if(dateCount>2) {
					student[i+1]=student[i]*2;
				}else {
					student[i+1]=student[i]*3;
				}
				
				dateCount=0;
				sum+=student[i+1];
				count++;
				date++;
				dateCal(month,date);
				
			}
		System.out.println(count);
//		System.out.println("���� ��¥:"+date);
	}

	static void dateCal(int month, int date) {
		if(month==1 || month ==3 || month ==5|| month ==7 || month ==8 ||month==10||month==12) {
			//31��
			if(date >31) {
				if(date/31 >= 1) {
					month++;
					if(month>12) {
						month =1;
					}
				}
				date=date-31;
			}
		}else if(month ==2) {
			//28��
			if(date > 28) {
				if(date/28 >= 1) {
					month++;
					if(month>12) {
						month =1;
					}
				}
				date=date-28;
			}
		}else {
			//30��
			if(date > 30) {
				if(date/30 >= 1) {
					month++;
					if(month>12) {
						month =1;
					}
				}
				date =date-30;
			}
		}
	}
	
}
