package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/*
 *  결과 : 오답
 */

public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String temp[] = br.readLine().split(" ");
        int totalNumber = Integer.parseInt(temp[0]);
        int selectNumber = Integer.parseInt(temp[1]);
        
        // 사탕리스트를 배열로 받음
        Long arrA[] = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).boxed().toArray(Long[]::new);

        int result = findMaxSumSubarray(arrA, selectNumber);
        System.out.println(result);
    }

    public static int findMaxSumSubarray(Long[] arr, int k) {
        Set<Long> numberSet = new HashSet<Long>();

        int maxSum = 0;
        int startIndex = 1;

        // 슬라이딩 윈도우 체크
        for (int i = 0; i <= arr.length-k; i++) {
            numberSet = new HashSet<Long>(Arrays.asList(Arrays.copyOfRange(arr, i, i+k)));
            // System.out.println(numberSet);
            if (numberSet.size() >= maxSum) {
                maxSum = numberSet.size();
                startIndex = i+1;
            }
        }

        // 최대 종류를 가진 인덱스 반환
        return startIndex;
    }
}
