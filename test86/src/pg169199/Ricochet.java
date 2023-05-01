package pg169199;

import java.util.LinkedList;
import java.util.Queue;

public class Ricochet {

    public static void main(String[] args) {
        String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        int result = solution(board);
        System.out.println(result);
    }

    public static int solution(String[] board) {
        Coordinate robot = null;
        Coordinate goal = null;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if(board[i].charAt(j) == 'R') robot = new Coordinate(j, i, 0);
                if(board[i].charAt(j) == 'G') goal = new Coordinate(j, i, 0);
            }
        }

        int result = bfs(board, robot, goal);

        return result;
    }

    public static int bfs(String[] board, Coordinate robot, Coordinate goal) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(robot);

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int row = board.length;
        int col = board[0].length();

        boolean[][] visited = new boolean[row][col];

        // start위치 true로 표시
        visited[robot.y][robot.x] = true;

        while(!queue.isEmpty()) {
            Coordinate coor = queue.poll();

            if(coor.x == goal.x && coor.y == goal.y) return coor.depth;

            for (int i = 0; i < 4; i++) {
                boolean checked = false;
                int nx = coor.x;
                int ny = coor.y;

                while(nx >= 0 && ny >=0 && nx < col && ny < row && board[ny].charAt(nx) != 'D') {
                    nx += dx[i];
                    ny += dy[i];
                    checked = true;
                }

                if(checked) {
                    nx -= dx[i];
                    ny -= dy[i];
                }

                if(visited[ny][nx] || (coor.x == nx && coor.y == ny)) continue;

                visited[ny][nx] = true;
                queue.add(new Coordinate(nx, ny, coor.depth + 1));
            }

        }

        return -1;

    }

}


class Coordinate{
    int x;
    int y;
    int depth;

    public Coordinate(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
    }

}
