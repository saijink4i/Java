package Inhoe.Paiza.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C069 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 오늘 날짜를 입력받음
        String dateText[] = br.readLine().trim().split(" ");
        int todayYear = Integer.parseInt(dateText[0]);
        int todayMonth = Integer.parseInt(dateText[1]);
        int todayDate = Integer.parseInt(dateText[2]);

        // 다음 축제 달과 일을 입력받음
        String festval[] = br.readLine().trim().split(" ");
        int festivalYear = Integer.parseInt(dateText[0]);
        int festivalMonth = Integer.parseInt(festval[0]);
        int festivalDate = Integer.parseInt(festval[1]);

        // 다음 축제 년을 계산
        while (true) {
            festivalYear++;
            if(festivalYear % 4 == 1)
                break;
        }

        int totalSum = 0;
        for(int i=todayYear ; i<=festivalYear ; i++){
            // 축제가 있는 해의 처리
            if(i == Integer.parseInt(dateText[0])){
                // 이번달 남은 일수를 더함
                if(todayMonth%2==0)
                    totalSum += 15 - todayDate;
                else 
                    totalSum += 13 - todayDate;
                
                // 축제가 있는 해의 다음달부터의 남은 일수를 더함
                for(int j = todayMonth+1 ; j <= 13 ; j++){
                    if(j%2==0)
                        totalSum += 15;
                    else 
                        totalSum += 13;
                }
            // 축제가 없는 해의 모든 일수를 더함
            }else if(i != festivalYear){
                for(int j = 1 ; j <= 13 ; j++){
                    if(j%2==0)
                        totalSum += 15;
                    else 
                        totalSum += 13;
                }
            // 축제가 있는 해의 처리
            }else {
                // 축제가 있는 달의 전까지의 일을 전부 더함
                for(int j = 1 ; j < festivalMonth ; j++){
                    if(j%2==0)
                        totalSum += 15;
                    else 
                        totalSum += 13;
                }
                // 축제가 있는 달의 일을 더함
                totalSum += festivalDate;
            }
        }
        System.out.println(totalSum);
    }
}
