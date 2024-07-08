package Inhoe.Study.Study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 *  정답 판정 : X
 */

public class Test01 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text[] = br.readLine().split(" ");
        int x1 = Integer.parseInt(text[0]);
        int y1 = Integer.parseInt(text[1]);
        int x2 = Integer.parseInt(text[2]);
        int y2 = Integer.parseInt(text[3]);

        // 점1과 점2를 지나는 직선의 기울기와 그 직선과 수직인 기울기를 구함
        double gradient1 = 0, gradient2 = 0;
        if(x2 - x1 != 0){
            // gradient1 = (double)(y2 - y1) / (double)(x2 - x1);
            int temp1 = y2 - y1;
            int temp2 = x2 - x1;
            gradient1 = BigDecimal.valueOf(temp1).divide(BigDecimal.valueOf(temp2), 7, RoundingMode.HALF_UP).doubleValue();

            gradient2= BigDecimal.valueOf(-1).multiply(BigDecimal.ONE.divide(BigDecimal.valueOf(gradient1), 7, RoundingMode.HALF_UP)).doubleValue();
        }


        // 점2, 점3을 지나는 직선 방적식 (gradient2) * x + number2 = y 에서 number2를 구함
        // double number2 = (-1) * gradient2 * x2 + y2;
        double number2 = BigDecimal.valueOf(-1).multiply(BigDecimal.valueOf(gradient2)).doubleValue() * x2 + y2;
        
        // System.out.println(gradient1 + "x + " + number2 + " = y");
        // System.out.println(gradient2);

        // 점1과 점2의 거리를 구함으로 정사각형의 변의 길이를 구함.
        double shape = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        // System.out.println(shape);

        // 점3의 좌표 초기화
        int x3 = x2;
        int y3 = 0;
        
        
        // 점3을 구함
        while (true) {
            // x3--;
            x3--;
            // x를 왼쪽에서부터 설정하여 점2, 점3을 지나는 직선 방정식을 이용하여 y의 값을 구함
            double tempY3 = (BigDecimal.valueOf(gradient2).multiply(BigDecimal.valueOf(x3)).doubleValue()+ number2);
            if(String.format("%.4f", tempY3).equals(String.format("%d.0000", (int)tempY3)))
                tempY3 = (int)tempY3;
            else if(String.format("%.7f", tempY3).equals(String.format("%d.9999999", (int)tempY3)))
                tempY3 = (int)tempY3+1;
            
            // System.out.println("x3 : " + x3 + ", y3 : " + tempY3);
            // 해당 점과 점2까지의 거리를 재서 정사각형의 변의 길이와 같은지 체크
            // if(Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(tempY3-y2, 2)) == shape){
            Double tempShape = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(tempY3-y2, 2));
            // System.out.println("길이 : " + tempShape + ", 길이2 : " + shape);
            if( tempShape.equals(shape) ){
                y3 = (int)tempY3;
                break;
            }
        }

        int x4 = x3 - (x2-x1);
        int y4 = y3 - (y2-y1);

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
