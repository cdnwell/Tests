import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	/*
	 * baekjoon - 1043번
	 * 거짓말 할 수 있는 파티
	 * 답안 제출용
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
		
		Queue<Integer> queue = new LinkedList<>();
		boolean [] checkParty = new boolean[M]; // 번호를 맞춰주기 위해 +1
		Arrays.fill(checkParty, Boolean.FALSE);
		boolean [] checkPerson = new boolean[N+1];
		Arrays.fill(checkPerson, Boolean.FALSE);
		
//		int countingNum = 0;
//		for(boolean f : checkPerson) {
//			System.out.println(countingNum + " " + f);
//			countingNum++;
//		}
		//boolean 배열 값 확인을 위한 부분
		
		HashSet<Integer> setPeople = new HashSet<>();
		
		for(int i : set) {
			queue.add(i);
			setPeople.add(i);
		}//거짓말을 알고 있는 사람 번호 큐에 입력
		
		//---------------------입력 완료---------------------//
		
		// 1. 영향을 받은 사람 검색하기
		
		while(!queue.isEmpty()) {
			int knowPerson = queue.poll();
			for(int j =0;j<list.size();j++) {
				String s = list.get(j);
				int count = 0;
				String []sArr = s.split(" ");
				int numPerson = Integer.parseInt(sArr[0]);
				for(int i = 1; i <= numPerson ; i++) {
					if(Integer.parseInt(sArr[i])==knowPerson) {
						count++;
					}
				}
				if(count != 0) {
					for(int i =1 ; i<= numPerson ; i++) {
						int tmpNum = Integer.parseInt(sArr[i]);
						checkParty[j] = true;
						if(checkPerson[tmpNum]==true) continue;
						checkPerson[tmpNum] = true;
						queue.add(tmpNum);
					}
				}//큐의 값이 문자열 안의 숫자와 일치하면 if문을 실행시키고 처음부터 끝까지의 수 모두를 큐에 넣는다.
			}
		}//해시에 값 다 넣음

		//---------------------입력 완료---------------------//
		
		// 2. checkParty 배열로 파티 체크하기
		int result = 0;
		for(int i = 0; i<checkParty.length;i++) {
			if(!checkParty[i]) {
				result++;
//				System.out.println(i);
			}
		}
		
		System.out.println(result);
		
	}

}
