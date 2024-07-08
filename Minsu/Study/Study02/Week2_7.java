package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Week2_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
        
        String[] tempArr = br.readLine().split(" ");
        int count = 1;
        int max = Integer.parseInt(tempArr[0]);
        
        for(int i = 1; i < n; i++) {
        	if(Integer.parseInt(tempArr[i]) >= max) {
        		max = Integer.parseInt(tempArr[i]);
        		count++;
        	}
        }
        
        System.out.println(count);
    }
}
