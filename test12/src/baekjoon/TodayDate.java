package baekjoon;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TodayDate {
	/*
	 * baekjoon - 10699¹ø ¹®Á¦
	 * 
	 */
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		
		System.out.println(sdf.format(calendar.getTime()));
		
		
	}

}
