package programmers;

import java.util.Arrays;

public class ReportResultRecieve {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
				,"apeach frodo","muzi neo","frodo neo"};
		int k = 2;
		
		int[] answer = new int[id_list.length];
		
		//1.�ߺ�����
		//2.�Ű�Ƚ�� ���
		//3.�Ű�Ƚ���� ���� ������ ���̵� ����
		
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
					}//���� ��ĭ�� ���ܿ���
					j=i;
				}//�ߺ� ����
				
			}
		}
		//�ߺ� ���� �Ϸ�
		end_count--;	//end_count�� �������� ����Ű�� �ε����� �������� �ϳ� �� ����.
		//end_count�� �迭�� ������ �ƴ϶� �ε��� �����̴�.
		
		String [] report_cp = Arrays.copyOf(report, end_count+1);
		
		
		for(int i =0 ; i<report_cp.length;i++) {
			String[] str_split = report_cp[i].split(" ");
			
		}
			
	}

}
