package stringjoin;

public class StringJoin {

	public static void main(String[] args) {
		String[] animal = { "Bear", "Cat", "Dog", "Rabbit", "Dolphin" };

		String resultStr = "";

		resultStr += String.join(", ", animal);

		System.out.println(resultStr);

	}

}
