package Byunin.Study.Study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number08 {
    static long k;
    static String number = "0";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Long.parseLong(br.readLine());

        dfs(1);

        System.out.println(number.charAt((int) k));

    }
    private static void dfs(int current) {
        if(current>=k){
            return;
        }


    }
}
