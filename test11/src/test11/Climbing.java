package test11;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class Climbing {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int a, b, c;
		int i;
		boolean flag = true;
		
		
		str=sc.nextLine();
		String[] str_tmp=str.split("\\s");
 		a=Integer.parseInt(str_tmp[0]);
 		b=Integer.parseInt(str_tmp[1]);
 		c=Integer.parseInt(str_tmp[2]);
// 		System.out.println("a:"+a+" b:"+b+" c:"+c);
 		
 		for(i=1;flag;i++) {
 			if(i%a ==0 && i%b ==0 && i%c == 0) {
 				flag = false;
 			}
 		}
 		i--;		//조건식 이전에 1이 증가 되므로, 정확한 값을 구하기위해 1을 뺴준다.
 		
 		SimpleDateFormat sdf=new SimpleDateFormat();
 		sdf.applyPattern("yyyy-MM-dd");
 		Calendar cal = Calendar.getInstance();
 		cal.set(Calendar.YEAR, 2100);
 		cal.set(Calendar.MONTH, 0);
 		cal.set(Calendar.DATE, 1);
 	
 		cal.add(Calendar.DATE, i);
 		
 		if(cal.get(Calendar.MONTH) == 11) {
 			cal.add(Calendar.DATE, 31);
 		}
 		
 		System.out.print(sdf.format(cal.getTime()));
 		
 		String day = engDay(cal.get(Calendar.DAY_OF_WEEK));
 		System.out.println(" "+day);
 		
	}
	
	public static String engDay(int num) {
		switch(num) {
 		case 1:
 			return "SUN";
 		case 2:
 			return "MON";
 		case 3:
 			return "TUE";
 		case 4:
 			return "WED";
 		case 5:
 			return "THU";
 		case 6:
 			return "FRI";
 		case 7:
 			return "SAT";
 		}
		return null;
	}

}
