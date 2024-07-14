/*package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class number09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(br.readLine());
        }

        int[] current = new int[n];//수열을 만들면서 현재 수열을 저장하는 배열

        List<int[]> serial = new ArrayList<>();
        Makeserial(n, current, 0, serial);

        System.out.println(Math.abs(pnumber - qnumber)); //그 후 빼준다.

    }

    public static void Makeserial(int n, int[] current, int depth, List<int[]> serial) {
        if(depth == n) {
            serial.add(Arrays.copyOf(current, n));
            return ;
        }
        for(int i = 0; i<=n; i++) {
            if()
        }
    }
}

 */
