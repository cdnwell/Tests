package programmers;

import java.util.Arrays;
import java.util.Random;

public class LottoNum {
	/*
	 * 프로그래머스 - 로또의 최고 순위와 최저 순위
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int [] lottos = new int[6];
		int [] win_nums = new int[6];
		
		for(int i=0;i<6;i++) {
			lottos[i]=-1;
			win_nums[i]=-1;
		}//초기화
		
		for(int i=0;i<6;i++) {
			int num=r.nextInt(46);
			for(int j=0;j<6;j++) {
				if(lottos[j]==num && num != 0) {
					num =r.nextInt(46);
					j=-1;
				}
			}
			lottos[i]=num;
		}//lottos 중복 검사
		
		for(int i=0;i<6;i++) {
			int num=r.nextInt(45)+1;
			for(int j=0;j<6;j++) {
				if(win_nums[j]==num && num != 0) {
					num =r.nextInt(45)+1;
					j=-1;
				}
			}
			win_nums[i]=num;
		}//win_nums 중복검사
		
		int count =0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(win_nums[j]==lottos[i]) {
					count++;
					break;
				}
			}
		}
		
		int count_zero =0;
		
		for(int i=0;i<6;i++) {
			if(lottos[i]==0) {
				count_zero++;
			}
		}
		
		int [] answer = new int[2];
		int ans_num=count+count_zero;
		
		answer[0]=7-ans_num > 6 ? 6 : 7-ans_num ;

		answer[1]=7-count > 6 ? 6 : 7-ans_num;
		
		System.out.println("lottos"+"\t"+"\t"+"\t"+"\t"+"win_nums"+"\t"+"\t"+"\t"+"result");
		System.out.print(Arrays.toString(lottos)+"\t"+"\t");
		System.out.print(Arrays.toString(win_nums)+"\t"+"\t");
		System.out.println(Arrays.toString(answer));
	} 

}
