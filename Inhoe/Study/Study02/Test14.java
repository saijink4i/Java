package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  정답 판정 : O
 */

public class Test14 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 큐브 리스트를 입력받음
        String text = br.readLine().trim();

        // 큐브를 문자열에서 리스트로 변경
        List<Integer> cubeList = new ArrayList<Integer>();
        for(int i = 0; i < text.length(); i++){
            cubeList.add(Integer.parseInt(text.charAt(i)+""));
        }

        
        int count = 0;
        for(int i = 0 ; i < cubeList.size()-1 ; i++){
            // i가 음수일경우 처리하지않음
            if(i<0)
                continue;

            // N번째와 N+1번째큐브를 비교하고 다를경우 삭제
            if(cubeList.get(i) != cubeList.get(i+1)){
                cubeList.remove(i+1);
                cubeList.remove(i);
                i-=2;
                count += 2;
            }
        }

        System.out.println(count);
    }
}
