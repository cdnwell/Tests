package pg150369;

public class ClassStudy {

    public static void main(String[] args) {
        System.out.println("Class 클래스 학습");

        // Class 클래스는 클래스의 정보를 담고 있는 클래스이다.
        // Class 클래스는 java.lang 패키지에 속해있으므로 import 없이 사용 가능하다.
        // Class 클래스는 모든 클래스의 조상이다.
        // Class 클래스는 클래스의 이름, 클래스의 생성자, 클래스의 필드, 클래스의 메소드 등을 알아낼 수 있다.
        // Class 클래스는 클래스의 정보를 담고 있으므로, 클래스의 정보를 알아내는 방법을 알아야 한다.
        // Class 클래스는 클래스의 정보를 알아내는 방법은 3가지가 있다.
        // 1. 클래스의 이름을 알고 있을 때
        // 2. 객체를 생성할 때
        // 3. 클래스의 정보를 알고 있을 때

        // 1. 클래스의 이름을 알고 있을 때
        // Class 클래스의 forName() 메소드를 사용하면 클래스의 이름을 알고 있을 때 클래스의 정보를 알아낼 수 있다.
        // forName() 메소드는 ClassNotFoundException을 발생시킬 수 있으므로 try-catch문으로 예외처리를 해야 한다.


        // 2. 객체를 생성할 때
        // 객체를 생성할 때는 getClass() 메소드를 사용하면 된다.
        // getClass() 메소드는 Object 클래스에 정의되어 있으므로 모든 클래스에서 사용 가능하다.
        // getClass() 메소드는 Class 클래스의 객체를 반환한다.
        // Class 클래스의 객체를 반환받으면 Class 클래스의 메소드를 사용할 수 있다.
        // Class 클래스의 메소드는 다음과 같다.
        // getName() : 클래스의 이름을 반환한다.
        // getSuperclass() : 클래스의 조상 클래스의 Class 객체를 반환한다.
        // getInterfaces() : 클래스가 구현한 인터페이스의 Class 객체를 반환한다.
        // getModifiers() : 클래스의 접근 제어자를 반환한다.
        // getFields() : 클래스의 필드의 Class 객체를 배열로 반환한다.
        // getConstructors() : 클래스의 생성자의 Class 객체를 배열로 반환한다.
        // getMethods() : 클래스의 메소드의 Class 객체를 배열로 반환한다.


        // 3. 클래스의 정보를 알고 있을 때
        // Class 클래스의 forName() 메소드와 getClass() 메소드는 클래스의 이름을 알고 있거나 객체를 생성할 때 사용할 수 있다.
        // 클래스의 정보를 알고 있을 때는 Class 클래스의 forName() 메소드와 getClass() 메소드를 사용할 필요가 없다.
        // Class 클래스의 forName() 메소드와 getClass() 메소드는 클래스의 정보를 알아내는 방법이지만, 클래스의 정보를 알고 있을 때는 사용할 필요가 없다.
        // 클래스의 정보를 알고 있을 때는 Class 클래스의 메소드를 사용하면 된다.
        // Class 클래스의 메소드는 다음과 같다.
        // getName() : 클래스의 이름을 반환한다.
        // getSuperclass() : 클래스의 조상 클래스의 Class 객체를 반환한다.
        // getInterfaces() : 클래스가 구현한 인터페이스의 Class 객체를 반환한다.
        // getModifiers() : 클래스의 접근 제어자를 반환한다.
        // getFields() : 클래스의 필드의 Class 객체를 배열로 반환한다.
        // getConstructors() : 클래스의 생성자의 Class 객체를 배열로 반환한다.
        // getMethods() : 클래스의 메소드의 Class 객체를 배열로 반환한다.
        
    }
}
