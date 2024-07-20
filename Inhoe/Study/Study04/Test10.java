package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  결과 : 오답
 */

public class Test10 {
    static int takahashiScore;
    static int aokiScore;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String text[] = br.readLine().split(" ");
        int hight = Integer.parseInt(text[0]);
        int width = Integer.parseInt(text[1]);

        String map[] = new String[hight];
        for(int i=0 ; i<hight ; i++) {
            map[i] = br.readLine();
        }

        int xPoint = 0, yPoint = 0;
        takahashiScore = 0;
        aokiScore = 0;
        boolean trun = true; // true는 타카하시군 턴, false는 아오키군 턴
        while (!(xPoint == hight-1 && yPoint == width-1)) {
            if(xPoint == hight-1) {
                check(trun, map[xPoint].charAt(yPoint+1));
                yPoint += 1;
            }else if((yPoint != width-1) && map[xPoint].charAt(yPoint+1) == '+') {
                check(trun, map[xPoint].charAt(yPoint+1));
                yPoint += 1;
            }else if(yPoint == width-1) {
                check(trun, map[xPoint+1].charAt(yPoint));
                xPoint += 1;
            }else if((xPoint != hight-1) && map[xPoint+1].charAt(yPoint) == '+'){
                check(trun, map[xPoint+1].charAt(yPoint));
                xPoint += 1;
            }else {
                check(trun, map[xPoint].charAt(yPoint+1));
                yPoint += 1;
            }
            System.out.println((trun ? "타카하시턴 " : "아오키턴" ) + ",x : " + xPoint + ",y : " + yPoint);
            System.out.println("타카하시 점수 : " + takahashiScore + ",아오키 점수 : " + aokiScore);
            trun = !trun;
        }

        System.out.println(takahashiScore > aokiScore ? "Takahashi" : takahashiScore < aokiScore ? "Aoki" : "Draw");
    }

    static void check(boolean trun, char mark) {
        if(trun){
            if(mark == '+')
                takahashiScore++;
            else
                takahashiScore--;
        }else {
            if(mark == '+')
                aokiScore++;
            else
                aokiScore--;
        }
    }
}
