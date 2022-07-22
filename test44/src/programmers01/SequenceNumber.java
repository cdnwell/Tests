package programmers01;

public class SequenceNumber {

	public static void main(String[] args) {
		int n = 15;
		
		int answer = 1;
        int count = 0;
        
        for(int i = 1 ; i <= n/2+1 ; i++) {
			int tmp = 0;
			for(int j = i ; j <= n/2+1; j++) {
				tmp += j;
                
				if(tmp == n) {
					answer++;
                    count++;
                    break;
				}
                if(tmp > n) break;
			}
		}
        
        if(count == 0) answer = 1;
		
		System.out.println(answer);
	}

}
