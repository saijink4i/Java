package Byunin.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class number18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        if(stringtransform(s, t)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean stringtransform(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> stot = new HashMap<>();
        Map<Character, Character> ttos = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(stot.containsKey(s1)){
                if(!stot.get(s1).equals(t1)){
                    return false;
                }
            }else{
                stot.put(s1, t1);
            }

            if(ttos.containsKey(t1)){
                if(!ttos.get(t1).equals(s1)){
                    return false;
                }
            }else{
                ttos.put(t1, s1);
            }
        }

        return true;

    }
}
