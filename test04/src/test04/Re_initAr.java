package test04;

public class Re_initAr {

	public static void main(String[] args) {
		int [] n=new int[3];
		float [] f=new float[3];
		double [] d=new double[3];
		char [] c=new char[3];
		String[] s=new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.println(n[i]);
		}
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(f[i]);
		}
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(d[i]);
		}
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(c[i]);
		}
		//char �迭 �ʱ�ȭ
		//""������ �ʱ�ȭ �Ǵ� �� ����. ������ ��µȴ�.
		System.out.println("-----");
		for(int i=0;i<3;i++) {
			System.out.println(s[i]);
		}
		System.out.println();
		System.out.println("-----");
		//String �迭 �ʱ�ȭ
		//null������ �ʱ�ȭ �ȴ�.
		
		
		//char ���� "" �� Ȯ��
		
		
		//char chr=""; (x)
		//""�� String ���� ���� �� �� �Ѵٴ� ������ ���´�.
		
		//char chr=''; (x)
		//''���� �ƹ��͵� ���ٴ� ���� ���ð� ���´�.
		
		char chr=' ';
		
		System.out.println(chr==c[0]);
		//�迭 c���� � ���� �ʱ�ȭ ������ ������ �ľ��Ѵ�.
		//�ʱ�ȭ ������ white space�� ���� �ʾҴ�.
		//false ����
		System.out.println("-----");
		
		chr='0';
		System.out.println(chr);
		System.out.println(chr==c[0]);
		//���ۿ��� ã�� �ʱⰪ�� ���� ���Ҵ�.
		//false���� ��ȯ�Ѵ�.
		System.out.println("-----");
		
		//chr�� �ʱⰪ '\u0000'
		
		chr='\u0000';
		System.out.println(chr);
		System.out.println(chr==c[0]);
		//char �迭�� �ʱⰪ�� \u0000 �̴�.
		//�� ���� null�� ������ ���غ��ڴ�.
		
		//char �������� null���� ���� �ʴ´�.
		//������ �߻���Ų��.
		//chr=null; (x)
		
		//chr�� �ʱⰪ '\0'
		//'\0'�� '\u0000'�� ����.
		
		chr='\0';
		System.out.println(chr);
		System.out.println(chr==c[0]);
		
		//�������ڸ� chr�迭�� �ʱⰪ�� '\0'�� ���ٴ� ���� �� �� �ְ�
		//�� ���� '\u0000'�� ���Ҵ�.
	}

}
