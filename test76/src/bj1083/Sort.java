package bj1083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer>A = new ArrayList<>();
        int S = Integer.parseInt(br.readLine());

        int num = 0;

        // 1. 토큰에 저장된 값을 배열 A에 넣는다.
        while (st.hasMoreTokens()){
            A.add(Integer.parseInt(st.nextToken()));
        }

        // --- 1. 입력 완료 --- //

        // 2. 이동 가능한 거리에서 가장 높은 수를 맨 앞으로 가져와
        // 배열 A를 사전순으로 뒷서게 만든다.

        // 2.1 initIdx : (검색을 시작할 인덱스를 정의한다.)
        int initIdx = 0;    // 검색은 인덱스 0(처음) 부터 시작한다.
        int max = 0;        // 비교한 값중 더 큰 값을 담는 변수
        int maxIdx = -1;    // 더 큰 값의 idx를 담는 변수
        int moveIdx = 0;    // 이동 가능한 최대 크기를 담는 변수

        while(
                // initIdx가 맨 끝 인덱스 -1 을 넘어가면 (마지막 인덱스가 되면) while문을 종료한다.
                initIdx < N - 1
                // moveIdx가 S 이하 인경우 while문이 실행되도록 한다.
                && moveIdx <= S
        ) {
            // A 배열의 첫 번째 요소를 기준으로 소트하기 때문에 처음 요소의 값을 max에 담고 비교한다.
            max = A.get(initIdx);
            // maxIdx는 아무런 값이 담기지 않는 경우에 다른 계산이 필요하므로 -1을 대입하여 인덱스상 나올 수 없는 수를 대입한다.
            maxIdx = -1;

            // initIdx를 기준으로 비교할 cmpIdx를 정의한다. initIdx보다 1 큰 값 부터 시작한다.
            int cmpIdx = initIdx + 1;
            while (
                    // 비교할 인덱스가 끝을 넘어가면 while문을 종료한다.
                    cmpIdx < N
                    && moveIdx + cmpIdx - initIdx <= S
                    // 이동한 거리가 S보다 큰 경우 while문을 종료한다.
            ) {
                if(A.get(cmpIdx) > max){
                    // 배열의 요소 중 더 큰 값이 있으므로 max값을 갱신한다.
                    max = A.get(cmpIdx);
                    // 더 큰 값의 인덱스를 저장한다.
                    maxIdx = cmpIdx;
                    // 한 번 바꾼 것으로 생각 되므로 moveIdx에 1을 더해준다.
                }

                // while문을 다 마치고 cmpIdx를 하나 늘려준다.
                cmpIdx++;
            }

            // maxIdx가 -1값이 아닌 경우 값이 변경되었으므로 조건을 만들어준다.
            if(maxIdx != -1){
                // maxIdx(원래 큰 값이 있는 인덱스)의 요소를 삭제한다.
                A.remove(maxIdx);
                // 제일 처음 값은 정렬 되에 max값을 대입한다.
                A.add(initIdx,max);
                moveIdx = moveIdx + maxIdx - initIdx;
            }

            // 작업을 다 마친 후 검색의 기준이 되는 인덱스를 하나 늘려준다.
            initIdx++;
        }


        // --- [마지막] 출력 --- //
        for (int j = 0; j < A.size(); j++) {
            System.out.print(A.get(j) + " ");
        }

    }

}
