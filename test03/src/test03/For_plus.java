package test03;

import java.util.Scanner;

public class For_plus {

	public static void main(String[] args) {

		String str1;

		Scanner sc=new Scanner(System.in);
		
		str1=sc.nextLine();
		
		String[] words= str1.split("\\s");
		for(String wo : words ) {
			System.out.println(wo);
		}
		
		//Ȯ�� for �� ���� 1
		//for (TYPE ������ : �迭)
		//{ System.out.println(������) }
		//�迭���� �����͸� ������ Ÿ������ ó�� ���� �迭�� ������ �о� ����. 
		//String, int �� ������ Ÿ���� �� �ȴ�.
		
		//Ȯ�� for�� ���� 2
		//for(int a : arr)
		//{ sum+=a; }
		//arr�迭�� �� �ε����� ��� int�� ��Ҹ� sum�� ���Ѵ�.
		
	}

}
