package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		long n = Long.parseLong(br.readLine());
		
		long min = n - 1;
        for (int x = 1; x <= Math.sqrt(n); x++) {
            if (n % x == 0) {
                long y = n / x;
                if(min > (x + y) - 2) {
                	min = (x + y) - 2;
                }
            }
        }
        
        System.out.println(min);
    }
}
