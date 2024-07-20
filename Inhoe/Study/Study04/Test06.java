package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text[] = br.readLine().split(" ");
        int numberA = Integer.parseInt(text[0]);
        int numberB = Integer.parseInt(text[1]);
        int numberC = Integer.parseInt(text[2]);
        
        if(numberC%2==0){
            if(Math.abs(numberA) == Math.abs(numberB))
                System.out.println("=");
            else {
                if(Math.abs(numberA) > Math.abs(numberB))
                    System.out.println(">" );
                else
                    System.out.println("<");
            }
        }else if(numberC%2==1){
            if(numberA == numberB)
                System.out.println("=");
            else if(numberA > numberB)
                System.out.println(">" );
            else
                System.out.println("<");
        }
    }
}
