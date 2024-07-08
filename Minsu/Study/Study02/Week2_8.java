package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
        
        String[] value = br.readLine().split(" ");
        String[] cost = br.readLine().split(" ");
        
        int result = 0;
        for(int i = 0; i < n; i++) {
        	if(Integer.parseInt(value[i]) - Integer.parseInt(cost[i]) > 0) {
        		result += Integer.parseInt(value[i]) - Integer.parseInt(cost[i]);
        	}
        }
        
        System.out.println(result);
    }
}
