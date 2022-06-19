package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ReportUser {
	/*
	 * StringBuilder 인스턴스의 값을 없애준다.
	 * sb.setLength(0);
	 */
	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		
		int[] answer = new int[id_list.length];
		
		HashMap<String, HashSet<String>> map = new HashMap<>();
		HashMap<String, Integer> mapIdx = new HashMap<>();
		HashMap<String, HashSet<String>> mapBox = new HashMap<>();
		
		
		for(int i=0;i<id_list.length;i++) {
			mapIdx.put(id_list[i], i);
			map.put(id_list[i],new HashSet<>());
			mapBox.put(id_list[i],new HashSet<>());
		}//초기화
		
		
		for(String s : report) {
			String from = s.split(" ")[0];
			String to = s.split(" ")[1];
			map.get(to).add(from);
			mapBox.get(from).add(to);
		}//데이터 넣어주기
		

		//맵의 값으로 신고된 횟수 구하기
		for(int i=0;i<id_list.length;i++) {
			HashSet<String> setTmp1 = map.get(id_list[i]);
			
			if(setTmp1.size()>=k) {
				for(int j=0;j<id_list.length;j++) {
					HashSet<String> setTmp2 = mapBox.get(id_list[j]);
					Iterator <String> it = setTmp2.iterator();
					while(it.hasNext()) {
						String s = it.next();
						if(s.equals(id_list[i])) {
							answer[mapIdx.get(id_list[j])]++;
						}
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
