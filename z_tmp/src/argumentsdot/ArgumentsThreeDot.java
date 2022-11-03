package argumentsdot;

public class ArgumentsThreeDot {
    public static void main (String [] args){
        test(1,2,3);
        test(4,5);
        test02("hello"," String","Vararg","Parameters!");
        test03('A','B','C','D');
    }
    public static void test (int... numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(i+"번째 : "+numbers[i]+" ");
        }
        System.out.println();
    }
    //Vararg parameter -> int... , String...
    static void test02 (String str, String... strArr){
        System.out.print(str);
        for (int i=0;i< strArr.length;i++)
            System.out.print(strArr[i] + " ");
        System.out.println();
    }

    static void test03 (char... chars){
        System.out.println("chars length : "+chars.length);
    }

}
