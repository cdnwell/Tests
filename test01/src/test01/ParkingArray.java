package test01;

public class ParkingArray {

	public static void main(String[] args) {
		int park_day1[]=new int[22];
		int park_day2[]=new int[22];
		//첫 째날 주차장 park_day1, 둘 째날 주차장 park_day2
		int day1_num[] = {1,3,6,8,11,14,16,19,21};
		int day2_num[] = {3,5,8,10,11,14,16,18,21};
		//주차장에 점유 된 번호를 적습니다. 배열의 인덱스 값으로 사용하겠습니다.
		int no_parking[] = new int[30];
		int twoday_parking[] = new int[30];
		
		for(int i=0;i<22;i++) {
			park_day1[i]=0;
			park_day2[i]=0;
			//배열의 모든 변수를 0으로 초기화 했습니다.
		}
		//첫째날 주차장 1,3,6,8,11,14,16,19,21
		//둘째날 주차장 3,5,8,10,11,14,16,18,21
		
		for(int i=0;i<day1_num.length;i++)
		{
			park_day1[day1_num[i]-1]=1;
		}
		
		for(int i=0;i<day2_num.length;i++)
		{
			park_day2[day2_num[i]-1]=1;
		}
		//각 주차장에 주차 되어있는 공간은 1로 나타내고 배열에 나타내기 위해
		//주차된 자리 번호에서 1을 뺀 후 저장하겠습니다.
		
		System.out.print("첫째날 주차장. 주차된 주차공간 번호:");
		for(int i=0;i<day1_num.length;i++) {
			System.out.print(day1_num[i]+" ");
		}
		System.out.println();
		
		System.out.print("둘째날 주차장. 주차된 주차공간 번호:");
		for(int i=0;i<day2_num.length;i++) {
			System.out.print(day2_num[i]+" ");
		}
		System.out.println();
		
		System.out.print("이틀간 사용되지 않은 주차공간 번호:");
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
		System.out.print("이틀간 사용된 주차공간 번호:");
		for(int i=0;i<park_day1.length;i++) {
			if(twoday_parking[i] != 0) {
				System.out.print(twoday_parking[i]+" ");
			}
		}
		System.out.println();
	}

}
