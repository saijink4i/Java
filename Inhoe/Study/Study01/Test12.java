package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] otoshidama = new String[number];
        for(int i=0 ; i<number ; i++) {
            otoshidama[i] = br.readLine().trim();
        }

        int en = 0;
        float btc = 0.0f;
        for(int i=0 ; i<number ; i++) {
            String[] sinseki = otoshidama[i].split(" ");
            if(sinseki[1].equals("JPY"))
                en += Integer.parseInt(sinseki[0]);
            else 
                btc += Float.parseFloat(sinseki[0]);
        }

        btc *= 380000;

        System.out.println(btc + en);
    }
}
