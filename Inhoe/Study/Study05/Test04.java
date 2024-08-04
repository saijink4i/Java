package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 *  결과 : 정답
 */

public class Test04 {
    static Integer arrA[];
    static Integer arrB[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String temp[] = br.readLine().split(" ");
        int arrALength = Integer.parseInt(temp[0]);
        int arrBLength = Integer.parseInt(temp[1]);
        
        arrA = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        arrB = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        int result = minCheck(arrALength, arrBLength);

        System.out.println(result);
    }

    static int minCheck(int arrALength, int arrBLength){
        int arrAIndex = 0;
        int arrBIndex = 0;

        int min = Integer.MAX_VALUE;
        while (arrAIndex != arrALength && arrBIndex != arrBLength) {
            int temp = arrA[arrAIndex] - arrB[arrBIndex];

            if(min > Math.abs(temp))
                min = Math.abs(temp);
            
            if(temp < 0)
                arrAIndex++;
            else
                arrBIndex++;
        }

        return min;
    }
}
