package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
        
        String[] mons = br.readLine().split(" ");
        String[] kp = br.readLine().split(" ");
        
        int[] monster = new int[n + 1];
        int[] killPoint = new int[n];
        
        for (int i = 0; i < n + 1; i++) {
            monster[i] = Integer.parseInt(mons[i]);
        }
        for (int i = 0; i < n; i++) {
            killPoint[i] = Integer.parseInt(kp[i]);
        }
        
        int result = 0;
        for(int i = 0; i < n; i++) {
        	if(monster[i] >= killPoint[i]) {
        		result += killPoint[i];
        	} else {
        		result += monster[i];
        		
        		if(monster[i+1] - (killPoint[i] - monster[i]) < 0) {
        			result += monster[i+1];
        			monster[i+1] = 0;
        		} else {
        			result += killPoint[i] - monster[i];
        			monster[i+1] -= killPoint[i] - monster[i];
        		}
        	}
        }
        
        System.out.println(result);
    }
}
