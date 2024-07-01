package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test16 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text[] = br.readLine().trim().split(" ");
        int total = Integer.parseInt(text[0]);
        int number = Integer.parseInt(text[1]);
        
        String[] pointText = br.readLine().trim().split(" ");
        List<Integer> points = new ArrayList<Integer>();

        
        for(int i=0 ; i<pointText.length ; i++) {
            points.add(Integer.parseInt(pointText[i]));
        }
        Collections.sort(points);

        int index = 0;
        for(int i=0 ; i<pointText.length ; i++){
            if(i == 0)
                continue;

            if((points.get(i) == 0)||(points.get(i-1) < 0 && points.get(i) > 0)){
                index = i;
                continue;
            }
        }
        if(points.get(total-1) < 0)
            index = total-1;

        long min = 999999999;
        for(int i=0 ; i<number ; i++){
            int location = 0;
            int sum = 0;

            if(index-number+i+1 < 0)
                continue;
            if(index+i+1 > points.size())
                break;

            for(int j=0 ; j<number ; j++){
                sum += Math.abs(points.get(index - number + i + j + 1) - location);
                location = points.get(index - number + i + j + 1);
            }

            if(min > sum)
                min = sum;
        }

        System.out.println(min);
    }
}
