package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int vectorx = (y2 - y1) * -1;
        int vectory = (x2 - x1);
        int x3 = x2 + vectorx;
        int y3 = y2 + vectory;
        int x4 = x1 + vectorx;
        int y4 = y1 + vectory;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}