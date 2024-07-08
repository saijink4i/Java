package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Week2_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] rod = br.readLine().split(" ");
		int n = Integer.parseInt(rod[0]);
        int m = Integer.parseInt(rod[1]);
        int c = Integer.parseInt(rod[2]);
        
        String[] bArr = br.readLine().split(" ");
        
        int result = 0;
        for(int i = 0; i < n; i++) {
        	String[] tempArr = br.readLine().split(" ");
        	int sum = 0;
        	for(int j = 0; j < m; j++) {
        		sum += Integer.parseInt(tempArr[j]) * Integer.parseInt(bArr[j]);
        	}
        	sum += c;
        	
        	if(sum > 0) {
        		result++;
        	}
        }
        
        System.out.println(result);
    }
}
