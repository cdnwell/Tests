package baekjoon;

import java.util.Scanner;

public class SortMember {
	/*
	 * baekjoon - 10814번 문제
	 * 멤버 나이순, 가입순으로 정렬하기
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		
		String []str = new String[n];
		
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		
		Container[] cont = new Container[n];
		
		for(int i=0;i<n;i++) {
			String[] str_tmp = str[i].split("\\s");
			int a = Integer.parseInt(str_tmp[0]);
			String b = str_tmp[1];
			cont[i]=new Container(a,b);
		}
		
		bubbleSort(cont,n);
		
		for(int i=0;i<n;i++) {
			System.out.println(cont[i].num+" "+cont[i].name);
		}
		
	}

	public static void bubbleSort(Container[] cont,int n){
		
		int i,j;
		Container tmp;
		for(i=n-1;i>0;i--) {
			for(j=0;j<i;j++) {
				if(cont[j].num>cont[j+1].num) {
					tmp=cont[j];
					cont[j]=cont[j+1];
					cont[j+1]=tmp;
				}
			}
		}
	}
}

class Container{
	public int num;
	public String name;
	
	public Container(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
}

