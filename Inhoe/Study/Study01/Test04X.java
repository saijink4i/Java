package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04X {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String[] number = br.readLine().split(" ");

        for(int i = 0; i < number.length; i++) {
            int num = Integer.parseInt(number[i]);
            num -= (i + 1);
            number[i] = num + "";
        }

        int sum = 0;
        for(String num : number) {
            sum += Integer.parseInt(num);
        }

        sum = (int)Math.ceil(sum/Integer.parseInt(n));
        if(sum < 0)
            sum--;
        
        int answer = 0;
        for(String num : number) {
            answer += Math.abs(Integer.parseInt(num) + (-1 * sum));
        }
        
        System.out.println(answer);
    }
}
