package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        long total = 0;

        for(int i = 0; i < n; i++){
            if(m <= 0)
                break;
            int price = arr[i][0];
            int number = arr[i][1];
            int need = Math.min(m, number);

            total += (long) need * price;
            m -= need;
        }

        System.out.println(total);

    }
}
