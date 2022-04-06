package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.println(name+"님의 나이는 "+age+"살 입니다.");
	}

}
