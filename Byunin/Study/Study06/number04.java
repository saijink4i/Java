package Byunin.Study.Study06;

import java.io.*;
import java.util.StringTokenizer;

public class number04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //배열 인자 갯수
        int k = Integer.parseInt(st.nextToken()); //정렬하기 위한 교환 횟수
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n]; //입력받을 배열 인자들
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bubblesortprac(k, arr);
    }
    private static void bubblesortprac(int k, int[] arr) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 0; //몇 번 교환했는지 저장하기위한 인덱스
        for (int i = 0; i < arr.length - 1; i++) { //버블정렬
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    index++; //교환할때마다 횟수 증가
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    if(index == k) { //지정된 교환횟수에 도달하면 출력 후 종료
                        try {
                            bw.write(String.valueOf(arr[j])+" "+String.valueOf(arr[j+1]));
                            bw.flush();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        return;
                    }

                }
            }
        }
        try {
            bw.write(String.valueOf(-1));
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
