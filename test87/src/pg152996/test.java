package pg152996;

public class test {
    /**
     * Wrapper class Integer의 산술연산 테스트
     * 원래는 산술연산이 되지 않지만, 자바에서 Auto unBoxing을 하여 산술연산이 가능하다.
     */
    public static void main(String[] args) {
        Integer tmp4 = 1;
        Integer tmp6 = 4;
        Integer tmp7 = tmp4 + tmp6;

        System.out.println(tmp7);
    }
}
