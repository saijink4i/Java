package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Week2_2 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String rod = br.readLine();
        int n = Integer.parseInt(rod);
        List<String> tempArr = new ArrayList<String>();
        
        for(int i = 0; i < n; i++) {
        	tempArr.add(br.readLine());
        }
        
        for(int i = 0; i < n; i++) {
        	for(int j = i+1; j < n; j++) {
        		if(tempArr.get(i).equals(tempArr.get(j))) {
            		System.out.printf("No");
            		return;
            	}
        	}
        }
        
        for(int i = 0; i < n-1; i++) {
        	if(tempArr.get(i).charAt(tempArr.get(i).length()-1) != tempArr.get(i+1).charAt(0)) {
        		System.out.printf("No");
        		return;
        	}
        }
        
        System.out.printf("Yes");
    }
}
