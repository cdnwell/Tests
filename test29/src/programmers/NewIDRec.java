package programmers;

import java.util.Scanner;

public class NewIDRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String new_id = sc.nextLine();
		char [] str_arr = new char[1000];
		
		str_arr=new_id.toCharArray();
		int arrLen = str_arr.length;
		for(int i =0 ;i<arrLen;i++) {
			if(str_arr[i]>='A' && str_arr[i]<='Z') {
				str_arr[i] += 32;
			}
		}//1�ܰ� �빮�� �ҹ��ڷ� ġȯ
		
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
		}//2�ܰ� �ٸ� ���� ����
		count--;		//���������� count �ε����� ����Ű�� �ִ� ���� ��ü ũ�⺸��
						//1ũ�� �׷��� 1����
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
					}//�ΰ��� ã�´� ���ٸ� end_count�� ocunt�� �ʱⰪ�� ����Ѵ�.
				}
				for(int j=i ;j <end_count ;j++) {
					//1�� ���� ���� �Ἥ end_count�� ���ų� �۴ٰ� �������� �ʾҴ�.
					str_arr_new[j]=str_arr_new[j+1];
				}
				str_arr_new[end_count]='\u0000';	//�迭�� ���� �ΰ��� �־��ش�.
				dot_count = 0;	//dot�� ������ ���� ���� �ʱ�ȭ �Ѵ�.
				i=-1;			//�ٽ� ó������ �˻��Ѵ�.
				end_count--;	//end_count(�迭�� ������ �ε���)�� �ϳ� ���ҽ����ش�.
				count = end_count;	//count�˻縦 ���� end_count�� ���� ����
				System.out.println("end_count : " + end_count);
			}
		}//3�ܰ� ��(.) ġȯ
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
		
		//4�ܰ� ó���� ������ ��(.) ����
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
		if(str_arr_new[0]=='\u0000') {
			str_arr_new[0]='a';
		}//5�ܰ� new_id�� �� ���ڿ��̶�� a�� �����մϴ�.
		
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
				end_count = 14;	//�迭�� ���� �ε��� 0���� �����ؼ� 14���� �����Ƿ� 
								//�� 15�������� ��Ÿ���� ���� 14�� �������ش�.
	 		}//6�ܰ� ���̰� 16�� �̻��̸� ù 15���ڸ� �����ϰ� ��� �����.
		}
		
		if(end_count>=1) {
			if(str_arr_new[end_count]=='.') {
				str_arr_new[end_count]='\u0000';
				end_count--;
			}
		}//15���ڱ��� ǥ�� �� ���� �� �������ֱ�
		
		System.out.println("----6�ܰ� 15���� ���� ��� ����----");
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
		if(str_arr_new[1]=='\u0000') {
			str_arr_new[1] = str_arr_new[0];
			str_arr_new[2] = str_arr_new[0];
			end_count +=2;
		}//�ι�° ���� ��, �ѱ����� �迭
		
		if(str_arr_new[2]=='\u0000') {
			str_arr_new[2] = str_arr_new[1];
			end_count++;
		}//����° ���� ��, �α����� �迭, �ι�° ���ڸ� �ٿ��ֱ����� �����ϴ� �迭�� �ε����� 1
		//7�ܰ� ���̰� 2�� ���϶�� ������ �� ���̱�
		
		answer = "";
		for(int i = 0 ; i<=end_count; i++) {
			answer += str_arr_new[i];
		}
		System.out.println(answer);
		
	}

}
