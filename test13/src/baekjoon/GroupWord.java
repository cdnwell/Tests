package baekjoon;

import java.util.Scanner;

public class GroupWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str=null;
		int wordNo;
		
		int strNo = sc.nextInt();
		sc.nextLine();
		
		str = new String[strNo];
		
		for(int i=0;i<str.length;i++) {
			str[i]=sc.nextLine();
		}
		
		wordNo = groupWordCheck(str);
		
		System.out.println(wordNo);
		
		
	}
	
	public static int groupWordCheck(String[] str) {
		if (str.length==0)
			return 0;	//str �迭�� �������� ������ 0�� ��ȯ�ϰ� �޼��带 �����Ų��.
		
		boolean groupbool=false;	//true : �׷� �ܾ� , false : �׷� �ܾ �ƴ� 
		
		int groupNo=0;
		
		int initialNum=str[0].length();
		for(int i=0;i<str.length;i++) {
			if(initialNum<str[i].length()) {
				initialNum=str[i].length();
			}
		}//�� �ܾ ���� int�� �迭�� index �ִ밪�� ���ߴ�.
		
		int []wordTmp =new int[initialNum];		
		
		for(int i=0;i<str.length;i++) {
			
			groupbool = false;
			
			for(int j=0;j<initialNum;j++) {
				wordTmp[j]='\0';
			}//�ʱ�ȭ
			
			for(int j=0;j<str[i].length();j++) {
				wordTmp[j]=str[i].charAt(j);
			}//�ӽù迭�� ����
			
			for(int j=0;j<str[i].length()-1;j++) {
				if(wordTmp[j]==wordTmp[j+1]) {// wordTmp�迭�� ��ĭ �� ����
					for(int k=j;k<wordTmp.length-1;k++) {
						wordTmp[k]=wordTmp[k+1];
					}
					wordTmp[str[i].length()-1]='\0';// wordTmp�迭�� �� ���� 0���� �������
				}
				
			}
			
//			for(int j=0;j<wordTmp.length;j++) {
//				System.out.print((char)wordTmp[j]);
//			}
			for(int j=0;j<initialNum;j++) {
				if(wordTmp[j]=='\0') {
					break;
				}
				for(int k=j+1;k<initialNum;k++) {
					if(wordTmp[j]==wordTmp[k]) {
						groupbool=true;
						break;
					}
				}
			}
			
//			for(int j=0;j<wordTmp.length && !groupbool ;j++) {
//				System.out.print((char)wordTmp[j]);
//			}
//			if(!groupbool) {
//				System.out.println();
//			}
			
			if(groupbool == false) {
				groupNo +=1;
			}
			
		}
		
		return groupNo;
		
		//a = 97 , z = 122
		
	}

}
