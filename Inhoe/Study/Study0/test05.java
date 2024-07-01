package Study0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test05 {
    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = "";
        
        try {
            // number = Integer.parseInt(br.readLine());
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int number = Integer.parseInt(text.split(" ")[0]);
        int a = Integer.parseInt(text.split(" ")[1]);
        int b = Integer.parseInt(text.split(" ")[2]);
        int totalSum = 0;

        for(int i=1 ; i<= number ; i++) {
            int temp = i;
            int total = 0;
            while (temp != 0) {
                total += temp%10;
                temp /= 10;
            }
            if(a <= total && b >= total) 
                totalSum += i;
        }

        System.out.println(totalSum);
    }
}
