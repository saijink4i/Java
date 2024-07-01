package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 포인트 몇개 받을지 입력받음
        int number = Integer.parseInt(br.readLine());
        
        // 베이스 기온 T와 목표 기온 A을 입력받음
        String textList[] = br.readLine().split(" ");
        Double t = Double.parseDouble(textList[0]);
        Double a = Double.parseDouble(textList[1]);

        // 고도 리스트를 입력받음
        textList = br.readLine().split(" ");

        // 고도별 평균 기온을 계산함
        Double temperatureList[] =  new Double[number];
        for(int i = 0; i < textList.length ; i++){
            Double temp = Double.parseDouble(textList[i]);
            temperatureList[i] = t - temp * 0.006;
        }

        // 목표 기온과 근사값 계산
        double min = Double.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < temperatureList.length ; i++){
            if(min > Math.abs(a-temperatureList[i])){
                min = Math.abs(a-temperatureList[i]);
                index = i;
            }
        }

        System.out.println(index+1);
    }
}
