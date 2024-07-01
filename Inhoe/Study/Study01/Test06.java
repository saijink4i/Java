package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        boolean result = true;

        if(text.charAt(0) != 'A')
            result = false;

        int count = 0;
        int index = 0;
        if(result){
            for(int i=2 ; i<text.length()-1 ; i++) {
                if(text.charAt(i) == 'C'){
                    index = i;
                    count++;
                }
            }

            if(count != 1)
                result = false;
        }

        if(result){
            for(int i=1 ; i<text.length() ; i++) {
                if(index == i)
                    continue;

                if(text.charAt(i) >= 65 && text.charAt(i) <= 90)
                    result = false;
            }
        }
        
        System.out.println(result ? "AC" : "WA");
    }
}
