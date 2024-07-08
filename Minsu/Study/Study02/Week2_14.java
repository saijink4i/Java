package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2_14 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] c = br.readLine().toCharArray();
		
		int num0 = 0;
		int num1 = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '0') {
				num0++;
			} else {
				num1++;
			}
		}
		
		int result = Math.min(num0, num1) * 2;
		System.out.println(result);
    }
}
