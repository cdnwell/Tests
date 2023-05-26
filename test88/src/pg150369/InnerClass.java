package pg150369;

public class InnerClass {
    class Inner {
        private int a;
        public int s;
        public void print() {
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        InnerClass.Inner inner = ic.new Inner();
        inner.print();
        inner.a = 1;
        inner.s = 2;
        System.out.println(inner.a);
        System.out.println(inner.s);
    }

}
