package whilecontinue;

public class WhileContinue {

	public static void main(String[] args) {
		int i=1;
		
		while(i<100) {
//			System.out.println(i);
			i++;
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
//			i++;
		}
		//while��,do while�� continue ���ǽ����� �̵�
		//for�� ���������� �̵�
		
	}

}
