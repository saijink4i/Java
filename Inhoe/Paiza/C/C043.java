package Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C043 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine())+1;
        String text[] = br.readLine().split(" ");

        Map<Integer, Integer> score = new HashMap<Integer, Integer>();
        for(int i=0; i<text.length; i++) {
            if(score.containsKey(Integer.parseInt(text[i]))){
                score.put(Integer.parseInt(text[i]), score.get(Integer.parseInt(text[i]))+1);
            } else{
                score.put(Integer.parseInt(text[i]), 1);
            }
        }

        List<Integer> userList = new ArrayList<>(score.keySet());

        int max = 0;
        String index = "";
        
        userList.sort(Comparator.naturalOrder());
        for(int i=0 ; i<userList.size() ; i++) {
            if(max < score.get(userList.get(i))) {
                max = score.get(userList.get(i));
                index = Integer.toString(userList.get(i));
            }else if(max == score.get(userList.get(i))){
                index += " " + Integer.toString(userList.get(i));
            }
        }

        System.out.println(index);
    }
}
