package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> c = new ArrayList<Integer>();
        while (st.hasMoreTokens()) {
            c.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(notequal(n, c));


    }
    public static long notequal(int n, List<Integer> c) {
        long total = 1; //첫번째 경우의 수를 곱할때 1로해야 계산됨
        Collections.sort(c); //경우의 수만 구하면 되니까 그냥 정렬해버리기~
        for(int i=0; i<n; i++) {
            total = (total * c.get(i)-i) % 1000000007; //경우의 수 구하는 공식 n!
                                                        //모듈러 공식(나머지 이론) (a%n * b%n)%n == (a*b)%n
        }

        return total;
    }
}
