package pg152996;

/**
 * 1.
 * String을 리터럴로 선언할 경우,
 * 내부적으로 intern() 메서드가 호출되게 되고,
 * intern() 메서드는 주어진 문자열이 string constant pool에 존재하는지 검색하고,
 * 있다면 그 주소값을 반환, 없다면 constant pool에 넣고 새로운 주소값을 반환한다.
 *
 * 2.
 * String 리터럴로 같은 문자를 선언하면
 * 주소값 비교(==)로도 문자 비교가 가능하다.
 */
public class StringConstantPool {
    public static void main(String[] args) {
        String tmp = "hello";
        String tmp2 = "hello";
        String tmp3 = new String("hello");
        String tmp4 = new String("hello");
        String tmp5 = new String("hello").intern();
        String tmp6 = "hello";

        System.out.println(tmp == tmp2);
        System.out.println(tmp == tmp3);
        System.out.println(tmp3 == tmp4);
        System.out.println(tmp == tmp5);
        System.out.println(tmp == tmp6);
    }
}
