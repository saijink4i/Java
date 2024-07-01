package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test15X {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String number = br.readLine();

        if(text.charAt(0) == '1'){
            if(number.equals("1"))
                System.out.println("1");
            else
                System.out.println(text.charAt(1));
        } else
            System.out.println(text.charAt(0));
    }
}
