package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문장 갯수를 입력받고, 문장 갯수만큼의 Map 배열을 생성함
        int number = Integer.parseInt(br.readLine());
        Map<String, Integer> textList[] = new HashMap[number];

        int count = 0;
        for(int i=0 ; i<number ; i++) {
            // 입력받은 문자열의 알파벳 종류, 갯수를 Map으로 변환해서 보존
            String tempText = br.readLine().trim();
            textList[i] = alphabetMap(tempText);

            // 첫번째는 생략
            if(i==0)
                continue;
            
            // 과거에 입력받은 문자열중 애너그램이 있는지 체크, 있다면 카운트 추가
            for(int j=i-1 ; j>=0 ; j--) {
                if(textList[i].equals(textList[j]))
                    count++;
            }
        }
        System.out.println(count);
    }

    // 입력받은 문자열을 알파벳의 종류와 갯수로 Map으로 변환
    public static Map<String, Integer> alphabetMap(String text){
        Map<String, Integer> alphabetMap = new HashMap<>();
        for(int i=0 ; i<text.length() ; i++){
            if(!alphabetMap.containsKey(text.charAt(i)))
                alphabetMap.put(text.charAt(i)+"", 1);
            else
                alphabetMap.put(text.charAt(i)+"", alphabetMap.get(text.charAt(i))+1);
        }
        return alphabetMap;
    }
}
