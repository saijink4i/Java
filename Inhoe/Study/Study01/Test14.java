package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test14 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int teamNumber = Integer.parseInt(br.readLine().trim());

        String powerText = br.readLine().trim();
        Integer[] power = Stream.of(powerText.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        Arrays.sort(power);

        int num = 0;
        long sum = 0;
        for(int i=teamNumber*3-1 ; i>=0 ; i--){
            if(teamNumber % 2 == 0)
                if(i%2 == 0){
                    sum += power[i];
                    num++;
                }

            if(teamNumber % 2 == 1)
                if(i%2 == 1){
                    sum += power[i];
                    num++;
                }

            if(num == teamNumber)
                break;
        }

        System.out.println(sum);
    }
}
