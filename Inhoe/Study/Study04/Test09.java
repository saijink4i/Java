package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/*
 *  결과 : 오답
 */

public class Test09 {
    static Map<Integer, List<Integer>> mapB;
    static List<Integer> listB;
    static List<Integer> listC;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mapB = new HashMap<Integer, List<Integer>>();

        int number = Integer.parseInt(br.readLine());
        int a[] = new int[number];
        boolean[] visited = new boolean[number];

        Integer sequenceA[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        
        for (int i = 1; i <= a.length; i++) {
            // System.out.println("\n" + a.length + " 개 중에서 " + i + " 개 뽑기");
            combination(sequenceA, visited, 0, a.length, i);
        }

        if(listC == null){
            System.out.println("No");
        }else {
            System.out.println("Yes");
            System.out.print(listB.size() + " ");
            for(int i=0 ; i<listB.size() ; i++){
                if(i == listB.size()-1)
                    System.out.print(listB.get(i)+1);
                else
                    System.out.print((listB.get(i)+1) + " ");
            }
            System.out.println();

            System.out.print(listC.size() + " ");
            for(int i=0 ; i<listC.size() ; i++){
                if(i == listC.size()-1)
                    System.out.print(listC.get(i)+1);
                else
                    System.out.print((listC.get(i)+1) + " ");
            }
        }
    }
    
    static void combination(Integer[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) { //r개 선택 완료
            print(arr, visited, n); //출력 함수 맨 아래 합친 코드에서 확인해 주세요.
            return;
        } 
    
        for(int i=start; i<n; i++) {
            visited[i] = true; // 선택한 원소
            //선택한 원소의 다음 원소부터 선택하기 때문에(이미 선택한 원소는 선택하면 안되기 때문) i는 1씩 증가하고 r은 선택할 원소의 갯수가 줄어들기 때문에 1씩 감소한다.
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false; //다음 for문 전에 선택 원소 초기화
        }
    }
    
    // 배열 출력
    static void print(Integer[] arr, boolean[] visited, int n) {
        Long result = 0L;
        List<Integer> arrSet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                result += arr[i];
                arrSet.add(i);
            }
        }
        result %= 200;
        if(!mapB.containsKey(result.intValue())){
            mapB.put(result.intValue(), arrSet);
        }else {
            listB = mapB.get(result.intValue());
            listC = arrSet;
        }
    }
}
