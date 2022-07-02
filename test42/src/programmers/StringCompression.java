package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class StringCompression {
	// 작업 미완료
	public static void main(String[] args) {
		
		HashMap<String, Integer> testMap = new HashMap<>();
		
		testMap.put("aabbaccc", 7);
		testMap.put("ababcdcdababcdcd", 9);
		testMap.put("abcabcdede", 8);
		testMap.put("abcabcabcabcdededededede", 14);
		testMap.put("xababcdcdababcdcd", 17);
		
		Set <String> set = testMap.keySet();
		Iterator<String> it = set.iterator();
		
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key + " : " + (compressor(key)==testMap.get(key) ? "success" : "fail"));
//		}
		
		String s = "aabbaccc";
		int num = 7;
		int len = compressor(s);
		
//		System.out.println("압축된 글자수 : " + len);
//		s=s.substring(0,1);
//		System.out.println(s);
	}

	private static int compressor(String s) {
		int answer = 0;
		
		String tmpNum = s;
		
		Queue<String> queue = new LinkedList<>();
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		
		for(int i=1;i<s.length()/2;i++) {
			ArrayList<String> strArr = new ArrayList<>();
			String tmp =s;
			for(int j=1;j<=s.length()/i;j++) {
				if(i>tmp.length()) break;
				String str = tmp.substring(0,i);
				strArr.add(str);
				tmp = tmp.substring(i,tmp.length());
			}
			if(tmp.length()>1) {
				strArr.add(tmp);
			}
			list.add(strArr);
		}
		
		for(int i =0;i<list.size();i++) {
			ArrayList<String> strArr= list.get(i);
			for(String str : strArr) {
				System.out.println(str);
			}
			System.out.println();
		}
		
		answer = strCheck(list,s);
		
		return answer;
		
	}

	private static int strCheck(ArrayList<ArrayList<String>> list, String s) {
		int answer = 0;
		
		//list에서 ArrayList 한개씩 뽑아낸다.
		for(int i =0;i<list.size();i++) {
			ArrayList<String> strArr= list.get(i);
			String tmp = s;		//원래 String 값
			Queue<String> queue = new LinkedList<String>();
			int count = 0;
			String strbox = "";
			for(String str : strArr) {
				if(!queue.isEmpty()) {
					String str1=queue.poll();
					if(str1.equals(str)) {
						count++;
					}else if(count != 0) {
							strbox += (count+1);
							strbox += queue.poll();
						count = 0;
					}else {
						strbox += str;
					}
				}else {
					queue.offer(str);
				}
			}
			System.out.println(strbox);
			
		}
		
		return answer;
	}
	
	

}
