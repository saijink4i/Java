package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  정답 판정 : O
 */

public class Test05 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수와 음식 종류를 입력받음
        String texts[] = br.readLine().split(" ");
        int peaple = Integer.parseInt(texts[0]);
        int foodKind = Integer.parseInt(texts[1]);
        
        // 좋아하는 음식 앙케이트 결과를 입력받음
        Map<String, Integer> favoriteMaps = new HashMap<String, Integer>();
        for(int i = 0; i < peaple; i++){
            // 몇종류의 음식을 좋아하는지와 좋아하는 음식 리스트를 입력받음
            texts = br.readLine().split(" ");
            for(int j = 1; j <= Integer.parseInt(texts[0]); j++){
                // 음식이 이미 응답되었었는지 확인
                if(!favoriteMaps.containsKey(texts[j]))
                    favoriteMaps.put(texts[j], 1);
                else
                    favoriteMaps.put(texts[j], favoriteMaps.get(texts[j])+1);
            }
        }

        // 모두가 좋아한다고 대답한 음식을 카운트함.
        int count = 0;
        Set<String> foods = favoriteMaps.keySet();
        for(String food : foods){
            if(favoriteMaps.get(food) == peaple)
                count++;
        }

        System.out.println(count);
    }
}
