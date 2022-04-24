package w_tmp;

import java.util.Arrays;
import java.util.Scanner;

public class Tmp {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] aparts = new int[25*25];
    private static int n;
    private static int apartNum = 0; //����Ʈ ���� ��ȣ�� ��
    private static boolean[][] visited = new boolean[25][25]; //�湮����
    private static int[][] map = new int[25][25]; //����

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        //��ü �簢�� �Է� �ޱ�
        for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apartNum++;

                    System.out.println("i:"+i);
                    System.out.println("j:"+j);
                    System.out.println("-----");
                    dfs(i,j);
//                    System.out.println("apartNum:"+apartNum);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }else{               
            	System.out.println("aparts["+i+"]:"+aparts[i]);
                System.out.println(aparts[i]);
            }
        }
    }

    private static void dfs(int x, int y) {
    	System.out.println("num["+x+"]["+y+"]:"+"true");
        visited[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            System.out.println("_i:"+i);
            System.out.println(x+"+"+dx[i]+":"+nx);
            System.out.println(y+"+"+dy[i]+":"+ny);
            
            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                	System.out.println("nx:"+nx);
                    System.out.println("ny:"+ny);
                    dfs(nx,ny);
                    
                }
            }
        }
        //dx[] = {0,0,1,-1}
        //dy[] = {1,-1,0,0}
    }
}