package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test20X {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=357 ; i<=number ; i++) {
            if(is753(i))
                sum++;
        }

        System.out.println(sum);
    }

    public static boolean is753(int number) {

        int is753[] = {0, 0, 0};

        while (number > 0) {
            int temp = number%10;
            number /= 10;

            if(temp == 7)
                is753[0]++;
            else if(temp == 5)
                is753[1]++;
            else if(temp == 3)
                is753[2]++;
            else
                return false;
        }

        if(is753[0] == 0 || is753[1] == 0 || is753[2] == 0)
            return false;
        else
            return true;
    }
}
