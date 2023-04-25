package pg154538;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    public int solution(int x, int y, int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int size;
        int poll;

        queue.add(x);

        while(!queue.isEmpty()) {
            size = queue.size();
            for (int i = 0; i < size; i++) {
                if(queue.peek() == y) {
                    return count;
                }
                poll = queue.poll();
                if(poll + n <= y && !set.contains(poll+n)) {
                    set.add(poll+n);
                    queue.add(poll+n);
                }
                if(poll * 2 <= y && !set.contains(poll*2)) {
                    set.add(poll*2);
                    queue.add(poll*2);
                }
                if(poll * 3 <= y && !set.contains(poll*3)) {
                    set.add(poll*3);
                    queue.add(poll*3);
                }
            }
            count++;
        }

        return -1;

    }

}
