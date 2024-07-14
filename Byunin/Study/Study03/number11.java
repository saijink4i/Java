package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = Collections.max(map.values()); //가장 많은 문자열의 수를 저장

        List<String> list = new ArrayList<>();
        for(String s : map.keySet()) {
            if(map.get(s) == max){
                list.add(s);
            }
        }

        Collections.sort(list);

        for(String s : list){
            System.out.println(s);
        }


    }
}
