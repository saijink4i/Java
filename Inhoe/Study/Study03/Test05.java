package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test05 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 서류 수와 서류 리스트를 입력받음
        int documentNumber = Integer.parseInt(br.readLine().trim());
        String documentList[] = br.readLine().split(" ");

        // 서류에 짝수중 3,5로 나뉘어지지 않는게 있는지 체크
        boolean result = false;
        for(String document : documentList) {
            int temp = Integer.parseInt(document);
            if(temp % 2 == 0 && !(temp % 3 == 0 || temp % 5 == 0)){
                result = true;
                break;
            }
        }

        // 처리값에 따라 결과 출력
        if(result)
            System.out.println("DENIED");
        else
            System.out.println("APPROVED");
    }
}
