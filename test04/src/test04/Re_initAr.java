package test04;

public class Re_initAr {

	public static void main(String[] args) {
		int [] n=new int[3];
		float [] f=new float[3];
		double [] d=new double[3];
		char [] c=new char[3];
		String[] s=new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.println(n[i]);
		}
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(f[i]);
		}
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(d[i]);
		}
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(c[i]);
		}
		//char 배열 초기화
		//""값으로 초기화 되는 것 같다. 공백이 출력된다.
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(s[i]);
		}
		System.out.println();
		System.out.println("-----");
		//String 배열 초기화
		//null값으로 초기화 된다.
		
		
		//char 값에 "" 값 확인
		
		
		//char chr=""; (x)
		//""는 String 값을 넣을 때 상ㅇ 한다는 에러가 나온다.
		
		//char chr=''; (x)
		//''값에 아무것도 없다는 오류 ㅍ시가 나온다.
		
		char chr=' ';
		
		System.out.println(chr==c[0]);
		//배열 c값에 어떤 값이 초기화 값으로 들어갔는지 파악한다.
		//초기화 값으로 white space가 들어가진 않았다.
		//false 리턴
		System.out.println("-----");
		
		chr='0';
		System.out.println(chr);
		System.out.println(chr==c[0]);
		//구글에서 찾은 초기값과 비교해 보았다.
		//false값을 반환한다.
		System.out.println("-----");
		
		//chr의 초기값 '\u0000'
		
		chr='\u0000';
		System.out.println(chr);
		System.out.println(chr==c[0]);
		//char 배열의 초기값은 \u0000 이다.
		//이 값이 null과 같은지 비교해보겠다.
		
		//char 변수에는 null값이 들어가지 않는다.
		//오류를 발생시킨다.
		//chr=null; (x)
		
		//chr의 초기값 '\0'
		//'\0'은 '\u0000'과 같다.
		
		chr='\0';
		System.out.println(chr);
		System.out.println(chr==c[0]);
		
		//정리하자면 chr배열의 초기값은 '\0'이 들어간다는 것을 알 수 있고
		//이 값은 '\u0000'과 같았다.
	}

}
