package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test01 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자와 텍스트를 입력받음
        int number = Integer.parseInt(br.readLine());
        char[] textArray = br.readLine().toCharArray();

        int count = 0;
        for(int i=0 ; i<number-2 ; i++) {
            // ABC인지 체크
            if(textArray[i]=='A' && textArray[i+1]=='B' && textArray[i+2]=='C')
                count++;
        }

        System.out.println(count);
    }
}
