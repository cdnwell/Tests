package test04;

public class Review01 {

	public static void main(String[] args) {

		int []a=new int[] {10,20,4,25,18};
		
		int []b=null;
				
		b=new int[] {1,2,3,4,5,6};
		
		// �迭�� �ٷ� �ʱ�ȭ�ϵ� ���� ���� ���� �� ����. 
		// b= {12,23,34}; (x)
		// b= new int[] {12,23,34} (o)
		
		int []c=null;
		
		// null������ ����� �迭 c�� �迭�� ������ �ְ� ���� ���� �� ����.
		// c=new int[3] {4,5,6}; (x)
		
		int[] d= {10,20,30};
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		System.out.println();
		
		//�迭�� �ʱ�ȭ ����� �� ������ �ִ�.
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
		
		//����� ����ȯ j
		//(type)������
		//���� ���� �����ϸ� ������ type�� �°� �����ȴ�.
	}

}
