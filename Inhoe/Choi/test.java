package Choi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine().trim());
        String[][] travel = new String[number][];

        int startX = 0;
        int startY = 0;
        int startT = 0;

        for(int i=0 ; i<number ; i++) {
            travel[i] = br.readLine().trim().split(" ");
        }

        boolean result = true;
        for(int i=0 ; i<number ; i++) {
            boolean notPossible = true;
            int t = Integer.parseInt(travel[i][0]);
            int x = Integer.parseInt(travel[i][1]);
            int y = Integer.parseInt(travel[i][2]);

            if(Math.abs(x - startX) + Math.abs(y  - startY) <= t - startT){
                if((t - startT - (Math.abs(x - startX) + Math.abs(y  - startY))) % 2 == 0)
                    notPossible = false;
            }

            startT = t;
            startX = x;
            startY = y;

            if(notPossible){
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}