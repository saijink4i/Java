package Byunin.Study.Study05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class number06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> slist = new ArrayList<>();
        List<Integer> tlist = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            slist.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tlist.add(Integer.parseInt(st.nextToken()));
        }

        Distribution(n, slist, tlist);

    }

    public static void Distribution(int n, List<Integer> slist, List<Integer> tlist) {
        int[] dp = new int[n];

        dp[0] = tlist.get(0);
        for(int i = 1; i < n; i++) {
            dp[i] = Math.min(tlist.get(i), dp[i-1] + slist.get(i-1));

        }

        for(int i = 0; i < n; i++) {
            dp[i] = Math.min(dp[i], dp[(i+n-1)%n] + slist.get((i+n-1)%n));
            System.out.println(dp[i]);
        }
    }
}
