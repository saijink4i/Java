package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = "";
        if(n>=m){ //꼼수
            for(int i=0;i<n;i++){
                s += String.valueOf(m);
            }
        }else{
            for(int i=0;i<m;i++){
                s += String.valueOf(n);
            }
        }

        System.out.println(s);

        /*String ns = ""; //정식
        String ms = "";
        for(int i = 0; i < n; i++){
            ms += String.valueOf(m);
        }
        for(int i = 0; i < m; i++){
            ns += String.valueOf(n);
        }
        if(ns.compareTo(ms) >= 0){
            System.out.println(ms);
        } else{
            System.out.println(ns);
        }*/
    }
}
