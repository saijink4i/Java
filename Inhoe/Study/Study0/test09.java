package Study0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        String template[] = {"dream", "dreamer", "erase", "eraser"};

        boolean answer = true;
        while (text.length()>0) {
            boolean check = false;
            for(String temp : template) {
                if(text.endsWith(temp)){
                    text = text.substring(0, text.length()-temp.length());
                    check = true;
                }
            }

            if(!check){
                answer = false;
                break;
            }
        }

        System.out.println(answer ? "YES" : "NO");
    }
}
