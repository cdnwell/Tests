package bj1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SortSequence {
    /**
     * 수열 정렬
     * 배열 A가 주어졌을 때, 수열 P를 적용한 결과가 비내림차순이 되는 수열을 찾는 프로그램을 작성하시오.
     * 비내림차순이란, 각각의 원소가 바로 앞에 있는 원소보다 크거나 같을 경우를 말한다.
     * 만약 그러한 수열이 여러개라면 사전순으로 앞서는 것을 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][3];

        String[] strArr = new String[N];
        strArr = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(strArr[i]);
            arr[i][1] = 0;  // 순서를 담을 배열 [i][1]
            arr[i][2] = i;  // 기존의 순서를 나타낼 [i][2]
        }

//        for (int i = 0; i < N; i++) {
//            System.out.printf("%d ",arr[i][0]);
//        }

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i][1]);
        }

    }

    public static void bubbleSort(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j][0] > arr[j+1][0]){
                    // 1.1. 0번째 배열 스왑
                    swap(arr,j,0);
                    // 1.2. 2번째 배열 스왑 : 기존의 순서를 나타낼 배열
                    swap(arr,j,2);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i][2]][1] = i;
        }
    }

    public static void swap(int[][] num, int index, int cnt){
        int temp = num[index][cnt];
        num[index][cnt] = num[index+1][cnt];
        num[index+1][cnt] = temp;
    }

}
