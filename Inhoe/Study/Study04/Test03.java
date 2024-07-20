package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 *  결과 : 정답
 */

public class Test03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        // String을 Stream을 이용하여 List<Integer>로 변환
        // List<Integer> sequenceA = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        // Ai의 값과 그 값이 몇번 나오는지 Map으로 저장
        Map<Integer, Integer> sequenceA = new HashMap<Integer, Integer>();
        String tempText[] = br.readLine().split(" ");
        for(int i=0 ; i<number ; i++) {
            sequenceA.put(Integer.parseInt(tempText[i]), sequenceA.getOrDefault(Integer.parseInt(tempText[i]), 0)+1);
        }
        
        // Bi의 값과 해당 값의 index List를 Map으로 저장
        Map<Integer, List<Integer>> sequenceB = new HashMap<Integer, List<Integer>>();
        tempText = br.readLine().split(" ");
        for(int i=0 ; i<number ; i++) {
            List<Integer> temp = sequenceB.getOrDefault(Integer.parseInt(tempText[i]), new ArrayList<>());
            temp.add(i+1);
            sequenceB.put(Integer.parseInt(tempText[i]), temp);
        }

        // Ci의 값과 그 값이 몇번 나오는지 Map으로 저장
        Map<Integer, Integer> sequenceC = new HashMap<Integer, Integer>();
        tempText = br.readLine().split(" ");
        for(int i=0 ; i<number ; i++) {
            sequenceC.put(Integer.parseInt(tempText[i]), sequenceC.getOrDefault(Integer.parseInt(tempText[i]), 0) + 1);
        }
        // System.out.println(sequenceC);

        Long count = 0L;
        Set<Integer> aKeys = sequenceA.keySet();
        // Ai의 키값으로 탐색 시작
        for(Integer aKey : aKeys) {
            // Bi에 Ai값이 없으면 스킵
            if(!sequenceB.containsKey(aKey))
                continue;

            // Ai=Bi인 값의 Bi 인덱스 리스트를 호출
            List<Integer> keys = sequenceB.get(aKey);
            // System.out.println(keys);

            // Bi의 인덱스 리스트 = Ci인 값을 호출해서 해당하는 갯수 * 같은 Ai 갯수를 count에 덧셈
            for(Integer key : keys){
                if(sequenceC.containsKey(key))
                    count += sequenceC.get(key)*sequenceA.get(aKey);
            }
        }

        System.out.println(count);
    }
}
