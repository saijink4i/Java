package Inhoe.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/*
 *  결과 : 정답
 */

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력받음 N, 몇초 갖고있다 넘기는지, 처음 받는 보석 시간
        int number = Integer.parseInt(br.readLine());
        Long watasu[] = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).boxed().toArray(Long[]::new);
        Long firstTime[] = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).boxed().toArray(Long[]::new);

        // 첫번째 순회
        for(int i=1 ; i<number ; i++) {
            firstTime[i] = Math.min(firstTime[i], firstTime[i-1] + watasu[i-1]);
        }

        // 두번째 순회
        for(int i=0 ; i<number ; i++){
            int prev = (i - 1 + number) % number;
            firstTime[i] = Math.min(firstTime[i], firstTime[prev] + watasu[prev]);
        }

        // 결과 출력
        for(int i = 0 ; i<number ; i++){
            System.out.println(firstTime[i]);
        }
    }
}
