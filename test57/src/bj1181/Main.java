package bj1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] arr = new String[number];

        for(int i=0;i<number;i++){
            arr[i] = br.readLine();
        }

        bubbleSort(arr);

        for(int i=0;i<arr.length;i++){
            //if(arr[i].equals("0")) continue;
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
                        int arrJ = arr[j].charAt(k) - 'a';
                        int arrJ1 = arr[j+1].charAt(k) - 'a';
                        if(arrJ > arrJ1){
                            System.out.println("k : "+k);
                            System.out.println("arrJ : "+arrJ);
                            System.out.println("arrJ1 : "+arrJ1);
                            System.out.println("before - arr[j] : "+arr[j] +" - arr[j+1] : "+arr[j+1]);
                            System.out.println("before - arr[j].charAt[k] "+arr[j].charAt(k));
                            System.out.println("before - arr[j+1].charAt[k] "+arr[j+1].charAt(k));
                            String temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                            System.out.println("after - arr[j] : "+arr[j] +" - arr[j+1] : "+arr[j+1]);
                            System.out.println("after - arr[j].charAt[k] "+arr[j].charAt(k));
                            System.out.println("after - arr[j+1].charAt[k] "+arr[j+1].charAt(k));
                            break;
                        }
                    }
                }
            }
        }
    }
}
