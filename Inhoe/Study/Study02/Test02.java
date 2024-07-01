package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test02 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어를 몇개 받을지 입력받음
        int number = Integer.parseInt(br.readLine());
        String textList[] = new String[number];

        // 단어 리스트를 입력받음
        for (int i = 0; i < number; i++) {
            textList[i] = br.readLine();
        }

        // 중복 단어가 있는지 확인
        Set<String> lines = new HashSet<String>(Arrays.asList(textList));
        if(lines.size() != number){
            System.out.println("No");
            return;
        }

        // 전 단어와 지금 단어가 이어지는지 확인
        for(int i = 1; i < number; i++){
            if(textList[i-1].charAt(textList[i-1].length()-1) != textList[i].charAt(0)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
