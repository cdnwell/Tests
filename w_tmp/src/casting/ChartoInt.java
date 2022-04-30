package casting;

public class ChartoInt {

	public static void main(String[] args) {
		int num =3157;
		System.out.println("num:"+num);
		String str = String.valueOf(num);
		System.out.println("str:"+str);
		int []arr=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i)-'0';
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}

}
