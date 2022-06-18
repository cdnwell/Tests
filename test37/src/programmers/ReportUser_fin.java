package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ReportUser_fin {

	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<>();
		HashSet<String> listSort = new HashSet<String>();
		HashMap<String,Integer> reportList = new HashMap<>();
		ArrayList<String> reportBox = new ArrayList<>();
		
		
		StringBuilder sb = new StringBuilder();
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
		
		
		String str1="";
		String str2="";
		
		for(int i=0;i<id_list.length;i++) {
			int count =0;
			listSort.clear();
			for(int j=0;j<report.length;j++) {
				str1 = report[j].split(" ")[0];
				str2 = report[j].split(" ")[1];	
				
				if(id_list[i].equals(str1)) {
					listSort.add(str2);
					
				}
			}
			
			if(!listSort.isEmpty()) {
				Iterator<String> itCnt = listSort.iterator();
				while(itCnt.hasNext()) {
					String s = itCnt.next();
					count++;
				}
				sb.append(count + " ");
				Iterator<String> it = listSort.iterator();
				while(it.hasNext()) {
					String s = it.next();
					sb.append(s+" ");
				}
				String strTmp = sb.toString();
				list.put(id_list[i], strTmp);
				sb.setLength(0); 
			}else{
				sb.append(count + " ");
				String strTmp = sb.toString();
				list.put(id_list[i], strTmp);
				sb.setLength(0); 
			}
			
		} 
		
		
		for(int i=0;i<id_list.length;i++) {
			String str = list.get(id_list[i]);
			
			int intTmp = Integer.parseInt(str.split(" ")[0]);
					
			if(intTmp == 0) continue;
			for(int j = 1; j <= intTmp; j++) {
				reportBox.add(str.split(" ")[j]);
			}
			
		}
		
		for(int i=0;i<id_list.length;i++) {
			int count = 0;
			Iterator<String> it = reportBox.iterator();
			while(it.hasNext()) {
				String s = it.next();
				if(id_list[i].equals(s)) {
					count++;
				}
			}
			reportList.put(id_list[i], count);
		}
		
		
		reportBox.clear();
		for(int i=0;i<id_list.length;i++) {
			int reportCnt = 0;
			reportCnt = reportList.get(id_list[i]);
			
			if(reportCnt >= k) {
				reportBox.add(id_list[i]);
			}
		}
		
		
		int []answer = new int[id_list.length];
		for(int i=0;i<id_list.length;i++) {
			listSort.clear();
			
			String str = list.get(id_list[i]);
			
			int intTmp = Integer.parseInt(str.split(" ")[0]);
					
			for(int j = 1; j <= intTmp; j++) {
				listSort.add(str.split(" ")[j]);
			}
			
			Iterator<String> it = listSort.iterator();
			
			int count = 0;
			while(it.hasNext()) {
				String s = it.next();
				
				for(String strTmp : reportBox) {
					if(s.equals(strTmp)) {
						count++;
					}
				}
			}
			answer[i]=count;
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
