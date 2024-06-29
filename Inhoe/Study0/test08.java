package Study0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {
    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        try {
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int total = Integer.parseInt(text.split(" ")[0]);
        int sumNumber = Integer.parseInt(text.split(" ")[1]);

        String answer = "";

        for(int i = total ; i >= 0 ; i--) {
            for(int j=total-i ; j >= 0 ; j--) {
                int k = total-i-j;
                
                if(i*10000 + j*5000 + k*1000 == sumNumber){
                    answer = (i+" "+j+" "+k);
                }
                
            }
        }
        if(answer == "")
            answer = "-1 -1 -1";

        System.out.println(answer);

    }
}
