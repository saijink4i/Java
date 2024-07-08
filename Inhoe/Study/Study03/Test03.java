package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test03 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 A와 숫자 B를 입력받음
        String textList[] = br.readLine().split(" ");
        int numberA = Integer.parseInt(textList[0]);
        int numberB = Integer.parseInt(textList[1]);

        String result = "";
        // 숫자 A와 B를 확인하고 작은쪽을 반대쪽번 반복시킴
        if(numberA>numberB)
            for(int i=0; i<numberA; i++)
                result += numberB;
        else
            for(int i=0; i<numberB; i++)
                result += numberA;

        System.out.println(result);
    }
}
