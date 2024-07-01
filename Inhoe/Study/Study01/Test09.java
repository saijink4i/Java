package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test09 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] text = br.readLine().trim().split(" ");
        String xPoint = text[2];
        String yPoint = text[3];

        String xCitysText = br.readLine().trim();
        Integer[] xCitys = Stream.of(xCitysText.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        xCitys = sort(xCitys);
        
        String yCitysText = br.readLine().trim();
        Integer[] yCitys = Stream.of(yCitysText.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        yCitys = sort(yCitys);

        boolean result = false;
        for(int i = Integer.parseInt(xPoint) + 1 ; i <= Integer.parseInt(yPoint) ; i++){

            if(i<=xCitys[xCitys.length-1])
                continue;
            
            if(i>yCitys[0])
                continue;

            if((xCitys[xCitys.length-1] < i) && (i <= yCitys[0]))
                result = true;
            
            if(result)
                break;
        }

        System.out.println(result ? "No War" : "War");
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
}
