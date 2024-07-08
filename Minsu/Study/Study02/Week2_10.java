package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Week2_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
        
		Map<String, Integer> map = new HashMap<>();
		
		long result = 0;
		for(int i = 0; i < n; i++) {
			char[] c = br.readLine().toCharArray();
			Arrays.sort(c);
			String input = String.valueOf(c);
			if(map.containsKey(input)) {
		        result += map.get(input);
		        map.put(input, map.get(input) + 1);
		    } else {
		        map.put(input,1);
		    }
		}
		
		System.out.println(result);
    }
}
