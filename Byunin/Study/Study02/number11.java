package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] varr = new double[n];
        for (int i = 0; i < n; i++) {
            varr[i] = Long.parseLong(st.nextToken());
        }

        System.out.println(Maxprice(n, varr));
    }
    static double Maxprice(int n, double[] varr) { //오름차순 정렬해서 작은 수부터 합치면 됨
        for (int i = 1; i < n; i++) {
            double value = varr[i];
            int prev = i-1;
            while(prev>=0 && value < varr[prev]) {
                varr[prev+1] = varr[prev];
                prev--;
            }
            varr[prev+1] = value;
        }
        double total = varr[0];
        for(int i=1;i<n;i++){
            total = (total + varr[i]) / (long)2;
        }

        return total;
    }
}
