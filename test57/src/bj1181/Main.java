package bj1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static String[] sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] arr = new String[number];
        sorted = new String[number];

        for(int i=0;i<number;i++){
            arr[i] = br.readLine();
        }

        //bubbleSort(arr);
        // 정렬하기
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1 && arr[i].equals(arr[i+1])) continue;
            System.out.println(arr[i]);
        }

    }

}
