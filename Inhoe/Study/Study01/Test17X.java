package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test17X {
    final static int MAX = 999999999;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] text = br.readLine().split(" ");
        int number = Integer.parseInt(text[0]);
        int x = Integer.parseInt(text[1]);
        text = br.readLine().split(" ");
        int[] pointList = new int [number];
        for(int i=0 ; i<number ; i++){
            pointList[i] = Integer.parseInt(text[i]);
        }

        List<Integer> distance = new ArrayList<>();
        for(int i=0 ; i<number ; i++){
            if(pointList[i] < x)
                distance.add(x-pointList[i]);
            else 
                distance.add(pointList[i]-x);
        }

        int gcd = MAX;
        for(int i=1 ; i<distance.size() ; i++){
            int num = gcd(distance.get(i-1), distance.get(i));
            if(gcd > num)
                gcd = num;
        }

        System.out.println(gcd);
    }

    public static int gcd(int numberA, int numberB){
        if(numberB == 0) return numberA;
        return gcd(numberB, numberA % numberB);
    }
}
