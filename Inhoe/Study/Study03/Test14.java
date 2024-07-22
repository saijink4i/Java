package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  결과 : 정답
 */

public class Test14 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tempString = br.readLine().split(" ");
        int store = Integer.parseInt(tempString[0]);
        long totalQty = Integer.parseInt(tempString[1]);

        Map<Integer, Integer> priceAndQty = new HashMap<>();
        for(int i = 0; i < store; i++) {
            tempString = br.readLine().split(" ");
            if(priceAndQty.containsKey(Integer.parseInt(tempString[0])))
                priceAndQty.put(Integer.parseInt(tempString[0]), priceAndQty.get(Integer.parseInt(tempString[0])) + Integer.parseInt(tempString[1]));
            else 
                priceAndQty.put(Integer.parseInt(tempString[0]), Integer.parseInt(tempString[1]));
            
        }

        List<Integer> keys = new ArrayList<>(priceAndQty.keySet());
        Collections.sort(keys);

        long count = 0;
        long price = 0;
        int index = 0;
        while (true) {
            long temp = priceAndQty.get(keys.get(index));
            if((count + temp) >= totalQty){
                temp = totalQty - count;
                price += keys.get(index) * temp;
                // System.out.println("temp : " + temp + ", keys.get(index) : " + keys.get(index) + ", price : " + price);
                break;
            } else {
                count += temp;
                price += keys.get(index) * temp;
                // System.out.println("temp : " + temp + ", keys.get(index) : " + keys.get(index) + ", price : " + price);
                index++;
            }
        }

        System.out.println(price);
    }
}
