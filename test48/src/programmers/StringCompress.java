package programmers;

import java.util.LinkedList;

public class StringCompress {
	/*
	 * programmers lv.2
	 * 문자열 압축
	 * 
	 */
	public static void main(String[] args) {
		String s = "aabbaccc";

		char[] chr_box = s.toCharArray();
		
		LinkedList <Character> list = new LinkedList<>();
		for(char c : chr_box) {
			list.add(c);
		}//String -> char[] -> LinkedList
		
		int length = list.size();		//새로 생성된 sb 길이와 비교하기 위한 값
		
		System.out.println(length+" "+s);
		System.out.println();
		
		for(int i=1;i<=list.size()/2;i++) {
				//i값은 중복확인 개수 String의 길이의 절반까지 검색
				//같은 문자가 나오면 count가 올라간다.
				int count = 0;
				boolean dif = false;
				boolean remain = true;
				int j=0;
				
				StringBuilder sb = new StringBuilder();
				int idx = 0;
			for(j=0;j+2*i-1<list.size();j=j+i) {
				remain = true;
				//list 인덱스 0부터 마지막 인덱스 까지 검색
				//비교 값의 끝 인덱스가 문자열의 길이보다 크면 안된다.
				for(int k=j;k<j+i;k++) {
//					if(j+2*i>=list.size()) {
//						remain = true;
//						break;	//j+2*i는 비교할 문자열의 끝 인덱스 +1
//					}
					
					//비교할 문자열의 끝 인덱스가 전체 인덱스를 넘을 경우 for문 break;
					if(list.get(k) != list.get(k+i)) {
						dif = true;		//앞의 문자열과 뒤 문자열이 다름을 boolean으로 표현
						break;	//다름이 확인된 후 for문 탈출
					}
					
				}//비교 for문 (앞 문자 + i 개수, 뒤 문자 + i 개수 만큼 비교)
				
				if(dif) {
					if (count == 0) {// 중복된 문자열의 개수
//						if(j+i>list.size()) {
//							for(int l =j;l<list.size();l++) {
//								sb.append(list.get(l));
//							}
//						} else {
							for(int k = j; k<j+i;k++) {
//								sb.append(" "+ k + " ");
								sb.append(list.get(k));
							}
//						}//j+i가 size를 넘어갈 경우
						//문자적기 숫자 없이
					} else {
						sb.append(count+1);//숫자 적기
						for(int k=idx;k<idx+i;k++) {
							sb.append(list.get(k));
						}//문자 적기 - *정확하지 않음
						count = 0;
					}
					dif = false;
				} else {
					idx = j;	//중복된 문자열의 시작 인덱스
					count++;
				}//문자가 같으면 count가 올라간다. dif가 true -> 두 문자열이 다르다. 
				//이전까지 count된 것을 바탕으로 숫자와 문자 추가
				
				//------------------------------------------------------------//
				//남은 문자열 출력하기//
				
				if(list.size()%i==0 && count != 0) {
//					sb.append(" " + count + " ");
					remain = false;
				}
				
			}// 문자열 비교 for문 종료
			
			//------------------------------------------------------------//
			
			//맨 마지막 count는 루프가 실행되지 않기 때문에 따로 해줘야한다.
			if(count != 0) {
				sb.append(count+1);//숫자 적기
				for(int k=idx;k<idx+i;k++) {
					sb.append(list.get(k));
				}//문자 적기 - *정확하지 않음
				count = 0;
			}
			
			//------------------------------------------------------------//
			
			if(remain || j == 0) {
				for(int k=j;k<list.size();k++) {
//					sb.append(" "+k+" ");
					sb.append(list.get(k));
				}
			}
			
			//sb.length(); 새로 추가된 숫자, 중복 문자열 길이 기존 문자열 길이와 비교 작은 값을 length로
			length = Math.min(sb.length(), length);
			System.out.println(i+" "+sb);
			
		}
		
		System.out.println(length);
	}

}
