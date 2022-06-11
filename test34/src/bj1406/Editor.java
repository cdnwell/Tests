package bj1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Editor {
	/*
	 * ���� 1406�� ����
	 * L : Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
	 * D : Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
	 * B : Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
	 *	   ������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������, ������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
	 * P $ : $��� ���ڸ� Ŀ�� ���ʿ� �߰���
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
		//�� �Է� �ޱ� ��, BufferedReader close()
		br.close();
		//���� ����----------------------------
		
		for(int i=0;i<num;i++) {
			
			if(strBox[i].length()==1) {
				
				if(strBox[i].equals("L")){
					//Ŀ���� �������� �ű��.
					if(index<=cursor.size()) {
						cursor.offerFirst(cursor.pollLast());
						index++;
					}
				}else if(strBox[i].equals("D")){
					if(index>1) {
						cursor.offerLast(cursor.pollFirst());
						index--;
					}
					//Ŀ���� ���������� �ű��.
				}else{
					//strBox[i].equals("B")�� ��
					//Ŀ������ ���� ���ش�.
					if(index!=cursor.size()+1) {
						cursor.pollLast();
					}
				}
				
			}else {
				String [] strTmp=strBox[i].split(" ");
				char charTmp = strTmp[1].charAt(0);
					cursor.offerLast(charTmp);
			}//if - else�� ��
			
		}//for�� ��
		
		//���ڸ��� ť ��ġ���Ѽ� ����ϱ�----
		
		if(index <= cursor.size() && index > 1) {
			//Ŀ���� ���� ���ʿ� ��ġ�ϰ� �ִ� ��� ������ �ǹٸ����� for�� �������� �ʴ´�.
			//���Ͽ����ʿ� ��ġ�ϰ� �ִ� ��쿡�� �������� �ʴ´�.
			for(int i = 1 ; i<index; i++) {
				char temp = cursor.pollFirst();
				cursor.offerLast(temp);
			}
		}
		//����ϱ�----
		
		while(cursor.peek()!=null) {
			sb.append((char)cursor.poll());
		}
		
		System.out.println(sb.toString());
		
		
	}
	
}
