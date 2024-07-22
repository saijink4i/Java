package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int counto = 0; //o의 개수
        int countm = 0; //?의 개수
        String s = br.readLine();
        for (int i = 0; i < 10; i++) {
            if (s.charAt(i) == 'o') {
                counto++;
                if (counto > 4) {
                    System.out.println(0);
                    return; //반드시 넣어야되는 숫자가 4개가 넘어가는 비밀번호는 없다.
                }
            } else if (s.charAt(i) == '?') {
                countm++;
            }
        }

        System.out.println(passwordcal(counto, countm));
    }

    public static long passwordcal(int counto, int countm) {
        if (counto == 4) {
            return factorial(4);
        }else if(counto>0){
            return combination(4, counto)*(long)Math.pow(counto+countm, 4-counto);
        }else{
            return (long)Math.pow(countm, 4);
        }
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return factorial(n-1) * n;
    }

    public static int combination(int n, int m) {
        return factorial(n)/(factorial(m)*factorial(n-m));
    }
}
