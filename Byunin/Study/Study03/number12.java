package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] xarr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            xarr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(xarr);

        int min = Integer.MAX_VALUE; //처음 값 비교를 위한 작은ㄱ밧

        for(int i = 1; i <= xarr[n-1]; i++){ //좌표는 1에서 가장 뒤에있는 xi사이만 가능함
            int total = 0;
            for(int j = 0; j<n;j++){
                total += (int) Math.pow(xarr[j] - i,2);
            }
            if(total < min){
                min = total;
            }
        }

        System.out.println(min);
    }
}
