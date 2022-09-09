package programmers;
// 낼 때는 주석 부분과 package부분 없애서 내야함
class Solution {
	public int solution(String s) {

		int answer = s.length();

		for (int i = 1; i <= s.length() / 2; i++) {
			StringBuilder sb = new StringBuilder();
			String zipStr = s.substring(0, i);
			int zipLevel = 1;
			for (int j = i; j <= s.length(); j += i) {
				String next = s.substring(j, j + i > s.length() ? s.length() : j + i);
				if (zipStr.equals(next)) {
					zipLevel++;
				} else {
					sb.append((zipLevel == 1 ? "" : zipLevel) + zipStr);
					zipStr = next;
					zipLevel = 1;
				}
			}
			sb.append(zipStr);
			answer = Math.min(answer, sb.length());
		}
		return answer;
		
	}
	
}
