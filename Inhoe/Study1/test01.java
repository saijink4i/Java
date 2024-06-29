package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class test01 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int n = Integer.parseInt(text.split(" ")[0]);
        int k = Integer.parseInt(text.split(" ")[1]);

        text = br.readLine();
        Integer[] sticks = Stream.of(text.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
    
        sticks = sort(sticks);

        int sum = 0;
        for(int i=0 ; i<k ; i++) {
            sum += sticks[i];
        }

        System.out.println(sum);
    }

    public static Integer[] sort(Integer[] arrays){
        for(int i=0 ; i<arrays.length-1 ; i++) {
            int max = arrays[i];
            int index = i;
            for(int j=i+1 ; j<arrays.length ; j++) {
                if(max < arrays[j]){
                    max = arrays[j];
                    index = j;
                }
            }

            max = arrays[i];
            arrays[i] = arrays[index];
            arrays[index] = max;
        }

        return arrays;
    }
}
