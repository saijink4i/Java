package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/*
 *  정답 판정 : O
 */

public class Test15 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가든 갯수(N)를 입력받음
        int number = Integer.parseInt(br.readLine());
        // 가든 목표 높이를 입력받음
        Integer textList[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        // 목표가 0인 가든을 미리 Set에 추가해둠
        Set<Integer> indexSet = new HashSet<Integer>();
        for(int i = 0; i < textList.length ; i++){
            if(textList[i] == 0)
                indexSet.add(i);
        }

        int min = Integer.MAX_VALUE;
        int index = -1;
        int count = 0;
        // 모든 가든이 목표와 일치하면 빠져나감
        while (indexSet.size() != number) {
            index++;
            // 만약 index가 가든 범위를 벗어나면 0으로 리셋
            if(index >= number)
                index = 0;

            // 해당 가든이 이미 목표달성한 가든이면 생략
            if(indexSet.contains(index))
                continue;

            // 시작 지점 설정
            min = index;
            // 마지막 지점 설정
            for(int j=index+1 ; j<number ; j++){
                if(textList[j] == 0){
                    index = j-1;
                    break;
                }

                if(j==number-1&&textList[j] != 0){
                    index = j;
                }
            }

            // 시작 지점부터 마지막 지점까지 전부 -1 하고 0이되면 완성한 가든 리스트에 추가
            for(int j=min ; j<=index ; j++){
                textList[j]--;
                if(textList[j] == 0)
                    indexSet.add(j);
            }

            // 물준 행위를 카운트
            count++;
        }
        System.out.println(count);
    }
}
