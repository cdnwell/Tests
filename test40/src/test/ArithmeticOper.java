package test;

public class ArithmeticOper {

	public static void main(String[] args) {
		float fnum1 = 0.0f;		// 0.0 대입하면 에러발생
		float fnum2 = 1.0f;
		double dnum1 = 0.0;
		double dnum2 = 3.2;
		int num1 = 3;
		int num2 = 4;
		int num3 = 0;
		
		System.out.println(fnum2/fnum1);
		System.out.println(dnum2/fnum1);
		System.out.println(fnum2/dnum1);
		System.out.println(dnum2/dnum1);
		System.out.println(num1/fnum1);
		System.out.println(num1/dnum1);
		//이상 모두 Infinity
		
		//System.out.println(num1/num3);
		//에러 발생
		
		System.out.println(dnum2/num3);		// Infinity = 3.2 / 0
		System.out.println(dnum1/num3);		// NaN = 0.0 / 0
		System.out.println(fnum2/num3);		// Infinity = 1.0f
		System.out.println(fnum1/num3);		// Nan = 0.0 / 0
	}	

}
