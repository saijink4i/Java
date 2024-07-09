package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum+=Integer.parseInt(st.nextToken());
        }

        int wantScore = n * m - sum;

        if(wantScore <= 0){
            System.out.println("0");
        }else if(wantScore > k){
            System.out.println("-1");
        }else{
            System.out.println(wantScore);
        }

    }

}
