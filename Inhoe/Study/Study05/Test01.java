package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 *  결과 : 정답
 */

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        Integer arrC[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        // 주어진 수열을 정렬 
        // 정렬해야하는 이유는 각 위치에서 이전에 사용하지 않은 숫자중 가장 작은 숫자를 선택할 수 있게됨.
        // 그리고 선택 가능한 숫자의 개수를 쉽게 계산할 수 있게됨(i 위치에서 사용 가능한 숫자의 개수는 C[i]-i개수)
        Arrays.sort(arrC);

        Long result = arrC[0] + 0L;
        // 각 위치의 선택 가능한 숫자의 개수를 곱함.
        for(int i=1 ; i<number ; i++) {
            result = (result * (arrC[i]-i))%1000000007; 
        }

        System.out.println(result);
    }
}
