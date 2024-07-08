package Byunin.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class number10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        System.out.println(anagram(n, s));
    }
    public static int anagram(int n, String[] s) {
        int count = 0;
        stringsort(s);
        /*for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(s[i].equals(s[j])) {
                    count++;
                }
            }
        }*/
        return count;
    }
    public static void stringsort(String[] s) {
        for(int i = 0; i < s.length; i++){
            char[] chararr = s[i].toCharArray();
            //quickSort(chararr);
            //s[i] = Arrays.toString(chararr);
            Arrays.sort(chararr);
            s[i] = new String(chararr);
        }
    }
    //퀵정렬 이용해보려다 실패
    /*public static String quickSort(char[] chararr) {
        quickSort(chararr, 0, chararr.length-1);
        return Arrays.toString(chararr);
    }
    public static void quickSort(char[] chararr, int start, int end) {
        if(start >= end) return;

        int pivot = start;
        int lo = start + 1;
        int hi = end;

        while(lo < hi){
            while(lo < end && chararr[lo] >= chararr[pivot])
                lo++;
            while(hi > start && chararr[hi] <= chararr[pivot])
                hi--;
            if(lo > hi)
                swap(chararr, hi, pivot);
        }

        quickSort(chararr, start, hi-1);
        quickSort(chararr, hi+1, end);
    }
    public static void swap(char[] chararr, int i, int j) {
        char temp = chararr[i];
        chararr[i] = chararr[j];
        chararr[j] = temp;
    }*/
}
