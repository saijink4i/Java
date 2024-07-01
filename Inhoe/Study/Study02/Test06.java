package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 소스코드 갯수(N), 데이터 갯수(M), 정수(C)를 입력받음
        String texts[] = br.readLine().split(" ");
        int codeNumber = Integer.parseInt(texts[0]);
        int dataNumber = Integer.parseInt(texts[1]);
        int c = Integer.parseInt(texts[2]);

        // 정수 B1, B2, ..., BN을 입력받음
        String b[] = br.readLine().split(" ");

        int count = 0;
        for(int i=0 ; i<codeNumber ; i++) {
            // sum에 C를 미리 더함
            int sum = c;
            texts = br.readLine().split(" ");
            for(int j=0 ; j<dataNumber ; j++) {
                // A1B1, A2B2, ..., AMBM을 sum에 더함
                sum += Integer.parseInt(texts[j]) * Integer.parseInt(b[j]);
            }

            // 결과가 0 이상이면 카운트 +1
            if(sum > 0)
                count++;
        }

        System.out.println(count);
    }
}
