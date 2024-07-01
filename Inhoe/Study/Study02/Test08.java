package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test08 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 보석 갯수(N)를 입력받음
        int number = Integer.parseInt(br.readLine());

        // 보석 가격 리스트를 입력받음
        String jewelryList[] = br.readLine().split(" ");
        // 코스트 리스트를 입력받음
        String costList[] = br.readLine().split(" ");

        int sum = 0;
        for(int i = 0; i < number; i++){
            int jewelry = Integer.parseInt(jewelryList[i]);
            int cost = Integer.parseInt(costList[i]);
            // 보석가격이 코스트보다 높으면 합계에 더함
            if(jewelry > cost)
                sum += jewelry - cost;
        }

        System.out.println(sum);
    }
}
