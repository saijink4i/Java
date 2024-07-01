package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 산 갯수(N)를 입력받음
        int number = Integer.parseInt(br.readLine().trim());

        // 산의 높이들을 입력받음
        String mountains[] = br.readLine().split(" ");

        // 첫번째 산을 입력받음
        int max = Integer.parseInt(mountains[0]);
        int count = 1;
        for(int i = 1; i < number; i++) {
            // 두번째 산부터 높이를 비교하고 같거나 높을경우 카운트
            int mountain = Integer.parseInt(mountains[i]);
            if(max <= mountain){
                max = mountain;
                count++;
            }
        }

        System.out.println(count);
    }
}
