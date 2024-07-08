package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        if(shiritori(n,s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static boolean shiritori(int n, String[] s){
        for(int i = 1; i < n; i++){
            if(s[i-1].charAt(s[i-1].length()-1) != s[i].charAt(0)){
                return false;
            }
            for(int j = 0 ; j < i; j++){
                if(s[j].equals(s[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
