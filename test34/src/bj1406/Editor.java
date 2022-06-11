package bj1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Editor {
	/*
	 * 백준 1406번 문제
	 * L : 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
	 * D : 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
	 * B : 커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
	 *	   삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
	 * P $ : $라는 문자를 커서 왼쪽에 추가함
	 * 
	 */
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
		//값 입력 받기 끝, BufferedReader close()
		br.close();
		//연산 시작----------------------------
		
		for(int i=0;i<num;i++) {
			
			if(strBox[i].length()==1) {
				
				if(strBox[i].equals("L")){
					//커서를 왼쪽으로 옮긴다.
					if(index<=cursor.size()) {
						cursor.offerFirst(cursor.pollLast());
						index++;
					}
				}else if(strBox[i].equals("D")){
					if(index>1) {
						cursor.offerLast(cursor.pollFirst());
						index--;
					}
					//커서를 오른쪽으로 옮긴다.
				}else{
					//strBox[i].equals("B")일 때
					//커서앞의 값을 없앤다.
					if(index!=cursor.size()+1) {
						cursor.pollLast();
					}
				}
				
			}else {
				String [] strTmp=strBox[i].split(" ");
				char charTmp = strTmp[1].charAt(0);
					cursor.offerLast(charTmp);
			}//if - else문 끝
			
		}//for문 끝
		
		//제자리로 큐 위치시켜서 출력하기----
		
		if(index <= cursor.size() && index > 1) {
			//커서가 제일 왼쪽에 위치하고 있는 경우 정렬이 옳바름으로 for문 실행하지 않는다.
			//제일오른쪽에 위치하고 있는 경우에도 실행하지 않는다.
			for(int i = 1 ; i<index; i++) {
				char temp = cursor.pollFirst();
				cursor.offerLast(temp);
			}
		}
		//출력하기----
		
		while(cursor.peek()!=null) {
			sb.append((char)cursor.poll());
		}
		
		System.out.println(sb.toString());
		
		
	}
	
}
