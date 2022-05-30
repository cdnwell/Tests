package programmers;

import java.util.Scanner;

public class NewIDRec {

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
		}//1단계 대문자 소문자로 치환
		
		String answer="";
		for(int i = 0 ; i<arrLen; i++) {
			answer += str_arr[i];
		}
		System.out.println(answer);
		
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
		}//2단계 다른 문자 제거
		count--;		//마지막으로 count 인덱스가 가리키고 있는 값이 전체 크기보다
						//1크다 그래서 1빼줌
		answer = "";
		for(int i = 0 ; i<=count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
		int dot_count = 0;
		int end_count = count;
		System.out.println("count : "+count);
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
					}//널값을 찾는다 없다면 end_count는 ocunt로 초기값을 사용한다.
				}
				for(int j=i ;j <end_count ;j++) {
					//1을 더한 값을 써서 end_count와 같거나 작다고 설정하지 않았다.
					str_arr_new[j]=str_arr_new[j+1];
				}
				str_arr_new[end_count]='\u0000';	//배열의 끝에 널값을 넣어준다.
				dot_count = 0;	//dot의 갯수를 세는 것을 초기화 한다.
				i=-1;			//다시 처음부터 검사한다.
				end_count--;	//end_count(배열의 마지막 인덱스)를 하나 감소시켜준다.
				count = end_count;	//count검사를 위해 end_count로 값을 지정
				System.out.println("end_count : " + end_count);
			}
		}//3단계 점(.) 치환
		System.out.println("end_count : " + end_count);
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
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
		
		//4단계 처음과 마지막 점(.) 제거
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
		if(str_arr_new[0]=='\u0000') {
			str_arr_new[0]='a';
		}//5단계 new_id가 빈 문자열이라면 a를 대입합니다.
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
		if(str_arr_new.length>=16) {
			if(str_arr_new[15]!='\u0000') {
				for(int i=15;i<=end_count;i++) {
					str_arr_new[i]='\u0000';
				}
				end_count = 14;	//배열의 값은 인덱스 0부터 시작해서 14까지 있으므로 
								//총 15글자임을 나타내기 위해 14를 대입해준다.
	 		}//6단계 길이가 16자 이상이면 첫 15글자를 제외하고 모두 지운다.
		}
		
		if(end_count>=1) {
			if(str_arr_new[end_count]=='.') {
				str_arr_new[end_count]='\u0000';
				end_count--;
			}
		}//15글자까지 표시 후 끝의 값 제거해주기
		
		System.out.println("----6단계 15글자 제외 모두 제거----");
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
		if(str_arr_new[1]=='\u0000') {
			str_arr_new[1] = str_arr_new[0];
			str_arr_new[2] = str_arr_new[0];
			end_count +=2;
		}//두번째 값이 널, 한글자인 배열
		
		if(str_arr_new[2]=='\u0000') {
			str_arr_new[2] = str_arr_new[1];
			end_count++;
		}//세번째 값이 널, 두글자인 배열, 두번째 글자를 붙여주기위해 대입하는 배열의 인덱스는 1
		//7단계 길이가 2자 이하라면 마지막 값 붙이기
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
	}

}
