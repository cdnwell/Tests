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
			return 0;	//str 배열이 존재하지 않으면 0을 반환하고 메서드를 종료시킨다.
		
		boolean groupbool=false;	//true : 그룹 단어 , false : 그룹 단어가 아님 
		
		int groupNo=0;
		
		int initialNum=str[0].length();
		for(int i=0;i<str.length;i++) {
			if(initialNum<str[i].length()) {
				initialNum=str[i].length();
			}
		}//각 단어를 담을 int형 배열의 index 최대값을 구했다.
		
		int []wordTmp =new int[initialNum];		
		
		for(int i=0;i<str.length;i++) {
			
			groupbool = false;
			
			for(int j=0;j<initialNum;j++) {
				wordTmp[j]='\0';
			}//초기화
			
			for(int j=0;j<str[i].length();j++) {
				wordTmp[j]=str[i].charAt(j);
			}//임시배열에 대입
			
			for(int j=0;j<str[i].length()-1;j++) {
				if(wordTmp[j]==wordTmp[j+1]) {// wordTmp배열을 한칸 씩 땡김
					for(int k=j;k<wordTmp.length-1;k++) {
						wordTmp[k]=wordTmp[k+1];
					}
					wordTmp[str[i].length()-1]='\0';// wordTmp배열의 끝 값을 0으로 만들어줌
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
