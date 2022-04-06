package test01;

public class ParkingArray {

	public static void main(String[] args) {
		int park_day1[]=new int[22];
		int park_day2[]=new int[22];
		//ù °�� ������ park_day1, �� °�� ������ park_day2
		int day1_num[] = {1,3,6,8,11,14,16,19,21};
		int day2_num[] = {3,5,8,10,11,14,16,18,21};
		//�����忡 ���� �� ��ȣ�� �����ϴ�. �迭�� �ε��� ������ ����ϰڽ��ϴ�.
		int no_parking[] = new int[30];
		int twoday_parking[] = new int[30];
		
		for(int i=0;i<22;i++) {
			park_day1[i]=0;
			park_day2[i]=0;
			//�迭�� ��� ������ 0���� �ʱ�ȭ �߽��ϴ�.
		}
		//ù°�� ������ 1,3,6,8,11,14,16,19,21
		//��°�� ������ 3,5,8,10,11,14,16,18,21
		
		for(int i=0;i<day1_num.length;i++)
		{
			park_day1[day1_num[i]-1]=1;
		}
		
		for(int i=0;i<day2_num.length;i++)
		{
			park_day2[day2_num[i]-1]=1;
		}
		//�� �����忡 ���� �Ǿ��ִ� ������ 1�� ��Ÿ���� �迭�� ��Ÿ���� ����
		//������ �ڸ� ��ȣ���� 1�� �� �� �����ϰڽ��ϴ�.
		
		System.out.print("ù°�� ������. ������ �������� ��ȣ:");
		for(int i=0;i<day1_num.length;i++) {
			System.out.print(day1_num[i]+" ");
		}
		System.out.println();
		
		System.out.print("��°�� ������. ������ �������� ��ȣ:");
		for(int i=0;i<day2_num.length;i++) {
			System.out.print(day2_num[i]+" ");
		}
		System.out.println();
		
		System.out.print("��Ʋ�� ������ ���� �������� ��ȣ:");
		for(int i=0;i<park_day1.length;i++) {
			if(park_day1[i]==park_day2[i] && park_day1[i] == 0 ) {
				no_parking[i]=i+1;
			}
			if(park_day1[i]==park_day2[i] && park_day1[i] == 1) {
				twoday_parking[i]=i+1;
			}
		}
		for(int i=0;i<park_day1.length;i++) {
			if(no_parking[i]!=0) {
				System.out.print(no_parking[i]+" ");	
			}
			
		}
		System.out.println();
		System.out.print("��Ʋ�� ���� �������� ��ȣ:");
		for(int i=0;i<park_day1.length;i++) {
			if(twoday_parking[i] != 0) {
				System.out.print(twoday_parking[i]+" ");
			}
		}
		System.out.println();
	}

}
