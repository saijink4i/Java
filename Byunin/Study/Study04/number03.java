package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class number03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(reader.readLine());

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            c.add(Integer.parseInt(st.nextToken()));
        }

        // B[C[j]]의 값을 카운트하기 위한 맵
        Map<Integer, Integer> bValueCount = new HashMap<>();

        // B[C[j]]의 값 카운트
        for (int j = 0; j < n; j++) {
            int index = c.get(j) - 1; //인덱스 조정
            if (index >= 0 && index < n) {
                int bValue = b.get(index);
                bValueCount.put(bValue, bValueCount.getOrDefault(bValue, 0) + 1);
            }
        }

        long totalCount = 0L;
        for (int i = 0; i < n; i++) {
            totalCount += bValueCount.getOrDefault(a.get(i), 0);
        }

        System.out.println(totalCount);
    }
}