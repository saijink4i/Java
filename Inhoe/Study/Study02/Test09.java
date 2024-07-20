package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  정답 판정 : X
 */

public class Test09 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 용사의 수(N)를 입력받음
        int peaple = Integer.parseInt(br.readLine());
        String cityList[] = br.readLine().trim().split(" ");
        String heroPowerList[] = br.readLine().trim().split(" ");

        Long sum = 0L;
        for(int i=peaple-1 ; i >= 0 ; i--){
            int heroPower = Integer.parseInt(heroPowerList[i]);
            int monster = Integer.parseInt(cityList[i+1]);

            if(heroPower >= monster){
                sum += monster;
                heroPower -= monster;
                monster = 0;
                // System.out.println("["+ i + "] heroPower : " + heroPower + ", monster : " + monster);
            }else{
                monster -= heroPower;
                sum += heroPower;
                heroPower = 0;
                // System.out.println("["+ i + "] heroPower : " + heroPower + ", monster : " + monster);
            }

            monster = Integer.parseInt(cityList[i]);
            // System.out.println("["+ i + "] heroPower : " + heroPower + ", monster : " + monster);
            if(heroPower >= monster){
                sum += monster;
                heroPower -= monster;
                monster = 0;
                // System.out.println("["+ i + "] heroPower : " + heroPower + ", monster : " + monster);
            }else{
                monster -= heroPower;
                cityList[i] = Integer.toString(monster);
                sum += heroPower;
                heroPower = 0;
                // System.out.println("["+ i + "] heroPower : " + heroPower + ", monster : " + monster);
            }
        }

        System.out.println(sum);
    }
}
