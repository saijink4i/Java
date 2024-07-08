package Byunin.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arrh = new int[n];
        for (int i = 0; i < n; i++) {
            arrh[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(palaceCal(t, a ,arrh));


    }
    public static int palaceCal(int t, int a, int[] arrh) {
        double min = Double.MAX_VALUE; //초기값 넣기 위한 최댓값
        int count = 0;
        for(int i =0; i<arrh.length; i++){
            if(min > Math.abs(a - (t - (arrh[i] * 0.006)))){ //기준 온도인 A값과의 차의 절댓값을 비교해서 적은 쪽을 선택
                count = i;
                min = Math.abs(a - (t - (arrh[i] * 0.006)));
            }
        }
        return count+1; //인덱스가 0번부터 시작이니 1을 더해서 순번을 반환

    }
}
