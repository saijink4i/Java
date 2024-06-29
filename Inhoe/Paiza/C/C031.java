package Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C031 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        List<String> city = new ArrayList<String>();
        List<Integer> timeDiff = new ArrayList<Integer>();
        

        for(int i=0 ; i<number ; i++) {
            String temp[] = br.readLine().split(" ");
            city.add(temp[0]);
            timeDiff.add(Integer.parseInt(temp[1]));
        }

        String temp[] = br.readLine().split(" ");
        String startPoint = temp[0];
        String startTime = temp[1];

        if(timeDiff.get(city.indexOf(startPoint)) < 0)
            startTime = timeCheck(startTime, timeDiff.get((-1)*city.indexOf(startPoint)));
        else
            startTime = timeCheck(startTime, timeDiff.get(city.indexOf(startPoint)));

        for(int i=0 ; i<number ; i++){
            System.out.println(timeCheck(startTime, timeDiff.get(i)));
        }
    }

    public static String timeCheck(String startTime, int time) {
        int tempNumber = Integer.parseInt(startTime.split(":")[0]) + time;

        if(tempNumber >= 24)
            tempNumber -= 24;
        else if(tempNumber < 0)
            tempNumber += 24;
        
        if(tempNumber < 10)
            startTime = "0" + Integer.toString(tempNumber) + startTime.substring(2);
        else
        startTime = Integer.toString(tempNumber) + startTime.substring(2);
        
        return startTime;
    }
}
