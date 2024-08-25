package Byunin.Study.Study06;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        goodnumber(n, arr);

    }
    private static void goodnumber(int n, int[] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(arr);
        int good = 0;
        for(int i = 0; i < n; i++){
            int left = 0;
            int right = arr.length - 1;
            while(left < right){
                if(left == i){
                    left++; //서로다른 두 수중 하나가 기준이 되는 수와 같다면 다음 수로 넘기고 반복
                    continue;
                }
                if(right == i){ //이하동문
                    right--;
                    continue;
                }
                int sum = arr[left] + arr[right];
                if(sum == arr[i]){
                    good++;
                    break;
                }else if(sum > arr[i]){
                    right--;
                }else{
                    left++;
                }
            }
        }
        bw.write(String.valueOf(good));
        bw.flush();
        bw.close();
    }
}
