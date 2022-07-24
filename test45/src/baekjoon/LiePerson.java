package baekjoon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class LiePerson {
	/*
	 * baekjoon - 1043번
	 * 거짓말 할 수 있는 파티
	 */
	public static void main(String[] args) {
		int N; // 사람의 수 
		int M; // 파티의 수
		Scanner sc = new Scanner(System.in);
		
		String nandm = sc.nextLine();
		N = Integer.parseInt(nandm.split(" ")[0]);
		M = Integer.parseInt(nandm.split(" ")[1]);
		
		String knowPeople = sc.nextLine();
		int knowPeopleNum = Integer.parseInt(knowPeople.split(" ")[0]);
		
		HashSet<Integer> set = new HashSet<>();
		//지민이의 거짓말을 알고있는 사람의 번호
		
		String[] knowPeopleSplit = knowPeople.split(" ");
		
		for(int i =1;i<knowPeopleSplit.length;i++) {
			set.add(Integer.parseInt(knowPeopleSplit[i]));
		}//set에 knowPeople 값 중 첫 번째 값(거짓말을 알고 있는 사람의 수) 뺴고 넣어줌
		
		LinkedList<String> list = new LinkedList<>();
		
		for(int i =0;i<M;i++) {
			String s = sc.nextLine();
			list.add(s);
		}//파티에 오는 사람과 오는 사람의 번호를 LinkedList에 넣는다.
		//LinkedList 사용 이유는 제거하기 쉽게 하기 위해서 결과 값으로 LinkedList 사이즈를 받음
		
		//---------------------입력 완료---------------------//
		
		// 1. 영향을 받은 사람 검색하기
		
		for(int num : set) {
			for(String s : list) {
				int count = 0;
				String[] s_split = s.split(" ");
				int s_num = Integer.parseInt(s_split[0]);
				for(int i = 1; i<=s_num ; i++) {
					int s_tmp = Integer.parseInt(s_split[i]);
					if(num == s_tmp) {
						count++;
					}
				}
				if(count != 0) {
					for(int i = 1;i<=s_num ; i++) {
						set.add(Integer.parseInt(s_split[i]));
					}
				}
			}
		}// for each문 끝
		
		System.out.println(set.toString());
		
	}

}
