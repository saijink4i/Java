package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Week2_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String num = br.readLine();
        int s = Integer.parseInt(num);
        
        int count = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(s);
        
        while(true) {
        	count++;
        	if(s%2 == 0) {
        		s = s/2;
        	}else {
        		s = (3 * s) + 1;
        	}
        	if(temp.contains(s)) {
        		break;
        	} else {
        		temp.add(s);
        	}
        }
        
        System.out.println(count);
    }
}
