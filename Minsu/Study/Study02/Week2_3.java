package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Week2_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String num = br.readLine();
		String[] ta = br.readLine().split(" ");
		String[] hn = br.readLine().split(" ");
		
        int n = Integer.parseInt(num);
        int t = Integer.parseInt(ta[0]);
        int a = Integer.parseInt(ta[1]);
        
        int[] hnArr = new int[n];
        float[] temp = new float[n];
		
        for(int i = 0; i < n; i++) {
        	hnArr[i] = Integer.parseInt(hn[i]);
        }
        
        for(int i = 0; i < n; i++) {
        	temp[i] = (float) Math.abs(a - (12 - (hnArr[i] * 0.006)));
        }
        
        float min = temp[0];
        int result = 1;
        for(int i = 0; i < n; i++) {
        	if(temp[i] < min) {
        		min = temp[i];
        		result = i+1;
        	}
        }
        
        System.out.println(result);
    }
}
