package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test11 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 아이템 갯수(N)를 입력받음
        int number = Integer.parseInt(br.readLine());
        // 아이템들의 가치를 입력받고 오름차순 정렬
        Integer itemValueList[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(itemValueList);

        // 조합된 아이템의 가격을 담아두는곳에 첫번째 아이템을 넣어둠
        double tempValue = itemValueList[0];
        for(int i=1 ; i<number ; i++) {
            tempValue = (itemValueList[i] + tempValue)/2;
        }
        
        System.out.println(tempValue);
    }
}
