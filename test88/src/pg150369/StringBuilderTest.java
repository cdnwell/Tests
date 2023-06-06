package pg150369;

public class StringBuilderTest {
    static public void main(String args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());

        // StringBuilder는 Thread Safe하지 않다.
        // StringBuffer는 Thread Safe하다.
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello");
        sb2.append(" ");
        sb2.append("World");
        System.out.println(sb2.toString());

    }
}
