package pg150369;

public class StreamClass {
    public static void main(String[] args) {
        // Stream 클래스
        // Stream 클래스는 바이트 단위로 데이터를 읽고 쓰는 클래스이다.
        // Stream 클래스는 java.io 패키지에 속해있으므로 import 해야 한다.
        // Stream 클래스는 추상 클래스이므로 객체를 생성할 수 없다.
        // Stream 클래스는 InputStream 클래스와 OutputStream 클래스의 조상 클래스이다.
        // Stream 클래스는 InputStream 클래스와 OutputStream 클래스의 조상 클래스이므로
        // InputStream 클래스와 OutputStream 클래스의 메소드를 사용할 수 있다.

        // Stream 클래스는 for 문 보다 더 빠르다
        // 그 이유는
        // 1. for 문은 반복문이므로 반복문을 실행할 때마다 조건식을 검사해야 한다.
        // 2. for 문은 반복문이므로 반복문을 실행할 때마다 변수를 증가시켜야 한다.
        // 3. Stream 클래스는 바이트 단위로 데이터를 읽고 쓰는 클래스이므로 바이트 단위로 데이터를 읽고 쓴다.
        // 4. Stream 클래스는 바이트 단위로 데이터를 읽고 쓰는 클래스이므로 바이트 단위로 데이터를 읽고 쓸 때마다 조건식을 검사하고 변수를 증가시킬 필요가 없다.

    }
}
