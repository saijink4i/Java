package Byunin.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class number06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] iarr = new int[m];
        for(int i = 0; i < m; i++){
            iarr[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<ArrayList<Integer>> codelist = new ArrayList<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> sourcecode = new ArrayList<>();
            for(int j = 0; j < m; j++){
                sourcecode.add(Integer.parseInt(st.nextToken()));
            }
            codelist.add(sourcecode);
        }
        System.out.println(codeCal(n, m, c , iarr, codelist));

    }
    public static int codeCal(int n, int m, int c, int[] iarr, ArrayList<ArrayList<Integer>> codelist){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            long total = 0; //주어진 코드리스트의 값의 합이 정수 최대치보다 높을 수 있으므로 long타입을 쓴다
            for(int j = 0 ; j < m ; j++){
                total = total + iarr[j] * codelist.get(i).get(j);
            }
            if(total + c > 0){
                count++;
            }
        }
        return count;
    }
}
