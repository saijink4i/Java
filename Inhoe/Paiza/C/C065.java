package Inhoe.Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단서 갯수(N)을 입력받음
        int number = Integer.parseInt(br.readLine());
        // 약수 리스트를 선언
        List<Integer> divisorList = new ArrayList<Integer>();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < number; i++) {
            String textList[] = br.readLine().split(" ");
            // 이상 조건중에서 최대값으로 설정
            if(textList[0].equals(">")){
                if(min < Integer.parseInt(textList[1])){
                    min = Integer.parseInt(textList[1]);
                }
            // 이하 조건중에서 최솟값으로 설정
            }else if(textList[0].equals("<")){
                if(max > Integer.parseInt(textList[1])){
                    max = Integer.parseInt(textList[1]);
                }
            // 약수라면 약수리스트에 추가
            }else if(textList[0].equals("/")){
                divisorList.add(Integer.parseInt(textList[1]));
            }
        }

        int result = 0;
        for(int i = min+1 ; i < max ; i++) {
            boolean temp = true;
            // 모든 약수 조건에 참일경우에 반복문 빠져나옴
            for(int j=0 ; j<divisorList.size() ; j++) {
                if(i%divisorList.get(j) != 0)
                    temp = false;
            }

            if(temp){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
