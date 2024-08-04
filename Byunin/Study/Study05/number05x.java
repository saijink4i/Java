package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class number05x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        System.out.println(ReorderCards(h, w, lists));
    }

    public static List<Integer> ReorderCards(int h, int w, List<List<Integer>> lists) {
        List<Integer> list = new ArrayList<>();
        return list;
    }
}
