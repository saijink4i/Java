package Byunin.Study.Study06;

import java.io.*;
import java.util.*;

public class number06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //배열 a의 크기
        st = new StringTokenizer(br.readLine());
        Set<Integer> a = new HashSet<>(); //비교 대상군
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
            if(a.contains(b[i])) {
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }
        bw.flush();

    }
}
