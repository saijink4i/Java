package Byunin.Study.Study07;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //전체 요소 갯수
        int k = Integer.parseInt(st.nextToken()); //앞 뒤 자르는 요소 개수
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            score[i] = Double.parseDouble(st.nextToken());
        }

        trimmedaverage(n, k, score);
    }
    private static void trimmedaverage(int n, int k, double[] score) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(score);
        double sum = 0;
        double index = 0;
        for(int i=k;i<n-k;i++){ //절사평균
            sum += score[i];
            index++;
        }

        bw.write(String.format("%.2f\n", sum/index));
        sum = 0;
        for(int i=0;i<n;i++){ //보정평균
            if(i<k){
                sum += score[k];
            }else if(i>n-1-k){
                sum += score[n-1-k];
            }else{
                sum += score[i];
            }
        }
        bw.write(String.format("%.2f\n", sum/n));
        bw.flush();
        bw.close();
    }
}
