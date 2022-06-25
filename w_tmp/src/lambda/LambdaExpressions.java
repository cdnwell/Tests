package lambda;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		LambdaP sum = (a,b)-> a+b;
		
		System.out.println(sum.sum(1,2));
		
	}

}
