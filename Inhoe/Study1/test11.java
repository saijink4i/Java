package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class test11 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        String lineText = br.readLine().trim();
        Integer[] lines = Stream.of(lineText.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        lines = sort(lines);

        int sum = 0;
        for(int i = 1 ; i< lines.length ; i++) {
            sum += lines[i];
        }

        System.out.println(lines[0] < sum ? "Yes" : "No");
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
