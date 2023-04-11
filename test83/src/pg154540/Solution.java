package pg154540;

import java.util.*;

public class Solution {
    public int[] solution(String[] maps) {
        int[] answer = {};

        Map map = new Map(maps);

        ArrayList<Integer> foodList = bfs(map.getMap(), map.getIsVisited());

        if (foodList.isEmpty()) return new int[]{-1};

        answer = new int[foodList.size()];

        int index = 0;
        for (int num : foodList) {
            answer[index++] = num;
        }

        Arrays.sort(answer);

        return answer;
    }

    public ArrayList<Integer> bfs(char[][] maps, boolean[][] isVisited) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<Coordinate> queue = new LinkedList<>();
        ArrayList<Integer> foodList = new ArrayList<>();

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (!isVisited[i][j] && maps[i][j] != 'X') {

                    queue.add(new Coordinate(j, i));

                    int foodResult = 0;

                    isVisited[i][j] = true;

                    while (!queue.isEmpty()) {
                        Coordinate coordinate = queue.poll();
                        int x = coordinate.getX();
                        int y = coordinate.getY();
                        foodResult += maps[y][x] - '0';

                        for (int k = 0; k < 4; k++) {
                            int nx = coordinate.getX();
                            int ny = coordinate.getY();

                            nx += dx[k];
                            ny += dy[k];

                            if (nx < 0 || ny < 0 || nx >= maps[0].length || ny >= maps.length) {
                                continue;
                            }

                            if (maps[ny][nx] == 'X' || isVisited[ny][nx]) {
                                continue;
                            }

                            if (maps[ny][nx] != 'X') {
                                isVisited[ny][nx] = true;
                                queue.add(new Coordinate(nx, ny));
                            }

                        }

                        if (queue.isEmpty()) {
                            foodList.add(foodResult);
                            foodResult = 0;
                        }
                    }

                }
            }
        }

        return foodList;

    }


    class Map {
        private char[][] map;
        private boolean[][] isVisited;

        public Map(String[] maps) {
            this.map = new char[maps.length][maps[0].length()];
            this.isVisited = new boolean[maps.length][maps[0].length()];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    this.map[i][j] = maps[i].charAt(j);
                    if (maps[i].charAt(j) == 'X') {
                        this.isVisited[i][j] = true;
                    }
                }
            }
        }

        public char[][] getMap() {
            return map;
        }

        public boolean[][] getIsVisited() {
            return isVisited;
        }

    }

    class Coordinate {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

}

