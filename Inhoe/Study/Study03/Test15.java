package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test15 {
    static int number, targetA, targetB, targetC;
    static int[] bamboos;
    static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] textTemp = br.readLine().trim().split(" ");
        number = Integer.parseInt(textTemp[0]);
        targetA = Integer.parseInt(textTemp[1]);
        targetB = Integer.parseInt(textTemp[2]);
        targetC = Integer.parseInt(textTemp[3]);

        bamboos = new int[number];
        for(int i=0 ; i<number ; i++) {
            bamboos[i] = Integer.parseInt(br.readLine().trim());
        }

        dfs(0, 0, 0, 0, 0);
        System.out.println(minCost);
    }

    static void dfs(int index, int a, int b, int c, int cost) {
        if (index == number) {
            if(a > 0 && b > 0 && c > 0){
                int totalCost = cost;
                totalCost += Math.abs(a-targetA) + Math.abs(b-targetB) + Math.abs(c-targetC);
                minCost = Math.min(minCost, totalCost);
            }
            return;
        }
    
        // 현재 대나무를 사용하지 않는 경우
        dfs(index + 1, a, b, c, cost);
    
        // 현재 대나무를 A에 사용하는 경우
        dfs(index + 1, a + bamboos[index], b, c, cost + (a > 0 ? 10 : 0));
        
        // 현재 대나무를 B에 사용하는 경우
        dfs(index + 1, a, b + bamboos[index], c, cost + (b > 0 ? 10 : 0));

        // 현재 대나무를 C에 사용하는 경우
        dfs(index + 1, a, b, c + bamboos[index], cost + (c > 0 ? 10 : 0));
    }
}
