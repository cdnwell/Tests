package test;

public class DiamondStar {

	public static void main(String[] args) {
		
		for(int i =1 ;i<=7 ;i++) {
			for(int j=1;j<=Math.abs(4-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=7-Math.abs(4-i)*2;k++) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		
	}

}
