package Byunin.Study.Study06;

import java.io.*;
import java.util.Arrays;

public class number15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); //테스트케이스의 갯수
        for(int i = 0; i < n; i++){
            int t = Integer.parseInt(br.readLine()); //해당 테스트케이스의 전화번호 갯수
            String[] tel = new String[t];
            for(int j = 0; j < t; j++){
                tel[j] = br.readLine(); //전화번호
            }
            if(phonenumberlist(t, tel)){
                bw.write(("YES\n"));
            }else{
                bw.write(("NO\n"));
            }
        }
        bw.flush();
        bw.close();
    }
    private static boolean phonenumberlist(int t, String[] tel){

        Arrays.sort(tel);

        for(int i = 0; i < t-1; i++){
            if(tel[i+1].startsWith(tel[i])){
                return false;
            }
        }
        return true;
    }
}
