package Minsu.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week2_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		String[] v = br.readLine().split(" ");
		
		List<Double> price = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	price.add(Double.parseDouble(v[i]));
        }
        
        //리스트를 정리하려면 Collections, 배열은 Array
        Collections.sort(price, Collections.reverseOrder());
        
        while (price.size() > 1) {
        	double last = price.remove(price.size() - 1);
        	double secondLast = price.remove(price.size() - 1);
            
        	double sum = (last + secondLast) / 2;
            price.add(sum);
        }
        
        System.out.println(price.get(0));
    }
}
