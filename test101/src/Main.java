import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * bj.1022
 * 소용돌이 예쁘게 출력하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        int arrRow = r2 - r1 + 1;
        int arrCol = c2 - c1 + 1;

        int[][] eddyArr = new int[arrRow][arrCol];

        // digit = 숫자 자리수
        int x, y, digit;

        for (int i = 0, ii = eddyArr.length; i < ii; i++) {
            for (int j = 0, jj = eddyArr[i].length; j < jj; j++) {
                x = i + r1;
                y = j + c1;
                eddyArr[i][j] = calCoordinates(x, y);
            }
        }

        digit = calDigit(eddyArr);

        String[][] ret = padArr(eddyArr, digit);

        for (int i = 0, ii = ret.length; i < ii; i++) {
            for (int j = 0, jj = ret[i].length; j < jj; j++) {
                System.out.print(ret[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static String[][] padArr(int[][] calArr, int digit) {
        String[][] ret = new String[calArr.length][calArr[0].length];

        for (int i = 0; i < calArr.length; i++) {
            for (int j = 0; j < calArr[i].length; j++) {
                int num = calArr[i][j];
                String str = String.valueOf(num);
                int strDigit = str.toCharArray().length;
                // 패딩해야하는 숫자의 수
                int padNum = digit - strDigit;

                // 자리수와 게산하려는 숫자의 자리수가 같은 경우 통과
                if (padNum == 0) {
                    ret[i][j] = str;
                    continue;
                }

                String padStr = "";

                while(padNum-- != 0) {
                    padStr += " ";
                }

                ret[i][j] = padStr + str;
            }
        }

        return ret;
    }

    private static int calDigit(int[][] calArr) {
        int digit = 0;
        for (int i = 0; i < calArr.length; i++) {
            for (int j = 0; j < calArr[i].length; j++) {
                String num = String.valueOf(calArr[i][j]);
                char[] arr = num.toCharArray();
                digit = Math.max(arr.length, digit);
            }
        }
        return digit;
    }

    private static int calCoordinates(int x, int y) {
        int sqrPlusX = (2 * x + 1) * (2 * x + 1);
        int sqrMinusX = (-(2 * x) + 1) * (-(2 * x) + 1);
        if(x == 0 && y == 0) {
            return 1;
        }
        if (x > 0 && x == y) {
            return sqrPlusX;
        }
        if (x > 0 && x == -y) {
            return sqrPlusX - (2 * x);
        }
        if (x < 0 && x == y) {
            return sqrMinusX + (4 * x);
        }
        if (x < 0 && x == -y) {
            return sqrMinusX + (6 * x);
        }
        // 우측 식
        if (y > 0 && -y < x && x < y) {
            return 4 * y * y - 3 * y + 1 - x;
        }
        // 위쪽 식
        if (x < 0 && x < y && y < -x) {
            return 4 * x * x + x + 1 - y;
        }
        // 왼쪽 식
        if (y < 0 && y < x && x < -y) {
            return 4 * y * y - y + 1 + x;
        }
        // 아래 식
        if (x > 0 && -x < y && y < x) {
            return 4 * x * x + 3 * x + 1 + y;
        }

        return -1;
    }

}
