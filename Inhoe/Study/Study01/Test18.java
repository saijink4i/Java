package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 *  결과 : 정답
 */

public class Test18 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String textA = br.readLine().trim();
        String textB = br.readLine().trim();

        boolean result = transform(textA, textB);
        System.out.println(result ? "Yes" : "No");
    }

    public static Boolean transform(String textA, String textB){
        Map<Character, Character> aToB = new HashMap<>();
        Map<Character, Character> bToA = new HashMap<>();

        for(int i=0 ; i<textA.length() ; i++){
            char a = textA.charAt(i);
            char b = textB.charAt(i);

            if(aToB.containsKey(a)){
                if(aToB.get(a) != b)
                    return false;
            } else {
                aToB.put(a, b);
            }

            if(bToA.containsKey(b)){
                if(bToA.get(b) != a){
                    return false;
                }
            } else {
                bToA.put(b, a);
            }
        }

        return true;
    }
}
