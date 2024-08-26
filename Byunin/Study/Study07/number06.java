package Byunin.Study.Study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number06 {
    static int n, k;
    static int[] number;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        number = new int[k];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }

        dfs(0);

        System.out.println(result);

    }
    private static void dfs(int i){
        if(i>n){
            return;
        }
        if(i>result){
            result=i;
        }
        for(int j=0;j<k;j++){
            dfs(i*10 + number[j]);
        }
    }
}
