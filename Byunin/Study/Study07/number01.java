package Byunin.Study.Study07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class number01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < l; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        goodarange(l, arr, n);
    }
    private static void goodarange(int l, List<Integer> arr, int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(arr.contains(n)) {
            bw.write(String.valueOf(0));
        }else{
            Collections.sort(arr);
            int count = 0;
            int min = 0;
            int max = 1001;
            for(int i = 0; i < l; i++) {
                if(arr.get(i) < n){
                    min = arr.get(i);
                }else if(arr.get(i) > n && max == 1001){
                    max = arr.get(i);
                }
            }

            count = (n - min - 1) * (max - n) + (max - n - 1);
            bw.write(String.valueOf(count));
        }
        bw.flush();
        bw.close();
    }
}
