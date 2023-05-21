package pg152996;

/**
 * Char형 배열이 System.out.println의 매개변수로 쓰일 경우
 * Char형 배열의 주소값이 출력되는 것이 아니라, 배열의 요소가 합쳐진 String 형태로 출력된다.
 */
public class CharArrayStringTest {
    public static void main(String[] args) {
        char[] tmp = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(tmp);
    }
}
