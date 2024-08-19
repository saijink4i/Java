package Byunin.Study.Study06;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] atlist = new int[n]; //특성값 리스트
        for(int i = 0; i < n; i++){
            atlist[i] = Integer.parseInt(st.nextToken());
        }

        twosolution(n, atlist);
    }

    private static void twosolution(int n, int[] atlist) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(atlist);
        int left = 0;
        int right = n-1;
        int first = atlist[left];
        int second = atlist[right];
        int minsum = Integer.MAX_VALUE;

        while(left < right){
            int sum = atlist[left] + atlist[right];
            if(Math.abs(sum) < Math.abs(minsum)){
                minsum = sum;
                first = atlist[left];
                second = atlist[right];
            }
            if(sum < 0){
                left++;
            }else if(sum > 0){
                right--;
            }else{
                break;
            }
        }
        bw.write(first+" "+second);
        bw.flush();
        bw.close();
    }
}
