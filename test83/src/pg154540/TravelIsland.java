package pg154540;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TravelIsland {

    public static void main(String args[]) {
        String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};

        int[] answer = solution(maps);
    }

    public static int[] solution(String[] maps) {
        int[] answer;

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

    public static ArrayList<Integer> bfs (char[][] maps, boolean[][] isVisited) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<Coordinate> queue = new LinkedList<>();
        ArrayList<Integer> foodList = new ArrayList<>();

        // 전체 maps 배열을 돌면서 X가 아닌 곳을 찾는다.
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if(!isVisited[i][j] && maps[i][j] != 'X'){
                    // X가 아닌 곳을 찾으면 queue에 넣고 bfs를 시작한다.
                    // queue에는 좌표와 음식의 수를 넣는다.
                    // 해당 위치에서 4방향을 탐색한다.

                    queue.add(new Coordinate(j, i));

                    int foodResult = 0;

                    isVisited[i][j] = true;

                    while(!queue.isEmpty()){
                        Coordinate coordinate = queue.poll();
                        int x = coordinate.getX();
                        int y = coordinate.getY();
                        foodResult += maps[y][x] - '0';

                        for (int k = 0; k < 4; k++) {
                            int nx = coordinate.getX();
                            int ny = coordinate.getY();

                            nx += dx[k];
                            ny += dy[k];

                            if(nx < 0 || ny < 0 || nx >= maps[0].length || ny >= maps.length ){
                                continue;
                            }

                            if(maps[ny][nx] == 'X' || isVisited[ny][nx]) {
                                continue;
                            }

                            if(maps[ny][nx] != 'X') {
                                isVisited[ny][nx] = true;
                                queue.add(new Coordinate(nx, ny));
                            }

                        }

                        // queue가 비었을 때 foodList에 추가한다.
                        if (queue.isEmpty()) {
                            foodList.add(foodResult);
                            foodResult = 0;
                        }
                    }

                }
            }
        } // for문 i 끝 //

        return foodList;

    }

}

class Map {
    private char[][] map;
    private boolean[][] isVisited;

    public Map(String[] maps) {
        this.map = new char[maps.length][maps[0].length()];
        this.isVisited = new boolean[maps.length][maps[0].length()];
        for (int i=0;i<map.length;i++){
            for (int j = 0; j < map[i].length; j++) {
                this.map[i][j] = maps[i].charAt(j);
                if(maps[i].charAt(j) == 'X'){
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

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            System.out.println(map[i]);
        }
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