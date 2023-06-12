package pg150369;

import java.util.Arrays;

public class UnionFind {

    public static int[] root = { 2,2,3,4,5,5,4,4 };

    public static void makeSet() {
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
    }

    public static int find(int x) {
        if (root[x] == x) {
            return x;
        } else {
            return find(root[x]);
        }
    }

    public static void union(int x, int y) {
        int tmpX = find(x);
        int tmpY = find(y);

        root[tmpY] = tmpX;
    }

    public static int compression(int x) {
        if (root[x] == x) {
            return x;
        } else {
            return root[x] = compression(root[x]);
        }
    }

    public static void main(String args[]) {
        compression(0);
        System.out.println(Arrays.toString(root));
    }

}
