package bj1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int answer = 0;

        for(int i=0;i<T;i++){
            String[] strTmp = br.readLine().split(" ");

            int x1 = Integer.parseInt(strTmp[0]);
            int y1 = Integer.parseInt(strTmp[1]);
            int r1 = Integer.parseInt(strTmp[2]);
            int x2 = Integer.parseInt(strTmp[3]);
            int y2 = Integer.parseInt(strTmp[4]);
            int r2 = Integer.parseInt(strTmp[5]);

            int d = (int)(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

            boolean twoPointMeet1 = (int)Math.pow(r2 - r1,2) < d;
            boolean twoPointMeet2 = d < (int)Math.pow(r1 + r2, 2);

            if(twoPointMeet1 && twoPointMeet2) answer = 2;

            boolean onePointMeet1 = (int)Math.pow(r1 + r2,2) == d;
            if(onePointMeet1) answer = 1;

            boolean onePointMeet2 = (int)Math.pow(r2 - r1,2) == d;
            if(onePointMeet2) answer = 1;

            boolean notMeetFar = (int)Math.pow(r1 + r2,2) < d;
            if(notMeetFar) answer = 0;

            boolean notMeetInside = d < (int)Math.pow(r2 - r1,2);
            if (notMeetInside) answer = 0;

            boolean sameCenter = d == 0;
            boolean cmpRadius = r1 != r2;
            if(sameCenter && cmpRadius) answer = 0;

            boolean cmpR = r1 == r2;
            boolean cmpX = x1 == x2;
            boolean cmpY = y1 == y2;
            if(cmpR && cmpX && cmpY) answer = -1;

            sb.append(answer+"\t");
        }

        String[] answerStr = sb.toString().split("\t");

        for (int i = 0; i < answerStr.length; i++) {
            System.out.println(answerStr[i]);
        }

    }
}
