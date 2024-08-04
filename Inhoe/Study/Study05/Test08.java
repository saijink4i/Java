package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long number = Long.parseLong(br.readLine());

        String result = "";
        while (number > 1) {
            if(number % 2 == 1){
                result = "A" + result;
                number--;
            }else {
                result = "B" + result;
                number /= 2;
            }
        }

        result = "A" + result;

        System.out.println(result);
    }
}
