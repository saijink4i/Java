package Byunin.Study.Study06;

import java.io.*;
import java.util.*;

public class number09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> numberlist = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            numberlist.put(num, numberlist.getOrDefault(num, 0) + 1);
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> Wantnumber = new ArrayList<>();
        for(int i = 0; i < m; i++){
            Wantnumber.add(Integer.parseInt(st.nextToken()));
        }

        findnumber(numberlist, Wantnumber);

    }
    private static void findnumber( Map<Integer, Integer> numberlist, List<Integer> Wantnumber) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer integer : Wantnumber) {
            if (numberlist.containsKey(integer)) {
                bw.write(numberlist.get(integer) + " ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
    }
}
