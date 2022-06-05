package programmers;

import java.util.Arrays;

public class ReportResultRecieve {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
				,"apeach frodo","muzi neo","frodo neo"};
		int k = 2;
		
		int[] answer = new int[id_list.length];
		
		//1.중복제거
		//2.신고횟수 계산
		//3.신고횟수에 따라 정지된 아이디 선별
		
		int end_count = report.length-1;
		for(int i =0;i<report.length-1;i++) {
			if(report[i]==null) continue;
			for(int j=i+1;j<report.length;j++) {
				if(report[i].equals(report[j]) && report[j] != null) {
					report[j]=null;
					for(int l=j;l<=end_count-1;l++) {
						report[l]=report[l+1];
						if(l==end_count-1) {
							report[end_count] = null;
							end_count--;
						}
					}//값을 한칸씩 땡겨오기
					j=i;
				}//중복 제거
				
			}
		}
		//중복 제거 완료
		end_count--;	//end_count가 마지막에 가리키는 인덱스가 범위보다 하나 더 많다.
		//end_count는 배열의 갯수가 아니라 인덱스 끝값이다.
		
		String [] report_cp = Arrays.copyOf(report, end_count+1);
		
		
		for(int i =0 ; i<report_cp.length;i++) {
			String[] str_split = report_cp[i].split(" ");
			
		}
			
	}

}
