package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(powcalculate(a,b,c));
    }
    public static char powcalculate(long a, long b, long c) {
        if(c % 2 == 0){ //c가 짝수면 a와 b의 절댓값만 비교
            if(Math.abs(a) > Math.abs(b)){
                return '>';
            }else if(Math.abs(a) < Math.abs(b)){
                return '<';
            }else{
                return '=';
            }
        }else{
            if(a<b){
                return '<';
            }else if(a>b){
                return '>';
            }else{
                return '=';
            }

        }
    }
}
