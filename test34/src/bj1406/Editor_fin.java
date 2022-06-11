package bj1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Editor_fin {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Character> cursor = new LinkedList<Character>();
		int index = 1;
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		char []charBox = str.toCharArray();
		for(char charNo : charBox) {
			cursor.offer(charNo);
		}
		
		int num = Integer.parseInt(br.readLine());
		String [] strBox = new String[num];
		
		for(int i =0;i<num;i++) {
			strBox[i]=br.readLine();
		}
		br.close();
		
		
		for(int i=0;i<num;i++) {
			
			if(strBox[i].length()==1) {
				
				if(strBox[i].equals("L")){
					if(index<=cursor.size()) {
						cursor.offerFirst(cursor.pollLast());
						index++;
					}
				}else if(strBox[i].equals("D")){
					if(index>1) {
						cursor.offerLast(cursor.pollFirst());
						index--;
					}
				}else{
					if(index!=cursor.size()+1) {
						cursor.pollLast();
					}
				}
				
			}else {
				String [] strTmp=strBox[i].split(" ");
				char charTmp = strTmp[1].charAt(0);
					cursor.offerLast(charTmp);
			}
			
		}
		if(index <= cursor.size() && index > 1) {
			for(int i = 1 ; i<index; i++) {
				char temp = cursor.pollFirst();
				cursor.offerLast(temp);
			}
		}
		
		
		while(cursor.peek()!=null) {
			sb.append((char)cursor.poll());
		}
		
		
		System.out.println(sb.toString());
		
	}
	
}
