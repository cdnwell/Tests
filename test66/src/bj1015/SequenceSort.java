package bj1015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/**
 * 백준 전체 1015 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/06/22/a1015">1015 풀이</a>
 * @since 2021.06.22 Tue 01:23:31
 */
public class SequenceSort
{
    /**
     * 메인 함수
     *
     * @param args: [String[]] 매개변수
     *
     * @throws IOException 데이터 입출력 예외
     */
    public static void main(String[] args) throws IOException
    {
        int [][] int_arr = { {1,3}, {2,4}, {5,6} };
        int [] int_one_arr = int_arr[0];
        System.out.println(int_one_arr[0]);
    }

    /**
     * 정렬 함수
     *
     * @param A: [int[][]] 대상 배열
     */
    private static void sort(int[][][] A)
    {
        //Arrays.sort();
        Arrays.sort(A, (next, current) ->
        {
            // 현재값이 더 클 경우
            if (next[0][0] < current[0][0])
            {
                return -1;
            }

            // 다음값이 더 클 경우
            else if (next[0][0] > current[0][0])
            {
                return 1;
            }

            // 현재값과 다음값이 같을 경우, 사전순 정렬
            else
            {
                return Integer.compare(next[1][0], current[1][0]);
            }
        });
    }
}
