package programmers;

import java.util.Arrays;

public class ReportUser_Fin {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo","apeach muzi"};
		int k = 2;
		
		int [] answer = solution(id_list, report, k);
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
       	String [][] list = new String[id_list.length][id_list.length];
        int num =0;
       	
        for(int i=0;i<answer.length;i++) {
        	answer[i]=0;
        }//answer 값 초기화
        
        for(int i=0;i<report.length;i++) {
        	for(int j=i+1;j<report.length;j++) {
        		if(report[i].equals(report[j])) {
        			report[j] = null;
        		}
        	}
        }//중복 제거
        
        int[] reportNo = new int[id_list.length];
        
        for(int i=0;i<reportNo.length;i++) {
        	reportNo[i] = 0;
        }//report 횟수 0으로 초기화
        
        for(int i=0;i<list.length;i++) {
        	list[i][0]=id_list[i];
        	for(int j=1;j<list[i].length;j++) {
        		list[i][j]=null;
        	}
        }//list 초기화 list[i][0]에는 그 배열의 이용자 ID가 담긴다. 1부터는 신고한 ID가 담긴다.
        
        for(int i=0;i<report.length;i++) {
        	if(report[i] != null) {
        		String[] str_tmp = report[i].split(" ");
        		for(int j=0;j<id_list.length;j++) {
        			if(str_tmp[0].equals(list[j][0])) {
        				num = 0;
        				while(true) {
        					if(list[j][num]== null) {
        						break;
        					}
        					num++;
        				}
        				list[j][num]=str_tmp[1];
        				for(int l=0;l<id_list.length;l++) {
        					if(str_tmp[1].equals(id_list[l])) {
        						reportNo[l]++;
        					}
        				}//reportNo에 신고당한 횟수를 적는다.
        			}
        		}
        	}
        }//이차원 배열에 신고 값을 다 넣었다.
        
        
        for(int i=0;i<reportNo.length;i++) {
        	if(reportNo[i]<k) {
        		id_list[i]=null;
        	}
        }//2회 이상 신고를 받지 않으면 null값을 주어없앤다.

        
        for(int i=0;i<list.length;i++) {
        	for(int j=1;j<list[i].length;j++){
        		if(list[i][j]==null)
        			break;
        		for(int l=0;l<id_list.length;l++) {
        			if(id_list[l] != null && id_list[l].equals(list[i][j])) {
        				answer[i]++;
        			}
        			
        		}
        	}
        }//answer 값에 더하기
        
        
        return answer;
    }
	
	
}
