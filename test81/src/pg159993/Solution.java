package pg159993;

import java.util.LinkedList;

public class Solution {

    public int solution(String[] maps) {
        int answer = 0;

        Maze maze = new Maze(maps);

        char[][] mazeArr = maze.getMaze();

        Coordiante start = findPurposeCoordinate(mazeArr, 'S');
        Coordiante lever = findPurposeCoordinate(mazeArr, 'L');

        int toLever = bfs(mazeArr, start, 'L');
        if(toLever == -1) return -1;

        int toEnd = bfs(mazeArr, lever, 'E');
        if(toEnd == -1) return -1;

        answer = toLever + toEnd;

        return answer;
    }

    public Coordiante findPurposeCoordinate(char[][] maze, char purpose) {
        Coordiante start = null;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == purpose) {
                    start = new Coordiante(j, i, 0);
                }
            }
        }

        return start;
    }

    public int bfs(char[][] maze, Coordiante start, char end) {
        LinkedList<Coordiante> queue = new LinkedList<>();

        queue.add(start);

        int[][] visited = new int[maze.length][maze[0].length];

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

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
                if (nx < 0 || nx >= maze[0].length || ny < 0 || ny >= maze.length) {
                    continue;
                }
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

}
