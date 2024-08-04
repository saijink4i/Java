package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(ManyBalls(n));
    }

    public static String ManyBalls(long n){
        String s = "";
        for(int i = 0; i < 120; i++){
            if(n%2==0){
                n = n/2;
                s = "B"+ s;
            }else{
                n = n-1;
                s = "A"+ s;
            }
            if(n==0){
                break;
            }
        }
        return s;
    }
}
