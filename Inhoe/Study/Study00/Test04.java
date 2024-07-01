package Inhoe.Study.Study00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test04 {
    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = "";
        
        try {
            // number = Integer.parseInt(br.readLine());
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int x = Integer.parseInt(text.split("\n")[3]);

        int coin500 = Integer.parseInt(text.split("\n")[0]);
        int coin100 = Integer.parseInt(text.split("\n")[1]);
        int coin50 = Integer.parseInt(text.split("\n")[2]);
        int answer = 0;
        
        for(int i=0; i<=coin500; i++) {
            for(int j=0 ; j <= coin100 ; j++) {
                for(int k=0 ; k <= coin50 ; k++) {
                    if(i*500 + j*100 + k*50 == x){
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
