package bj1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turret {
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

            //1. 두 원의 위치관계는 6가지가 존재한다.
            //비교하기 전에 필요한 값인 d를 먼저 구해준다.
            int d = (int)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

            //1.1 두 점에서 만나는 경우 2
            boolean twoPointMeet1 = r2 - r1 < d;
            boolean twoPointMeet2 = d < r1 + r2;

            if(twoPointMeet1 && twoPointMeet2) answer = 2;

            //1.2 한 점에서 만나는 경우, 내접, 외접

            //1.2.1 외접하는 경우 1
            boolean onePointMeet1 = r1 + r2 == d;
            if(onePointMeet1) answer = 1;


            //1.2.2 내접하는 경우 1
            boolean onePointMeet2 = r2 - r1 == d;
            if(onePointMeet2) answer = 1;

            //1.3 만나지 않는 경우, 외부에 있을 때, 내부에 있을 때, 동심원

            //1.3.1 두 원이 완전히 떨어진 경우 0
            boolean notMeetFar = r1 + r2 < d;
            if(notMeetFar) answer = 0;

            //1.3.2 작은 원이 큰 원의 안에 있으면서 서로 만나지 않는 경우 0
            boolean notMeetInside = d < r2 - r1;
            if (notMeetInside) answer = 0;

            //1.3.1.1 두 원의 중심이 같고 반지름이 다른 경우 0
            boolean sameCenter = d == 0;
            boolean cmpRadius = r1 != r2;

            if(sameCenter && cmpRadius) answer = 0;

            //1.3.1.2 두 원의 중심이 같고 반지름이 같은 경우 -1
            boolean sameCenter2 = d == 0;
            boolean cmpRadius2 = r1 == r2;
            if(sameCenter2 && cmpRadius2) answer = -1;

            sb.append(answer+"\t");
        }

        String[] answerStr = sb.toString().split("\t");

        for (int i = 0; i < answerStr.length; i++) {
            System.out.println(answerStr[i]);
        }

    }
}
