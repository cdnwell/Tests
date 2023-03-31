package pg160585;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class SoloTicTacToe {

    public static void main(String[] args) {
        // 1. 아무런 값이 입력되지 않았을 경우 : true
        // 2. 두 개의 한 줄이 나온 경우 : false
        // 2.1 한 줄이 나오는 경우 계산 함수 : lineChecker
        // 3. X가 O보다 많은 경우 : false
        // 4. X가 먼저 나온 경우 : false

        String[] board = {"...", ".X.", "..."};
        System.out.println(solution(board));
    }

    public static int solution(String[] board) {
        int answer = 1;

        Board boardObj = new Board(board);

        int[][] boardArr = boardObj.getBoardArr();
        boardObj.info();

        int oSum = oxSum(boardArr, 1);
        int xSum = oxSum(boardArr, -1);

        System.out.println("oSum : " + oSum);
        System.out.println("xSum : " + xSum);

        int oLineCheck = lineChecker(boardArr, 1);
        int xLineCheck = lineChecker(boardArr, -1);
        System.out.println("oLineCheck : " + oLineCheck);
        System.out.println("xLineCheck : " + xLineCheck);

        // 1. O, X의 개수
        // 1.1. X가 O보다 많은 경우
        // 1.2. O가 X보다 2개 이상 많은 경우
        // -> false, 0
        if(xSum > oSum || oSum > xSum + 1) return 0;

        // 3. 둘 다 이긴 경우
        // -> false, 0
        if(oLineCheck > 0 && xLineCheck > 0) return 0;

        // 4. O가 이겼지만 O가 1개 더 많지 않을 경우
        // -> false, 0
        if(oLineCheck > 0 && oSum != xSum + 1) return 0;

        // 5. X가 이겼지만 O와 X 개수가 같지 않을 경우
        // -> false, 0
        if(xLineCheck > 0 && oSum != xSum) return 0;

        return answer;
    }

    public static int oxSum(int[][] boardArr, int figure) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardArr[i][j] == figure) {
                    sum++;
                }
            }
        }

        return sum;
    }

    public static int lineChecker(int[][] boardArr, int figure) {
        int lines = 0;

        for (int i = 0; i < 3; i++) {
            // a. 가로 체크
            if (boardArr[i][0] == figure && boardArr[i][0] == boardArr[i][1] && boardArr[i][2] == boardArr[i][1]) {
                lines++;
            }
            // b. 세로 체크
            if (boardArr[0][i] == figure && boardArr[0][i] == boardArr[1][i] && boardArr[2][i] == boardArr[1][i]) {
                lines++;
            }
            // c. 대각선 체크, 왼쪽 위에서 오른쪽 아래로
            if (boardArr[0][0] == figure && boardArr[0][0] == boardArr[1][1] && boardArr[1][1] == boardArr[2][2]) {
                lines++;
            }
            // d. 대각선 체크, 오른쪽 위에서 왼쪽 아래로
            if (boardArr[0][2] == figure && boardArr[0][2] == boardArr[1][1] && boardArr[1][1] == boardArr[2][0]) {
                lines++;
            }
        }

        return lines;
    }

}

class Board {
    private int[][] boardArr;

    public Board(String[] board) {
        int[][] boardArr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'O') {
                    boardArr[i][j] = 1;
                } else if (board[i].charAt(j) == 'X') {
                    boardArr[i][j] = -1;
                } else {
                    boardArr[i][j] = 0;
                }
            }
        }

        this.boardArr = boardArr;
    }

    public int[][] getBoardArr() {
        return boardArr;
    }

    public void info() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(boardArr[i]));
        }
    }

}
