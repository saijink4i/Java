package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test02 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // (1, 2, ..., X)/과목수 = 목표점
        // X = 목표점 * 과목수 - (1, 2, ..., N-1)

        // 과목수, 만점, 목표점
        String[] textList = br.readLine().split(" ");
        int subjectsNumber = Integer.parseInt(textList[0]);
        int perfectScore = Integer.parseInt(textList[1]);
        int targetScore = Integer.parseInt(textList[2]);

        // 과목을 전부 더함
        textList = br.readLine().split(" ");
        int sum = 0;
        for(int i=0 ; i<subjectsNumber-1 ; i++) {
            sum += Integer.parseInt(textList[i]);
        }

        // X = 목표점 * 과목수 - (1, 2, ..., N-1)
        int result = targetScore * subjectsNumber - sum;

        // 만점이하면 출력
        if(perfectScore >= result && result >= 0)
            System.out.println(result);
        // 0점 이하면 0 으로 출력
        else if(perfectScore >= result && result < 0)
            System.out.println("0");
        // 다 해당안되면 -1 출력
        else
            System.out.println("-1");
    }
}   
