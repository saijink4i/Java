package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class test05 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        Integer[] number = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        int min = number[0];
        int max = number[0];
        for(int i=1 ; i<number.length ; i++) {
            if(number[i] < min)
                min = number[i];

            if(number[i] > max)
                max = number[i];
        }

        System.out.println(max - min);
    }
}
