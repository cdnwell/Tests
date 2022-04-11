package test04;

public class Review01 {

	public static void main(String[] args) {

		int []a=new int[] {10,20,4,25,18};
		
		int []b=null;
				
		b=new int[] {1,2,3,4,5,6};
		
		// 배열에 바로 초기화하듯 값을 집어 넣을 수 없다. 
		// b= {12,23,34}; (x)
		// b= new int[] {12,23,34} (o)
		
		int []c=null;
		
		// null값으로 선언된 배열 c에 배열의 갯수를 넣고 값을 넣을 수 없다.
		// c=new int[3] {4,5,6}; (x)
		
		int[] d= {10,20,30};
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		System.out.println();
		
		//배열의 초기화 방법은 두 가지가 있다.
		//int []a=new int[] {10,20,4,25,18};	(o)
		//int []d={10,20,30};	(o)
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	
		System.out.println();
		System.out.println();
		
		int i=90;
		int j=7;
		
		System.out.println(i/(float)j);
		
		//명시적 형변환 j
		//(type)변수명
		//위와 같이 선언하면 변수가 type에 맞게 변형된다.
	}

}
