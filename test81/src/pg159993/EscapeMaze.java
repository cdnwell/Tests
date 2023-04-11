package pg159993;

import java.awt.*;
import java.util.LinkedList;

public class EscapeMaze {

    public static void main(String[] args) {
        String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
        solution(maps);
    }

    public static int solution(String[] maps) {
        int answer = 0;

        Maze maze = new Maze(maps);
        maze.printMaze();

        char[][] mazeArr = maze.getMaze();

        Coordiante start = findPurposeCoordinate(mazeArr, 'S');
        Coordiante lever = findPurposeCoordinate(mazeArr, 'L');

        int toLever = bfs(mazeArr, start, 'L');
        if(toLever == -1) return -1;

        int toEnd = bfs(mazeArr, lever, 'E');
        if(toEnd == -1) return -1;

        answer = toLever + toEnd;

        System.out.println("answer : " + answer);

        return answer;
    }

    public static Coordiante findPurposeCoordinate(char[][] maze, char purpose) {
        Coordiante start = null;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == purpose) {
                    // i는 y좌표, j는 x좌표
                    start = new Coordiante(j, i, 0);
                }
            }
        }

        return start;
    }

    public static int bfs(char[][] maze, Coordiante start, char end) {
        LinkedList<Coordiante> queue = new LinkedList<>();

        // 1. 큐에 start 넣기
        queue.add(start);

        // 2. 방문체크 배열
        int[][] visited = new int[maze.length][maze[0].length];

        // 3. 방문 체크 x, y 좌표
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        // 4. queue가 빌 때까지 반복 : bfs
        while(!queue.isEmpty()) {
            Coordiante current = queue.poll();
            int x = current.x;
            int y = current.y;
            int level = current.level;

            if (maze[y][x] == end) {
                return level;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                // a. 구간을 벗어나는지 체크
                if (nx < 0 || nx >= maze[0].length || ny < 0 || ny >= maze.length) {
                    continue;
                }
                // b. 벽인지, 방문했는지 체크
                if (maze[ny][nx] == 'X' || visited[ny][nx] == 1) {
                    continue;
                }

                if (maze[ny][nx] == 'O' || maze[ny][nx] == 'L' || maze[ny][nx] == 'E' || maze[ny][nx] == 'S') {
                    queue.add(new Coordiante(nx, ny, level + 1));
                    visited[ny][nx] = 1;
                }
            }
        }

        return -1;
    }

}

class Maze{
    private char[][] maze;

    public Maze(String[] maps){
        maze = new char[maps.length][maps[0].length()];
        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[i].length(); j++){
                maze[i][j] = maps[i].charAt(j);
            }
        }
    }

    public char[][] getMaze(){
        return maze;
    }

    public void printMaze(){
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[i].length; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}

class Coordiante {
    public int x;
    public int y;
    public int level;

    public Coordiante(int x, int y, int level) {
        this.x = x;
        this.y = y;
        this.level = level;
    }
}