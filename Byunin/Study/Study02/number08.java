package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] jewel = new int[n];
        for(int i = 0; i < n; i++){
            jewel[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] cost = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(jewelcost(n, jewel, cost));
    }

    public static int jewelcost(int n, int[] jewel, int[] cost) {
        int benefit = 0;
        for(int i = 0; i < n; i++){
            if(jewel[i]-cost[i]>0){
                benefit += jewel[i]-cost[i];
            }
        }
        return benefit;
    }
}
