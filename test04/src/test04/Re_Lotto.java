package test04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Re_Lotto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int []lot_ar=new int[6];
		int []user_ar=new int[6];
		int bonus;
		int ur_bonus;
		
		int inspect=0;
		
		int count=0;
		int bon_count=0;
	
		for(int i=0;i<6;i++) {
			lot_ar[i]=random.nextInt(45)+1;
		}
		
		//중복 검사
		while(true) {
			for(int n=0;n<6;n++) {
				for(int m=0;m<6;m++) {
					if(n==m) {
						
					}
					else if (lot_ar[n]==lot_ar[m]) {
						inspect++;
					}
				}
			}
			if(inspect==0) {
				break;
			}else {
				inspect=0;
				for(int i=0;i<6;i++) {
					lot_ar[i]=random.nextInt(45)+1;
				}
			}
		}
		
		//로또 번호 6개 생성
		int j=0;
		
		bonus=random.nextInt(45)+1;
		while(true) {

			if(lot_ar[j]==bonus) {
				bon_count++;
			}
			j++;
			if(j==6 && bon_count == 0) {
				break;
			}else if(j==6 && bon_count != 0 ) {
				bonus=random.nextInt(45)+1;
				j=0;
				bon_count=0;
			}
			
		}
		
		//보너스 번호 생성 및 중복 검사
		
		System.out.println("Lotto 번호:"+Arrays.toString(lot_ar)+" 보너스 번호:"+bonus);
		System.out.println("번호를 입력해주세요");
		
		for(int i=0;i<6;i++) {
			if(i>=1) {
				user_ar[i]=sc.nextInt();
				if(user_ar[i]==user_ar[i-1]) {
					while(true) {
						System.out.println("값이 중복됩니다. 다시 입력해주세요.");
						System.out.print(i+1+"번째 값:");
						user_ar[i]=sc.nextInt();
						if(user_ar[i]!=user_ar[i-1]) {
							break;
						}
					}
				}
			}else {
				user_ar[i]=sc.nextInt();
			}
		}
		
		System.out.println("User 번호:"+Arrays.toString(user_ar));
		
		bon_count=0;
		int k=0;
		System.out.println("보너스 번호를 입력해주세요");
		ur_bonus=sc.nextInt();
		while(true) {

			if(user_ar[k]==ur_bonus) {
				bon_count++;
			}
			k++;
			if(k==6 && bon_count == 0) {
				break;
			}else if(k==6 && bon_count != 0 ) {
				System.out.print("보너스 번호를 다시 입력해주세요:");
				ur_bonus=sc.nextInt();
				k=0;
				bon_count=0;
			}
			
		}
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("Lotto 번호:"+Arrays.toString(lot_ar)+" 보너스 번호:"+bonus);
		System.out.println("User 번호:"+Arrays.toString(user_ar)+" 보너스 번호:"+ur_bonus);
		
		for(int i=0;i<6;i++) {
			for(int l=0;l<6;l++) {
				if(lot_ar[i]==user_ar[l]) {
					count++;
				}
			}
		}
		if(count==6) {
			System.out.println("축하드립니다! 1등에 당첨되셨습니다!");
			System.out.println("+10000!");
		}else if(count==5 && bonus == ur_bonus) {
			System.out.println("축하드립니다! 2등에 당첨되셨습니다!");
			System.out.println("+5000!");
		}else if(count==5) {
			System.out.println("축하드립니다! 3등에 당첨되셨습니다!");
			System.out.println("+2000!");
		}else if(count==4) {
			System.out.println("축하드립니다! 4등에 당첨되셨습니다!");
			System.out.println("+500!");
		}else if(count==3) {
			System.out.println("축하드립니다! 5등에 당첨되셨습니다!");
			System.out.println("+100!");
		}else {
			System.out.println("꽝입니다.. 다음에 또 도전해주세요!");
		}
	
		sc.close();
	}

}
