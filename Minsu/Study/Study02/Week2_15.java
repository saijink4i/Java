package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2_15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] hi = br.readLine().split(" ");
        
        int[] flowerLength = new int[n];
        for(int i = 0; i < n; i++) {
        	flowerLength[i] = Integer.parseInt(hi[i]);
        }
        
        int count = flowerLength[0];
        for(int i = 1; i < n; i++) {
        	if(flowerLength[i] > flowerLength[i-1]) {
        		count += flowerLength[i] - flowerLength[i-1];
        	}
        }
        
        System.out.println(count);
    }
}
