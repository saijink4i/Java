/*package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number15 {
    static int n, a, b, c;
    static int[] larr;
    static int min =Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        larr = new int[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            larr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0,0,0,0);

    }
    public static void dfs(int l, int r, int a, int b, int c){
        if(l==n){
            if()
        }
    }

}*/
