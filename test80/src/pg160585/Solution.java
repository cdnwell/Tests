package pg160585;

public class Solution {
    public static int solution(String[] board) {
        int answer = 1;

        pg160585.Board boardObj = new pg160585.Board(board);

        int[][] boardArr = boardObj.getBoardArr();

        if (!oxChecker(boardArr)) return 0;

        if (!winChecker(boardArr)) return 0;

        if (!oWinChecker(boardArr)) return 0;

        if (!xWinChecker(boardArr)) return 0;

        return answer;
    }

    public static boolean oxChecker(int[][] boardArr) {
        int x = 0;
        int o = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardArr[i][j] == 1) {
                    o++;
                } else if (boardArr[i][j] == -1) {
                    x++;
                }
            }
        }

        if (x > o || o > x + 1) return false;

        return true;
    }

    public static boolean winChecker(int[][] boardArr) {
        int result = 0;

        for (int i = 0; i < 3; i++) {
            if (boardArr[i][0] == boardArr[i][1] && boardArr[i][2] == boardArr[i][1] && boardArr[i][0] != 0) {
                result++;
            }
            if (boardArr[0][i] == boardArr[1][i] && boardArr[2][i] == boardArr[1][i] && boardArr[0][i] != 0) {
                result++;
            }
            if (boardArr[0][0] == boardArr[1][1] && boardArr[1][1] == boardArr[2][2] && boardArr[0][0] != 0) {
                result++;
            }
            if (boardArr[0][2] == boardArr[1][1] && boardArr[1][1] == boardArr[2][0] && boardArr[0][2] != 0) {
                result++;
            }
        }

        if (result > 1) return false;

        return true;
    }

    public static boolean oWinChecker(int[][] boardArr) {
        int result = 0;

        for (int i = 0; i < 3; i++) {
            if (boardArr[i][0] == boardArr[i][1] && boardArr[i][2] == boardArr[i][1] && boardArr[i][0] == 1) {
                result++;
            }
            if (boardArr[0][i] == boardArr[1][i] && boardArr[2][i] == boardArr[1][i] && boardArr[0][i] == 1) {
                result++;
            }
            if (boardArr[0][0] == boardArr[1][1] && boardArr[1][1] == boardArr[2][2] && boardArr[0][0] != 1) {
                result++;
            }
            if (boardArr[0][2] == boardArr[1][1] && boardArr[1][1] == boardArr[2][0] && boardArr[0][2] != 1) {
                result++;
            }
        }

        int o = 0;
        int x = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardArr[i][j] == 1) {
                    o++;
                } else if (boardArr[i][j] == -1) {
                    x++;
                }
            }
        }

        if (o != x + 1 && result != 1) return false;

        return true;
    }

    public static boolean xWinChecker(int[][] boardArr) {
        int result = 0;

        for (int i = 0; i < 3; i++) {
            if (boardArr[i][0] == boardArr[i][1] && boardArr[i][2] == boardArr[i][1] && boardArr[i][0] == -1) {
                result++;
            }
            if (boardArr[0][i] == boardArr[1][i] && boardArr[2][i] == boardArr[1][i] && boardArr[0][i] == -1) {
                result++;
            }
            if (boardArr[0][0] == boardArr[1][1] && boardArr[1][1] == boardArr[2][2] && boardArr[0][0] != -1) {
                result++;
            }
            if (boardArr[0][2] == boardArr[1][1] && boardArr[1][1] == boardArr[2][0] && boardArr[0][2] != -1) {
                result++;
            }
        }

        int o = 0;
        int x = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardArr[i][j] == 1) {
                    o++;
                } else if (boardArr[i][j] == -1) {
                    x++;
                }
            }
        }

        if (o != x && result != 1) return false;

        return true;
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

    }

}


