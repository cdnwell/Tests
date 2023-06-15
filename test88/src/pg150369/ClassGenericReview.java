package pg150369;

public class ClassGenericReview {

    public static void main(String[] args) {
        // Generic Class와 Class의 차이점
        // Generic Class는 제네릭 클래스이다.
        // Generic Class는 Class의 자식 클래스이다.
        // Generic Class는 Class의 메소드를 사용할 수 있다.
        // Generic Class는 Class의 메소드를 사용할 수 있으므로 Generic Class를 사용하는 것이 좋다.
        Class<String> stringClass = String.class;
        Class stringClass2 = String.class;
        System.out.println(stringClass);
        System.out.println(stringClass2);

        // Generic Class는 제네릭 클래스이므로 타입 파라미터를 지정해야 한다.
        // 타입 파라미터는 클래스의 이름 뒤에 <T>를 붙여서 지정한다.
        // 타입 파라미터는 클래스의 이름 뒤에 <T>를 붙여서 지정하므로 타입 파라미터를 지정하지 않으면 컴파일 오류가 발생한다.
    }

    public static <T> T GenericClassReview(Class<T> clazz) {
        // null 값이 아닌 clazz 에 올 수 있는 값으로 반환값을 만들어 줘
        return null;
    }

}
