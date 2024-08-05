package Byunin.Study.Study06;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];//입력받을 정수배열
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //quicksort(arr);
        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }
    /*private static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length-1);
    }

    private static void quicksort(int[] arr, int start, int end) {
        if(start >= end) return;

        int pivot = start;
        int lo = start+1, hi = end;

        while(lo <= hi){
            while(lo <= end && arr[lo] <= arr[pivot]){
                lo++;
            }
            while(hi > start && arr[hi] >= arr[pivot]){
                hi--;
            }
            if(lo>hi){
                swap(arr, hi, pivot);
            }else{
                swap(arr, lo, hi);
            }
        }
        quicksort(arr, start, hi-1);
        quicksort(arr, hi+1, end);
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/
}
