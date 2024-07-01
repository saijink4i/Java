package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] text = br.readLine().trim().split(" ");
        int routeNumber = Integer.parseInt(text[0]);
        int time = Integer.parseInt(text[1]);

        String[][] route = new String[routeNumber][];
        for(int i = 0; i < routeNumber; i++){
            route[i] = br.readLine().trim().split(" ");
        }

        int min = 1001;
        for(int i = 0; i < routeNumber; i++){
            if(time >= (Integer.parseInt(route[i][1]))){
                if(min > (Integer.parseInt(route[i][0]))){
                    min = Integer.parseInt(route[i][0]);
                }
            }
        }

        System.out.println(min == 1001 ? "TLE" : min);
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
