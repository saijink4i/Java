package Inhoe.Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C029 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text[] = br.readLine().split(" ");
        int number = Integer.parseInt(text[0]);
        int planDate = Integer.parseInt(text[1]);
        String dateList[] = new String[number];

        for(int i = 0; i < number; i++) {
            dateList[i] = br.readLine();
        }

        float answer = 100f;
        int answerDate = 0;
        for(int i=planDate-1 ; i<number ; i++){
            int sum = 0;
            for(int j=i-planDate+1 ; j<=i ; j++){
                sum += Integer.parseInt(dateList[j].split(" ")[1]);
            }
            float result = (float)sum / (float)planDate;
            if(result < answer){
                answer = result;
                answerDate = i-planDate+1;
            }
        }
        int startDate = Integer.parseInt(dateList[0].split(" ")[0]);
        System.out.println((startDate + answerDate) + " " + (startDate + answerDate + planDate - 1));
    }
}
