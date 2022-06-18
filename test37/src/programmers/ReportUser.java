package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ReportUser {

	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<>();
		HashSet<String> listSort = new HashSet<String>();
		HashMap<String,Integer> reportList = new HashMap<>();
		ArrayList<String> reportBox = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		
//		String[] id_list = { "con", "ryan" };
//		String[] report = {"ryan con","ryan con","ryan con","ryan con"};
//		int k = 3;
		
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
					System.out.println(id_list[i]+" "+str2);
					
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
			
		}//데이터 입력
		
		
		//-----------------테스트-----------------//
		for(int i=0;i<id_list.length;i++) {
			String strTmp = list.get(id_list[i]);
			System.out.println(id_list[i]+" : "+ strTmp);
		}//list에서 값을 꺼내어 정확히 들어갔는지 확인한다.
		//-----------------테스트-----------------//
		
		
		for(int i=0;i<id_list.length;i++) {
			String str = list.get(id_list[i]);
			
			int intTmp = Integer.parseInt(str.split(" ")[0]);
					
			if(intTmp == 0) continue;
			for(int j = 1; j <= intTmp; j++) {
				reportBox.add(str.split(" ")[j]);
			}//hashset으로 중복값 모두 제거했으니 다 열거해서 값을 넣어주어도 된다.
			
		}
		
		//유저에게 신고한 횟수 count reportList에 string, integer값 넣기
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
		
		
		reportBox.clear();//reportBox <String>을 재사용하기 위해 clear()
		//유저에게 신고당한 횟수 k회 이상인 경우 체크
		//reportBox는 ArrayList이다.
		for(int i=0;i<id_list.length;i++) {
			int reportCnt = 0;
			reportCnt = reportList.get(id_list[i]);
			
			if(reportCnt >= k) {
				//k횟수 이상 신고를 받으면 그 이름을 기억한다.
				reportBox.add(id_list[i]);
			}
		}
		
		
		//reportBox에 저장된 신고횟수 k회 이상을 받은 id를 비교해서 count해준다.
		//hashMap의 변수 명은 list이다. 초기 신고 값을 저장한 변수이다.
		//변수는 String(key), HashSet<String>(value)로 담았다.
		int []answer = new int[id_list.length];
		for(int i=0;i<id_list.length;i++) {
			listSort.clear();//재활용을 위해 초기화해준다.
			
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
		}//answer에 count값을 담는다.
		
		System.out.println(Arrays.toString(answer));
		
	}//main 메서드 끝

}
