package bj1181;

import java.util.Scanner;

public class WordSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String[] arr = new String[number];

        for(int i=0;i<number;i++){
            arr[i] = sc.nextLine();
        }

        // 1. 글자 수에 따라 정렬
        // 2. 알파벳 순서에 따라 정렬
        // 3. 같은 단어 없애기
        // 4. 줄바꿔서 출력

        bubbleSort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("0")) continue;
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(String[] arr){
        int length = arr.length;

        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(arr[j].equals(arr[j+1])){
                    arr[j] = "0";
                } else if(arr[j].length() > arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else if(arr[j].length() == arr[j+1].length()) {
                    for(int k=0;k<arr[j].length();k++){
                        if(arr[j].charAt(k) > arr[j+1].charAt(k)){
                            String temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
        }
    }

}
