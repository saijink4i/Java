package Inhoe.Search;

import java.util.Arrays;

public class BinarySearch02 {
    /*
     * 2진 탐색
     * 2分探索
     * 시간복잡도 : O(log n)
     */
    public static void main(String[] args) {
        String text[] = "5,7,8,10,15,20,23,28,29,30,33,36,39,58,60,62,65,68,70,80,88,94,99".split(",");
        int numbers[] = new int[text.length];
        for(int i=0 ; i < text.length ; i++) {
            numbers[i] = Integer.parseInt(text[i]);
        }

        int target = 94;

        int result = Arrays.binarySearch(numbers, target);

        if(result >= 0)
            // Arrays.binarySearch에서는 검색실패했을경우, -위치 -1로 출력됨
            System.out.println("Failed to binary search");
        else
            System.out.println("Successfully : " + result + " index");
    }
}
