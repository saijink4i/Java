package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(mountaininn(n, arr));
    }
    public static int mountaininn(int n, int[] arr){
        int count = 1; //첫번째는 무조건 바다가 보일 수 있으니 1시작
        int height = arr[0]; //기준
        for(int i = 1; i < n; i++){
            if(arr[i] >= height){
                count++;
                height = arr[i];
            }
        }
        return count;
    }
}
