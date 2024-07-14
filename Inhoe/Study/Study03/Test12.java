package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/*
 *  결과 : 정답
 */

public class Test12 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(br.readLine());
        Integer[] pointList = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        long sum = 0; 
        for(int i=0 ; i<pointList.length ; i++) {
            sum += pointList[i];
        }

        long point = Math.round((double)sum/(double)number);
        long result = 0;
        for(int i=0 ; i<pointList.length ; i++) {
            result += Math.pow(pointList[i] - point, 2);
        }
        System.out.println(result);
    }
}
