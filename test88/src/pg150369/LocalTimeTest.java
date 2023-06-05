package pg150369;

import java.time.LocalDateTime;

public class LocalTimeTest {

    public static void main(String[] args) {
        System.out.println("LocalTime 예시");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 기존 Date 클래스가 deprecated 되고, LocalDateTime 클래스가 나온 이유
        // 1. Date 클래스는 mutable 하다. 즉, 값을 변경할 수 있다.
        // 2. Date 클래스는 thread-safe 하지 않다. 즉, 멀티스레드 환경에서 안전하지 않다.
        // 3. Date 클래스는 날짜와 시간을 구분하지 않는다.
        // 4. Date 클래스는 월을 나타낼 때 0부터 시작한다.
        // 5. Date 클래스는 시간대를 설정할 수 없다.
        // 6. Date 클래스는 날짜와 시간을 계산하기가 어렵다.
        // 7. Date 클래스는 날짜와 시간을 비교하기가 어렵다.
        // 8. Date 클래스는 날짜와 시간을 출력하기가 어렵다.
        // 9. Date 클래스는 날짜와 시간을 파싱하기가 어렵다.
        // 10. Date 클래스는 날짜와 시간을 변경하기가 어렵다.
        // 11. Date 클래스는 날짜와 시간을 포맷하기가 어렵다.
        // 12. Date 클래스는 날짜와 시간을 더하거나 빼기가 어렵다.
        // 13. Date 클래스는 날짜와 시간을 비교하기가 어렵다.
        // 14. Date 클래스는 날짜와 시간을 출력하기가 어렵다.

    }
}
