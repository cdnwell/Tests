package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest01 {

	public interface JavaLambda {
		void coding();
	}
	
	private interface StringLambda {
		public void express(); 
	}
	
	private interface MaxLambda {
		public int calculator(int a, int b);
	}
	
	interface PrintLambda {
		void print(String name, int i);
	}
	
	interface SquareLambda {
		int calculrator(int x);
	}
	
	interface RandomLambda {
		int roll();
	}
	
	interface SumArrayLambda {
		int sumArr(int[] arr);
	}
	
	interface EmptyArrayLambda {
		int[] emptyArr();
	}
	
	public static void main(String[] args) {
		int result;
		
		JavaLambda lambda = () -> System.out.println("Hello World");
		lambda.coding();
		
		Iterable it;
		
		MaxLambda max = (a,b) -> a > b ? a : b;
		result = max.calculator(3, 4);
		
		System.out.println(result);
		
		PrintLambda print = (name, i) -> System.out.println(name + "=" + i); 

		print.print("age",30);
		
		SquareLambda square = (x) -> x*x;
		
		result = square.calculrator(5);
		System.out.println(result);
		
		RandomLambda random = () -> (int)(Math.random()*6);
		
		result = random.roll();
		
		System.out.println(result);
		
		int[] array = {1,2,3,4,5};
		
		SumArrayLambda sumArr = (ar) ->{
			int sum = 0;
			for(int i : ar)
				sum += i;
			return sum;
		};
		
		result = sumArr.sumArr(array);
		System.out.println(result);
		
		EmptyArrayLambda empty = () -> new int[] {10,20}; 
		
		int[] intArr = new int[] {1,2,3,4}; 
		
		System.out.println(Arrays.toString(intArr));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		System.out.println(list);
		
		System.out.println(Arrays.toString(empty.emptyArr()));
	}
	
	int[] emptyArr() {

		return new int[] {};

	}
	
	int sumArr(int[] arr) {

		int sum = 0;

		for(int i : arr) 

			sum += i;

		return sum;

	}
	
	int roll() {

		return (int)(Math.random() * 6);

	}
	
	int max(int a, int b) {

		return a > b ? a : b;

	}
	
	void printVar(String name, int i) {

		System.out.println(name+"="+i);

	}
	
	int square(int x) {

		return x*x;

	}

	
}
