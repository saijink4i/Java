package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test06 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자와 몇진수로 할지를 입력받음
        String textList[] = br.readLine().split(" ");
        int numberText = Integer.parseInt(textList[0]);
        int decimal = Integer.parseInt(textList[1]);

        // 숫자를 진수로 나누어서 n진수에 맞춘 텍스트를 생성
        String result = "";
        while (numberText >= decimal) {
            result += Integer.toString(numberText % decimal);
            numberText /= decimal;
        }
        result += numberText;

        // 텍스트의 자리수를 출력
        System.out.println(result.length());
    }
}
