package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 *  결과 : 정답
 */
public class Test07 {
    static Set<String> textSet;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        textSet = new HashSet<String>();

        // S = 문자열, K = 몇번째인지 입력받음
        String temp[] = br.readLine().split(" ");
        char characterArr[] = temp[0].toCharArray();
        int number = Integer.parseInt(temp[1]);

        // 순열(permutation) 알고리즘
        perm(characterArr, 0, characterArr.length, characterArr.length);

        // 모든 문자열을 정렬
        List<String> textList = new ArrayList<String>(textSet);
        Collections.sort(textList);

        // 문자열중 K번째를 출력
        System.out.println(textList.get(number-1));
    }

    // 순열 알고리즘으로 모든 문자열을 출력함
    public static void perm(char[] arr, int depth, int n, int r) {
        if (depth == r) { // 한번의 depth가 k로 도달하면 사이클을 한번 돈거다.)
            textSet.add(new String(arr));
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, r);
            swap(arr, i, depth);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
