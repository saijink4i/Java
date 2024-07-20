package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
 *  결과 : 정답
 */

public class Test01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        Integer sequence[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

        // 200으로 나눈 나머짓값이 몇개인지 담아둠
        long count = 0;
        for(int i=0 ; i<number ; i++) {
            numberMap.put(sequence[i]%200, numberMap.getOrDefault(sequence[i]%200, 0) + 1);
        }

        // 해당 값들을 하나씩 꺼내서 함수 호출
        Set<Integer> keys = numberMap.keySet();
        for (Integer key : keys) {
            count += cal(numberMap.get(key));
        }

        System.out.println(count);
    }

    // n개의 숫자의 조합은 (n-1)!개
    public static long cal(long number) {
        if(--number > 0)
            return number + cal(number);
        else
            return 0;
    }
}
