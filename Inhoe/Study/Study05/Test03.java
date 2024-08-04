package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  결과 : 오답
 */

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String temp = br.readLine();
        String text[] = {"c", "h", "o", "k", "u", "d", "a", "i"};
        List<String> textList = new ArrayList<>(Arrays.asList(text));
        Long dp[][] = new Long[temp.length()][8];

        for(int i=0 ; i<dp.length ; i++) {
            dp[i][0] = 1L;
        }
        
        for(int i=0 ; i<temp.length() ; i++) {
            String tempChar = temp.charAt(i) + "";
            System.out.println(tempChar);
            int j = textList.indexOf(tempChar) + 1;
            System.out.println("i : " + i + ", j : " + j);
            if(i == 0){
                if(j > 0)
                    dp[i][j] = 2L;
                else 
                    dp[i][j] = 1L;
            }else {
                if(j > 0)
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-1])%1000000007;
                else 
                    dp[i][j] = dp[i-1][j];
            }
        }

        System.out.println(dp[temp.length()-1][8]);
    }
}
