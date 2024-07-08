package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *  정답 판정 : O
 */

public class Test04 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초항 number을 입력받음
        int number = Integer.parseInt(br.readLine());

        // 수열 리스트를 만들고 초항을 넣음
        List<Double> numberList = new ArrayList<Double>();
        numberList.add(number + 0.0);

        // 초항 인덱스(겸 정답)을 담을 변수를 생성
        int index=1;
        while (true) {
            index++;
            // 수열의 전 항목을 불러옴
            Double temp = numberList.get(index-2);

            // 전항의 결과가 짝수면 절반, 홀수면 3배 더하기 1을 해서 수열에 추가
            if(temp % 2 == 0)
                temp = (temp+0.0)/2;
            else
                temp = temp * 3.0 + 1;
            numberList.add(temp);

            // 중복된 값이 있는지 확인
            Set<Double> tempList = new HashSet<Double>(numberList);
            if(numberList.size() != tempList.size())
                break;
        }

        System.out.println(index);
    }
}
