package Byunin.Study.Study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //테스트 케이스 개수
        for(int i = 0; i < t; i++){
            int[] arr = new int[4]; //정사각형을 계산하기 위환 좌표
            for(int j = 0; j < 4; j++){
                arr[j] = Integer.parseInt(br.readLine());
            }
        }

    }
}
