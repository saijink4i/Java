package Byunin.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long total = 0;
        long middle = 0;//약수 중간값. 약수 중간에 있는 값이 이동횟수의 최솟값이다.
        for(int i = 1; i<=Math.sqrt(n);i++){
            if(n%i==0){ //약수 구하는 공식.제곱근과 나누었을 때 0이 되는 것과 n에서 그 것을 나누었을 때 나오는 값들이 약수
                middle = Math.max(middle, i);
            }
        }
        total = middle-1+(n/middle)-1;
        System.out.println(total);
    }
}
