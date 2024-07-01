package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test12 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수를 입력받음
        Long number = Long.parseLong(br.readLine());
        // 해당 정수의 약수 리스트를 구함
        List<Long> divisorList = divisor(number);

        // 약수들중 최소거리를 구함
        Long min = Long.MAX_VALUE;
        for(int i=0 ; i<divisorList.size() ; i++) {
            Long tempA = divisorList.get(i);
            Long tempB = number/tempA;
            if((tempA + tempB - 2) < min)
                min = tempA + tempB -2;
        }

        System.out.println(min);
    }

    // 정수를 입력하면 정수의 약수 리스트를 반환하는 함수
    public static List<Long> divisor(Long number){
        int sqrt = (int) Math.sqrt(number); // 100의 제곱근은 10
        ArrayList<Long> arr = new ArrayList<>(); // 약수 받을 ArrayList

        for(int i = 1; i <= sqrt; i++){
        if(number % i == 0){ // 약수 중 작은 수 저장
            arr.add(i + 0L);
                if(number / i != i){ // 약수 중 큰 수 저장
                    arr.add(number / i);
                }
            }
        }
        // Java 8 이후 사용 가능
        arr.sort(Comparator.naturalOrder());
        return arr;
    }
}
