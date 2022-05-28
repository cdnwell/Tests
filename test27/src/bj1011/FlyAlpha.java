package bj1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyAlpha {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i =0 ;i<T;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			int distance = Y - X;
			
			int max = (int)Math.sqrt(distance);
			
			if(max == Math.sqrt(distance)) {
				sb.append(2*max-1).append("\n");
			}else if(distance <= max* max+max) {
				sb.append(2*max).append("\n");
			}else {
				sb.append(2*max +1).append("\n");
			}
			
		}
		
		System.out.println(sb);
		
	}

}
