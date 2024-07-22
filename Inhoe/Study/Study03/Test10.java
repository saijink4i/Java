package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 *  결과 : 오답
 */

public class Test10 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tempText = br.readLine().split(" ");
        int totalQuestion = Integer.parseInt(tempText[0]);
        int totalSubmit = Integer.parseInt(tempText[1]);

        Map<Integer, String> status = new HashMap<Integer, String>();
        int correct = 0;
        int penalty = 0;
        for(int i = 0 ; i<totalSubmit ; i++){
            tempText = br.readLine().split(" ");
            int question = Integer.parseInt(tempText[0]);
            String result = tempText[1];

            if(!status.containsKey(question)){
                if(result.equals("AC")){
                    correct++;
                    status.put(question, result);
                }else {
                    penalty++;
                    status.put(question, result);
                }
            }else if(status.get(question).equals("AC")){
                continue;
            }else{
                System.out.println();
                if(result.equals("AC")){
                    correct++;
                    status.put(question, result);
                }else {
                    penalty++;
                }
            }
        }

        System.out.println(correct + " " + penalty);
    }
}
