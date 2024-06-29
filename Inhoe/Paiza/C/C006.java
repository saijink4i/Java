package Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C006 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp[] = br.readLine().trim().split(" ");
        int parameterNumber = Integer.parseInt(temp[0]);
        int userNumber = Integer.parseInt(temp[1]);
        int top = Integer.parseInt(temp[2]);

        String coefficient[] = br.readLine().trim().split(" ");
        Float c[] = new Float[parameterNumber];
        for(int i = 0; i < parameterNumber; i++){
            c[i] = Float.parseFloat(coefficient[i]);
        }

        String userList[] = new String[userNumber];
        for(int i=0 ; i<userNumber ; i++) {
            userList[i] = br.readLine();
        }

        List<Integer> score = new ArrayList<Integer>();
        for(int i=0 ; i<userNumber ; i++) {
            float sum = 0f;
            String user[] = userList[i].split(" ");

            for(int j=0 ; j<parameterNumber ; j++){
                sum += Float.parseFloat(user[j]) * c[j];
            }

            sum = Math.round(sum);
            score.add((int)sum);
        }

        Collections.sort(score);
        for(int i=score.size()-1 ; i>=score.size()-top ; i--) {
            System.out.println(score.get(i));
        }
    }
}
