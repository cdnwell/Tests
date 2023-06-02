package pg150369;

public class DeepCopy {

    public class Inner {
        private int a;
        public int s;
        public void print() {
            System.out.println("Inner Class");
        }
    }
    public static void main(String[] args) {
        System.out.println("깊은 복사 예시");
    }
}
