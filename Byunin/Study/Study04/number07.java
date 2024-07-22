package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class number07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Long> map = new HashMap<Integer, Long>();
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }

        long total = (long)n*(n-1)/2; //경우의 수

        long same = 0;
        for(long count : map.values()) {
            same += count * (count-1) / 2;
        }

        System.out.println(total-same);
    }
}
