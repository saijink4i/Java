package Inhoe.Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C148 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] text = br.readLine().split(" ");
        int number = Integer.parseInt(text[0]);
        int level = Integer.parseInt(text[1]);

        String aiteList[] = new String[number];
        for(int i=0 ; i<number ; i++) {
            aiteList[i] = br.readLine();
        }

        for(String aite : aiteList) {
            int aiteLevel = Integer.parseInt(aite);
            if(level == aiteLevel)
                continue;
            else if(level > aiteLevel)
                level += aiteLevel/2;
            else 
                level /= 2;
        }

        System.out.println(level);
    }
}
