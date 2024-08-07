package Byunin.Study.Study06;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //팔린 티켓 매수
        st = new StringTokenizer(br.readLine());
        int[] tiketnumber = new int[n]; //팔린 티켓 번호
        for(int i = 0; i < n; i++){
            tiketnumber[i] = Integer.parseInt(st.nextToken());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(tiketfound(tiketnumber)));
        bw.flush();
    }

    private static int tiketfound(int[] tiketnumber) {
        Arrays.sort(tiketnumber);
        for(int i = 1; i <= tiketnumber.length; i++){
            if(tiketnumber[i-1] != i){
                return i;
            }
        }
        return tiketnumber[tiketnumber.length-1]+1;
    }
}
