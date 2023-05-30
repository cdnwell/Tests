package pg150369;

public class CloneTest {
    class ClonedClass implements Cloneable{
        private int i;
        private int j;
        public ClonedClass(int i, int j) {
            this.i = i;
            this.j = j;
        }
        @Override
        public ClonedClass clone() throws CloneNotSupportedException {
            return (ClonedClass) super.clone();
        }

        @Override
        public String toString() {
            return "i: " + i + ", j: " + j;
        }

    }
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct = new CloneTest();
        ClonedClass cc = ct.new ClonedClass(1, 2);
        ClonedClass cc2 = cc.clone();
        ClonedClass cc3 = ct.new ClonedClass(1, 2);
        System.out.println(cc == cc2);
        System.out.println(cc == cc3);
        System.out.println(cc.equals(cc2));
        System.out.println(cc.equals(cc3));
        System.out.println(cc.toString());
        System.out.println(cc2.toString());
        System.out.println(cc3.toString());
    }
}
