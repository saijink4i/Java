package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class number14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Character> chars = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        System.out.println(unification(chars, 0));
    }
    public static int unification(ArrayList<Character> chars, int total) {

        for(int i = 0; i < chars.size()-1; i++) {
            if(chars.get(i) != chars.get(i+1)) {
                ArrayList<Character> temp = new ArrayList<>(chars);
                temp.remove(i);
                temp.remove(i);
                total += 2;
                total = unification(temp, total);
            }
        }

        return total;
    }
}
