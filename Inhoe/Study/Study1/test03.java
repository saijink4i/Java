package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class test03 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int n = Integer.parseInt(text.split(" ")[0]);
        int x = Integer.parseInt(text.split(" ")[1]);

        text = br.readLine();
        Integer[] sticks = Stream.of(text.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
    
        sticks = sort(sticks);

        int count = 0;
        while (x >= 0) {
            if(count == sticks.length){
                if(x != 0){
                    count--;
                    break;
                }else{
                    break;
                }
            }
            
            if(sticks[count] <= x){
                x -= sticks[count];
                count++;
            }else if(sticks[count] > x){
                break;
            }
        }

        System.out.println(count);
    }

    public static Integer[] sort(Integer[] arrays){
        for(int i=0 ; i<arrays.length-1 ; i++) {
            int min = arrays[i];
            int index = i;
            for(int j=i+1 ; j<arrays.length ; j++) {
                if(min > arrays[j]){
                    min = arrays[j];
                    index = j;
                }
            }

            min = arrays[i];
            arrays[i] = arrays[index];
            arrays[index] = min;
        }

        return arrays;
    }

    public static String arrayPrint(Integer[] array) {
        String result = "";
        for(Integer number : array){
            result += number + " ";
        }

        return result.trim();
    }
}
