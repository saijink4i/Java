package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(countABC(n, s));
    }
    public static int countABC(int n, String s) {
        int count = 0;
        int length = n-2; //ABC문자열을 이루기 위해선 최소 3의 길이가 필요하므로 n-2까지 검색
        char[] chars = s.toCharArray();
        for(int i = 0; i < length; i++) { //s.charat(i)를 이용해도 되나 문자배열로 바꾼 뒤 검색하는게 속도가 더 빠르다.
            if(chars[i]=='A'&&chars[i+1]=='B'&&chars[i+2]=='C') {//근데 왜 테스트하면 이게 더 빠름? 테스트케이스가 적어서 그런가
                count++;
            }
        }
        return count;
    }
}
