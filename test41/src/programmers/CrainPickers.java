package programmers;

import java.util.ArrayList;
import java.util.Stack;

public class CrainPickers {

	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		
		ArrayList<Stack<Integer>> list = new ArrayList<>();
		Stack<Integer> answerBox = new Stack<>();
		
		for(int i=0;i<board[0].length;i++) {
			list.add(new Stack<Integer>());
		}
		
		for(int i=board.length-1;i>=0;i--) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j]==0) {
					continue;
				}// 대입 되는 값이 0일 경우 continue
				list.get(j).push(board[i][j]);
			}
		}//list 작성 완료
		
//		TEST
		
//		for(int i=0;i<list.size();i++) {
//			int length = list.get(i).size();
//			for(int j=0;j<length;j++) {
//				System.out.print(list.get(i).pop()+" ");
//			}
//			System.out.println();
//		}
		
		
		for(int i=0;i<moves.length;i++) {
			int j = moves[i] - 1;
			
			// 1. list가 비어있을 경우 다음 명령어를 실행한다.
			if(list.get(j).isEmpty()) continue;
			
			// 2. answerBox에 값 넣기 ( 1개 추가 )
			if(answerBox.isEmpty()) {
				answerBox.push(list.get(j).pop());
			}else if(list.get(j).peek()!=answerBox.peek()) {
				answerBox.push(list.get(j).pop());
			}else {
				answerBox.pop();
				list.get(j).pop();
				answer++;
				answer++;
			}
			
		}
		
		System.out.println(answerBox.toString());
		System.out.println(answer);
		
	}

}
