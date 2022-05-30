package programmers;

import java.util.Scanner;

public class NewIDRec_fin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String new_id = sc.nextLine();
		char [] str_arr = new char[1000];
		
		str_arr=new_id.toCharArray();
		int arrLen = str_arr.length;
		for(int i =0 ;i<arrLen;i++) {
			if(str_arr[i]>='A' && str_arr[i]<='Z') {
				str_arr[i] += 32;
			}
		}
		
		
		char[] str_arr_new = new char[1000];
		int count = 0;
		
		for(int i=0; i<arrLen;i++) {
			if(str_arr[i]>='a' && str_arr[i]<='z') {
				str_arr_new[count] = str_arr[i];
				count++;
			}else if(str_arr[i] =='-' || str_arr[i] == '_'
					|| str_arr[i] == '.') {
				str_arr_new[count] = str_arr[i];
				count++;
			}else if(str_arr[i] >= '0' && str_arr[i] <='9') {
				str_arr_new[count] = str_arr[i];
				count++;
			}
		} 
		count--;		  
		
		int dot_count = 0;
		int end_count = count;
		for(int i = 0 ; i <= count ; i++) {
			if(str_arr_new[i]=='.') {
				dot_count++;
			}
			if(str_arr_new[i]!='.') {
				dot_count=0;
			}
			if(dot_count == 2) {
				for(int j=count ; j>=0;j--) {
					if(str_arr_new[j]=='\u0000') {
						end_count =j-1;
						break;
					} 
				}
				for(int j=i ;j <end_count ;j++) {
					str_arr_new[j]=str_arr_new[j+1];
				}
				str_arr_new[end_count]='\u0000';	 
				dot_count = 0;	 
				i=-1;			 
				end_count--;	 
				count = end_count;	 
			}
		}
		
		if(end_count>=1) {
			if(str_arr_new[0]=='.') {
				for(int i = 0;i<end_count ;i++) {
					str_arr_new[i]=str_arr_new[i+1];
				}
				str_arr_new[end_count]='\u0000';
				end_count--;
			}
		}
		
		if(end_count>=1) {
			if(str_arr_new[end_count]=='.') {
				str_arr_new[end_count]='\u0000';
				end_count--;
			}
		}
		
		if(end_count==0) {
			if(str_arr_new[0]=='.') {
				str_arr_new[0]='a';
			}
		}
		
		if(str_arr_new[0]=='\u0000') {
			str_arr_new[0]='a';
		}
		
		if(str_arr_new.length>=16) {
			if(str_arr_new[15]!='\u0000') {
				for(int i=15;i<=end_count;i++) {
					str_arr_new[i]='\u0000';
				}
				end_count = 14;	
	 		}
		}
		
		if(end_count>=1) {
			if(str_arr_new[end_count]=='.') {
				str_arr_new[end_count]='\u0000';
				end_count--;
			}
		}
		
		if(str_arr_new[1]=='\u0000') {
			str_arr_new[1] = str_arr_new[0];
			str_arr_new[2] = str_arr_new[0];
			end_count +=2;
		}
		
		if(str_arr_new[2]=='\u0000') {
			str_arr_new[2] = str_arr_new[1];
			end_count++;
		}
		
		String answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
	}

}
