package test12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,x;
		String temp;
		
		temp=sc.nextLine();
		
		String []temp_split=temp.split("x");
		a=Double.parseDouble(temp_split[0]);
		b=Double.parseDouble(temp_split[1]);
		
		x = -b/a;
		
		x = (Math.round(x*100))/(double)100;
		
		DecimalFormat df=new DecimalFormat("0.00");
		String str = df.format(x);
		
		System.out.print(str);
		
	}

}
