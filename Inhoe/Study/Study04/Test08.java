package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test08 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int minNumber = Integer.MAX_VALUE;
        boolean minInclude = true;
        int maxNumber = Integer.MIN_VALUE;
        boolean maxInclude = true;
        for (int i = 0; i < number; i++) {
            String temp[] = br.readLine().split(" ");
            int t = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]);
            int max = Integer.parseInt(temp[2]);

            if(minNumber == min){
                if(minInclude && (t == 3 || t == 4))
                    minInclude = false;
            }else if(minNumber > min){
                minNumber = min;
                if(t == 1 || t == 2)
                    minInclude = true;
                else if(t == 3 || t == 4)
                    minInclude = false;
            }

            if(maxNumber == max){
                if(maxInclude && (t == 2 || t == 4))
                    maxInclude = false;
            }else if(maxNumber < max){
                maxNumber = max;
                if(t == 1 || t == 3)
                    maxInclude = true;
                else if(t == 2 || t == 4)
                    maxInclude = false;
            }
        }

        int start;
        if(minInclude)
            start = minNumber;
        else
            start = maxNumber + 1;
        
        int end;
        if(maxInclude)
            end = maxNumber;
        else
            end = maxNumber - 1;

        System.out.println(start);
        System.out.println(end);

        System.out.println(end - start + 1);
    }
}
