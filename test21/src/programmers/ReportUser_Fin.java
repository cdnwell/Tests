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
        }//answer �� �ʱ�ȭ
        
        for(int i=0;i<report.length;i++) {
        	for(int j=i+1;j<report.length;j++) {
        		if(report[i].equals(report[j])) {
        			report[j] = null;
        		}
        	}
        }//�ߺ� ����
        
        int[] reportNo = new int[id_list.length];
        
        for(int i=0;i<reportNo.length;i++) {
        	reportNo[i] = 0;
        }//report Ƚ�� 0���� �ʱ�ȭ
        
        for(int i=0;i<list.length;i++) {
        	list[i][0]=id_list[i];
        	for(int j=1;j<list[i].length;j++) {
        		list[i][j]=null;
        	}
        }//list �ʱ�ȭ list[i][0]���� �� �迭�� �̿��� ID�� ����. 1���ʹ� �Ű��� ID�� ����.
        
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
        				}//reportNo�� �Ű���� Ƚ���� ���´�.
        			}
        		}
        	}
        }//������ �迭�� �Ű� ���� �� �־���.
        
        
        for(int i=0;i<reportNo.length;i++) {
        	if(reportNo[i]<k) {
        		id_list[i]=null;
        	}
        }//2ȸ �̻� �Ű� ���� ������ null���� �־���ش�.

        
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
        }//answer ���� ���ϱ�
        
        
        return answer;
    }
	
	
}
