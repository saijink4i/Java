package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 *  결과 : 오답
 */

public class Test08 {
    static Long count = 0L;
    static int totalStairs;
    static Set<Integer> stairList = new HashSet<Integer>();
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] textList = br.readLine().split(" ");
        totalStairs = Integer.parseInt(textList[0]);
        int stairs = Integer.parseInt(textList[1]);

        
        for(int i=0 ; i<stairs ; i++) {
            stairList.add(Integer.parseInt(br.readLine().trim()));
        }

        stairsCheck(0);

        System.out.println(count%1000000007);
    }

    public static void stairsCheck(int numberStairs) {
        if(numberStairs == totalStairs){
            count++;
            return;
        }

        if(numberStairs > totalStairs)
            return;

        if(!stairList.contains(numberStairs + 1))
            stairsCheck(numberStairs + 1);
        
        if(!stairList.contains(numberStairs + 2))
            stairsCheck(numberStairs + 2);
    }
}
