package bj1431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] arr = new String[number];

        for(int i=0;i<number;i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                } else {
                    int length = o1.length();
                    char [] ch1 = o1.toCharArray();
                    char [] ch2 = o2.toCharArray();

                    int sum1 = 0;
                    int sum2 = 0;

                    for(int i=0;i<length;i++){
                        if((ch1[i] - '0') >= 0 && (ch1[i] - '0') <= 9 ) sum1 += ch1[i] - '0';
                        if((ch2[i] - '0') >= 0 && (ch2[i] - '0') <= 9 ) sum2 += ch2[i] - '0';
                    }

                    if(sum1 == sum2){
                        return o1.compareTo(o2);
                    }

                    int result = sum1 - sum2;

                    return result;
                }
            }
        });

        for(int i=0;i<number;i++){
            System.out.println(arr[i]);
        }

    }
}
