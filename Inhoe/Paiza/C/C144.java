package Inhoe.Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C144 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String textList[] = new String[number];
        for(int i=0 ; i<number ; i++) {
            textList[i] = br.readLine();
        }

        int sum = 0;
        for(String text : textList) {
            String temp[] = text.split(" ");
            sum += jyanken(temp[0], temp[1]);
        }

        System.out.println(sum);
    }

    public static int jyanken(String alice, String bob){
        switch (alice) {
            case "G":
                if(bob.equals("C"))
                    return 1;
                break;
            case "C":
                if(bob.equals("P"))
                    return 1;
                break;
            case "P":
                if(bob.equals("G"))
                    return 1;
                break;
        }
        return 0;
    }
}
