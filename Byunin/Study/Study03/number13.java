package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] s = new int[m];
        int[] c = new int[m];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            s[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(guessthenumber(n, m, s, c));
    }

    public static String guessthenumber(int n, int m, int[] s, int[] c){
        for(int i = 0; i < 1000; i++){ //자릿수는 최대가 3이므로 1000미만의 수에 정답 존재
            String num = String.valueOf(i);
            if(num.length() != n){
                continue; //자릿수가 다르면 넘어가라
            }

            boolean flag = true;
            for(int j = 0; j < m; j++){
                if(s[j]-1 >= num.length() || num.charAt(s[j]-1) - '0' != c[j]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return num;
            }
        }
        return "-1";
    }
}
