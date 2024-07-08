package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  정답 판정 : O
 */

public class Test13 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 마을 갯수를 입력받음
        int number = Integer.parseInt(br.readLine());
        String[] arr = new String[number];
        List<Integer> xPointList = new ArrayList<Integer>();
        List<Integer> yPointList = new ArrayList<Integer>();
        
        // x좌표, y좌표, 마을 번호 리스트를 입력받음
        for(int i = 0; i < number; i++) {
            String tempText[] = br.readLine().split(" ");
            xPointList.add(Integer.parseInt(tempText[0]));
            yPointList.add(Integer.parseInt(tempText[1]));
            arr[i] = Integer.toString(i);
        }


        double total = 0;
        // 경로 리스트를 입력받음
        List<List<String>> allPermutations = generatePermutations(arr);
        for (List<String> permutation : allPermutations) {
            double sum = 0;
            // 경로에서 n-1번째 마을과 n번째 마을 사이의 거리를 더함
            for(int i=1 ; i<permutation.size() ; i++) {
                int x1 = xPointList.get(Integer.parseInt(permutation.get(i-1)));
                int y1 = yPointList.get(Integer.parseInt(permutation.get(i-1)));
                int x2 = xPointList.get(Integer.parseInt(permutation.get(i)));
                int y2 = yPointList.get(Integer.parseInt(permutation.get(i)));
                double temp = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                sum += temp;
            }
            total += sum;
        }
        
        // 모든 경로의 합산에 경로만큼을 나눔
        System.out.println(total/allPermutations.size());
    }

    // 완전 탐색 알고리즘으로 모든 경우의수의 리스트를 반환함
    public static List<List<String>> generatePermutations(String[] points) {
        List<List<String>> results = new ArrayList<>();
        // 탐색해야할 배열과, 시작 지점, 반환할 리스트
        permute(points, 0, results);
        return results;
    }
    
    private static void permute(String[] points, int start, List<List<String>> results) {
        // 시작지점이 탐색해야할 리스트보다 크다면
        if (start >= points.length) {
            List<String> permutation = new ArrayList<>();
            // 각 포인트를 추가함
            for (String point : points) {
                permutation.add(point);
            }
            results.add(permutation);
            return;
        }
        
        // 남은 경로는 셔플하고 재귀함수를 호출
        for (int i = start; i < points.length; i++) {
            swap(points, start, i);
            permute(points, start + 1, results);
            swap(points, start, i); // 백트래킹 <- 이거 검색해봐야함(잘 모르겠음)
        }
    }
    
    // 남은 경로 셔플
    private static void swap(String[] points, int i, int j) {
        String temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }
}
