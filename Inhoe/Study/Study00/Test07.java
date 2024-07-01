package Inhoe.Study.Study00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Test07 {
    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set set = new HashSet<>();

        int x;
        
        try {
            x = Integer.parseInt(br.readLine());
            for(int i=0 ; i<x ; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(set.size());
    }
}
