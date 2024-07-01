package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int n = Integer.parseInt(text.split(" ")[0]);

        String[] textList = new String[n];
        for(int i=0 ; i<textList.length ; i++){
            textList[i] = br.readLine().trim();
        }

        for(int i=0 ; i<textList.length-1 ; i++){
            String min = textList[i];
            int index = i;
            for(int j=i+1 ; j<textList.length ; j++) {
                if(compare(min, textList[j])){
                    min = textList[j];
                    index = j;
                }
            }

            min = textList[i];
            textList[i] = textList[index];
            textList[index] = min;
        }

        String result = "";
        for(String temp : textList){
            result += temp;
        }

        System.out.println(result);
    }

    public static boolean compare(String text1, String text2){
        boolean result = false;
        for(int i=0 ; i<text1.length() ; i++){
            if(text1.charAt(i) < text2.charAt(i)){
                result = false;
                break;
            } else if(text1.charAt(i) > text2.charAt(i)){
                result = true;
                break;
            }
        }
        return result;
    }
}
