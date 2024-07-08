package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 정답
 */

public class Test04 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 몬스터 체력과 필살기 종류를 입력받음
        String textList[] = br.readLine().split(" ");
        int monsterHP = Integer.parseInt(textList[0]);
        int skillNumber = Integer.parseInt(textList[1]);

        // 스킬의 데미지만큼 몬스터의 체력 감소
        textList = br.readLine().split(" ");
        for(String skill : textList){
            monsterHP -= Integer.parseInt(skill);

            if(monsterHP <= 0)
                break;
        }

        // 몬스터의 체력이 남아있을경우 No, 그렇지 않으면 Yes
        if(monsterHP > 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
