package Byunin.Study.Study06;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class number10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> ranknum = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            ranknum.add(Integer.parseInt(br.readLine()));
        }

        ranksetting(ranknum);

    }

    private static void ranksetting(List<Integer> ranknum) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = (int)Math.round(ranknum.size()*0.15);
        int total = 0;
        float divdenum = 0; //반올림 제대로 작동하려면 float인수로 계산해야됨
        Collections.sort(ranknum);
        for(int i = size; i < ranknum.size()-size; i++){
            total += ranknum.get(i);
            divdenum += 1;
        }
        bw.write(String.valueOf(Math.round(total/divdenum)));
        bw.flush();
        bw.close();
    }
}
