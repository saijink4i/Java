package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  결과 : 정답
 */

public class Test13 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tempString = br.readLine().split(" ");
        int number = Integer.parseInt(tempString[0]);
        int question = Integer.parseInt(tempString[1]);

        Map<String, String> questionMap = new HashMap<String, String>();
        for(int i=0 ; i<question ; i++) {
            tempString = br.readLine().split(" ");
            if(questionMap.containsKey(tempString[0]) && !questionMap.get(tempString[0]).equals(tempString[1])){
                System.out.println("-1");
                return;
            }else{
                questionMap.put(tempString[0], tempString[1]);
            }
        }


        String resultTemp[] = new String[number];
        Arrays.fill(resultTemp, "*");
        
        Set<String> keys = questionMap.keySet();
        for (String key : keys) {
            resultTemp[Integer.parseInt(key)-1] = questionMap.get(key);
        }

        int result = 0;
        for(int i=0 ; i<number ; i++) {
            if(resultTemp[i] == "*")
                if(i == 0 && number != 1)
                    resultTemp[i] = "1";
                else
                    resultTemp[i] = "0";
            result = result * 10 + Integer.parseInt(resultTemp[i]);
        }

        if(Integer.toString(result).length() != number){
            System.out.println("-1");
            return;
        }

        System.out.println(result);
    }
}
