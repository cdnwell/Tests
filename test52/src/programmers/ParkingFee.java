package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ParkingFee {

	public static void main(String[] args) {
		int[] fees = {120, 0, 60, 591};
		String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
		
		// 1. 차량 번호 별로 입차시간, 출차시간 Map으로 저장하기
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
		
		// 2. key == 차량 번호, value == 입차, 출차 시간
		//	  차량 번호 - 입차, 출차 시간 기록
		HashMap<Integer, String> car_fee = new HashMap<>();
		
		for(String s : list) {
			String[] tmp = s.split(" ");
			int car_num = Integer.parseInt(tmp[0]);
			String total = tmp[1];
				
			// 1. car_fee map이 비어있는 경우
			if(car_fee.get(car_num) == null) {
//				System.out.println("car num : "+car_num);
//				System.out.println("total : "+total);
				car_fee.put(car_num, total);		//1이 들어갔으면 In
			} else {
				// 2. car_fee map이 최초로 값이 들어간 것이 아니다.
				String total_hour = (String)car_fee.get(car_num);
//				System.out.println("car num[1] : "+car_num);
//				System.out.println("total hour : "+total_hour);
				total_hour = total_hour + " " + total;
				car_fee.put(car_num, total_hour);
			}
		}
		
//		System.out.println(car_fee);
		
		// 3. 차량 번호로 입차 출차 시간 꺼낸 다음 계산하기
		Set<Integer> car_num = car_fee.keySet();
		
		for(int i : car_num) {
			String tmp = car_fee.get(i);
			String[] arr = tmp.split(" ");
			
			int[] array = new int[arr.length];
			int k = 0;
			for(String s : arr) {
				array[k++] = Integer.parseInt(s);
			}
			
//			System.out.println(Arrays.toString(array));
			
			// 마지막 j 값이 홀수라면 out이 없는 경우 이므로 마지막에 계산 해줌
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
			
			// 마지막 j 값이 홀수라면 out이 없으므로 추가
			if(j % 2 == 1) {
				total_hour += 23*60+59;
			}
			
			car_fee.put(i, String.valueOf(total_hour));
		}
		
		System.out.println(car_fee);
		
		// ------------------------------------------ //
		// car_fee - map에 차량 번호 별 누적 주차 시간 저장 완료 //
		// ------------------------------------------ //
		
		// 4. 차량 번호로 누적 주차 시간 꺼낸 후 주차 요금 계산하기
		for(int i : car_num) {
			// 누적 시간 (차량 별)
			int hour = Integer.parseInt(car_fee.get(i));
			
			int fee = fees[1];
			int fee_plus = 0;
			if(hour > fees[0]) {
				fee_plus = (int)Math.ceil(((double)(hour - fees[0]) / fees[2])) * fees[3];
			}
			
			fee += fee_plus;
			car_fee.put(i, String.valueOf(fee));
		}
		
		System.out.println(car_fee);
		
		// 5. 차량 번호 순서대로 저장하기
		ArrayList<Integer> tmp_list = new ArrayList<>(car_num);
		Collections.sort(tmp_list);
		
		// Set은 자동으로 오름차순으로 정렬함
		
		int [] answer = new int[car_num.size()];
		
		int idx = 0;
		for(int i : tmp_list) {
			int fee = Integer.parseInt(car_fee.get(i));
			
			answer[idx++] = fee;
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
