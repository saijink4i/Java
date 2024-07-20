package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 *  결과 : 정답
 */

public class Test02 {
    static Set<String> hasExist;
    static Set<String> naver;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        hasExist = new HashSet<String>();
        naver = new HashSet<String>();
        
        // 입력받은 문자중 절대 없어야하는것과 절대 있어야하는 문자로 나눠서 저장
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'x')
                naver.add(Integer.toString(i));
            else if(text.charAt(i) == 'o')
                hasExist.add(Integer.toString(i));
        }

        // 0000부터 9999까지 함수호출
        int count = 0;
        for(int i=0 ; i<10000 ; i++){
            count += check(i);
        }

        System.out.println(count);
    }

    public static int check(int number) {

        // 입력받은 문자열을 4자리수 문자열로 변환
        String tempText;
        if(number < 10)
            tempText = "000" + number;
        else if(number < 100)
            tempText = "00" + number;
        else if(number < 1000)
            tempText = "0" + number;
        else
            tempText = "" + number;

        // 없어야하는 문자가 있는지 체크
        for(int i=0 ; i<tempText.length() ; i++){
            String temp = tempText.charAt(i) + "";
            if(naver.contains(temp))
                return 0;
        }

        // 있어야하는 문자가 없는지 체크
        for(String has : hasExist){
            if(tempText.indexOf(has) == -1)
                return 0;
        }

        // 모든 조건을 통과하면 1 반환
        return 1;
    }
}
