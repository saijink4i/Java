package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 *  결과 : 정답
 */

public class Test09 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        List<List<Integer>> totalListTemp = generatePermutations(number);
        Integer[][] totalList = new Integer[totalListTemp.size()][];

        for(int i=0 ; i<totalList.length ; i++){
            totalList[i] = totalListTemp.get(i).toArray(new Integer[number]);
        }

        quickSort(totalList, 0, totalList.length-1);

        Integer numberP[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        
        Integer numberQ[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        int p = Integer.MIN_VALUE;
        int q = Integer.MIN_VALUE;
        for(int i=0 ; i<totalList.length ; i++){
            if(equals(numberP, totalList[i]))
                p = i+1;

            if(equals(numberQ, totalList[i]))
                q = i+1;

            if(p != Integer.MIN_VALUE && q != Integer.MIN_VALUE)
                break;
        }

        System.out.println(Math.abs(p - q));
    }

    // 완전 탐색 알고리즘으로 모든 경우의수의 리스트를 반환함
    public static List<List<Integer>> generatePermutations(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            current.add(i);
        }
        backtrack(result, current, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int start) {
        if (start == current.size()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < current.size(); i++) {
            swap(current, start, i);
            backtrack(result, current, start + 1);
            swap(current, start, i); // 백트래킹
        }
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void quickSort(Integer[][] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    
    private static int partition(Integer[][] arr, int low, int high) {
        Integer[] pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (compareTo(arr[j], pivot) <= 0) {
                i++;
                
                Integer[] temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        Integer[] temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    private static int compareTo(Integer[] arrA, Integer[] arrB) {
        for(int i=0 ; i<arrA.length; i++) {
            if(arrA[i] == arrB[i]) {
                continue;
            }else if(arrA[i] > arrB[i]) {
                return 1;
            }else{
                return -1;
            }
        }
        return 0;
    }

    public static boolean equals(Integer[] arrA, Integer[] arrB) {
        for(int i=0 ; i<arrA.length; i++) {
            if(arrA[i] != arrB[i])
                return false;
        }
        return true;
    }
}
