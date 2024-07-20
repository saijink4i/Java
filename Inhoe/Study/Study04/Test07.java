package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  결과 : 오답
 */

public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNumber = Integer.parseInt(br.readLine());
        String texts[] = br.readLine().split(" ");
        Map<String, Integer> numberMap = new HashMap<String, Integer>();

        for(String text : texts) {
            numberMap.put(text, numberMap.getOrDefault(text, 0) + 1);
        }

        long result = 0L;
        List<String> keys = new ArrayList<>(numberMap.keySet());
        for(String key : keys) {
            totalNumber -= numberMap.get(key);
            result += numberMap.get(key) * (totalNumber);
        }

        System.out.println(result);
    }
}
