package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class number15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] harr = new int[n];
        for (int i = 0; i < n; i++) {
            harr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(listmade(harr));
    }
    public static int listmade(int[] harr) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < harr.length; i++) {
            list.add(harr[i]);
        }
        return grandgarden(list);
    }
    public static int grandgarden(LinkedList<Integer> list) {
        int[] temp = new int[list.length];

        for(int i = 0; i < list.size(); i++) {
            boolean complete = false;
            int end = 0;
            if(list.get(i)!=0){
                end = i;
            }
        }
    }
}
