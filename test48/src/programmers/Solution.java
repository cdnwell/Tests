package programmers;

import java.util.LinkedList;

class Solution {
	public int solution (String s) {
		int answer = 0;
		
		char[] chr_box = s.toCharArray();
		
		LinkedList <Character> list = new LinkedList<>();
		for(char c : chr_box) {
			list.add(c);
		} 
		
		int length = list.size();		 
		
		for(int i=1;i<=list.size()/2;i++) {
				int count = 0;
				boolean dif = false;
				boolean remain = true;
				int j=0;
				
				StringBuilder sb = new StringBuilder();
				int idx = 0;
			for(j=0;j+2*i-1<list.size();j=j+i) {
				remain = true;
				for(int k=j;k<j+i;k++) {
					if(list.get(k) != list.get(k+i)) {
						dif = true;		 
						break;	 
					}
					
				} 
				
				if(dif) {
					if (count == 0) { 
						for(int k = j; k<j+i;k++) {
							sb.append(list.get(k));
						}
					} else {
						sb.append(count+1); 
						for(int k=idx;k<idx+i;k++) {
							sb.append(list.get(k));
						} 
						count = 0;
					}
					dif = false;
				} else {
					idx = j;	 
					count++;
				} 
				
				if(list.size()%i==0 && count != 0) {
					remain = false;
				}
				
			} 
			if(count != 0) {
				sb.append(count+1); 
				for(int k=idx;k<idx+i;k++) {
					sb.append(list.get(k));
				} 
				count = 0;
			}
			
			if(remain || j == 0) {
				for(int k=j;k<list.size();k++) {
					sb.append(list.get(k));
				}
			}
			
			length = Math.min(sb.length(), length);
			
		}
		
		answer = length;
		
		return answer;
	}

}
