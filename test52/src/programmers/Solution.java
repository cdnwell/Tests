package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
 		ArrayList<String> list = new ArrayList<>();
 		
 		for(String s : records) {
 			String [] tmp = s.split(" ");
 			
 			int car_num = Integer.parseInt(tmp[1]);
 			String [] hour_str = tmp[0].split(":");
 			int hour = Integer.parseInt(hour_str[0]);
 			int minute = Integer.parseInt(hour_str[1]);
 			
 			int total = hour * 60 + minute;
 			
 			list.add(car_num + " " + total);
 		}
 		
 		HashMap<Integer, String> car_fee = new HashMap<>();
 		
 		for(String s : list) {
 			String[] tmp = s.split(" ");
 			int car_num = Integer.parseInt(tmp[0]);
 			String total = tmp[1];
 				
 			if(car_fee.get(car_num) == null) {
 				car_fee.put(car_num, total);
 			} else {
 				String total_hour = (String)car_fee.get(car_num);
 				total_hour = total_hour + " " + total;
 				car_fee.put(car_num, total_hour);
 			}
 		}
 		
 		Set<Integer> car_num = car_fee.keySet();
 		
 		for(int i : car_num) {
 			String tmp = car_fee.get(i);
 			String[] arr = tmp.split(" ");
 			
 			int[] array = new int[arr.length];
 			int k = 0;
 			for(String s : arr) {
 				array[k++] = Integer.parseInt(s);
 			}
 			
 			int j;
 			int total_hour = 0;
 			for( j = 0 ; j < arr.length ; j++) {
 				if(j % 2 == 0) {
 					//IN 값
 					total_hour -= array[j];
 				} else {
 					total_hour += array[j];
 				}
 			}
 			
 			if(j % 2 == 1) {
 				total_hour += 23*60+59;
 			}
 			
 			car_fee.put(i, String.valueOf(total_hour));
 		}
 		
 		for(int i : car_num) {
 			int hour = Integer.parseInt(car_fee.get(i));
 			
 			int fee = fees[1];
 			int fee_plus = 0;
 			if(hour > fees[0]) {
 				fee_plus = (int)Math.ceil(((double)(hour - fees[0]) / fees[2])) * fees[3];
 			}
 			
 			fee += fee_plus;
 			car_fee.put(i, String.valueOf(fee));
 		}
 		
 		ArrayList<Integer> tmp_list = new ArrayList<>(car_num);
		Collections.sort(tmp_list);
 		
 		int [] answer = new int[car_num.size()];
 		
 		int idx = 0;
 		for(int i : tmp_list) {
 			int fee = Integer.parseInt(car_fee.get(i));
 			
 			answer[idx++] = fee;
 		}
        
        return answer;
    }
}