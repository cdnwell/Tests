package programmers;

public class StringCompressSubstring {
	/*
	 * programmers lv.2
	 * 문자열 압축
	 */
	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		
		int answer = s.length();

		for(int i =1;i<=s.length()/2;i++) {
			StringBuilder sb = new StringBuilder();
			String zipStr = s.substring(0, i);	//시작하는 zipStr
			int zipLevel = 1;
			for(int j =i;j<=s.length();j+=i) {//*중요
				String next = s.substring(j, j+i > s.length() ? s.length() : j+i);
				if(zipStr.equals(next)) {
					zipLevel++;
				} else {
					//두 문자가 일치하지 않은 경우
					sb.append((zipLevel == 1 ? "" : zipLevel) + zipStr );
					zipStr = next;
					zipLevel = 1;
				}
			}
			sb.append(zipStr);	// 중요*
			System.out.println(i +" "+ sb);
			answer = Math.min(answer, sb.length());
		}
		
		System.out.println(answer);
	}
}
