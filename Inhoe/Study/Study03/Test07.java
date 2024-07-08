package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *  결과 : 정답
 */

public class Test07 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String textList[];
        List<Integer> bingoList = new ArrayList<Integer>();
        Set<Integer> bingoSet = new HashSet<Integer>();

        for(int i = 0 ; i<3 ; i++) {
            textList = br.readLine().split(" ");
            for(int j = 0 ; j<textList.length ; j++) {
                bingoList.add(Integer.parseInt(textList[j]));
                bingoSet.add(Integer.parseInt(textList[j]));
            }
        }

        int number = Integer.parseInt(br.readLine());
        for(int i=0 ; i<number ; i++){
            int temp = Integer.parseInt(br.readLine());
            if(bingoSet.contains(temp)){
                bingoList.set(bingoList.indexOf(temp), 0);
                bingoSet.remove(temp);
            }
        }

        Boolean result = checkBingo(bingoList);
        if(result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static Boolean checkBingo(List<Integer> bingo) {
        if(bingo.get(0) == 0 && bingo.get(1) == 0 && bingo.get(2) == 0)
            return true;

        if(bingo.get(3) == 0 && bingo.get(4) == 0 && bingo.get(5) == 0)
            return true;

        if(bingo.get(6) == 0 && bingo.get(7) == 0 && bingo.get(8) == 0)
            return true;

        if(bingo.get(0) == 0 && bingo.get(3) == 0 && bingo.get(6) == 0)
            return true;

        if(bingo.get(1) == 0 && bingo.get(4) == 0 && bingo.get(7) == 0)
            return true;

        if(bingo.get(2) == 0 && bingo.get(5) == 0 && bingo.get(8) == 0)
            return true;

        if(bingo.get(0) == 0 && bingo.get(4) == 0 && bingo.get(8) == 0)
            return true;

        if(bingo.get(2) == 0 && bingo.get(4) == 0 && bingo.get(6) == 0)
            return true;

        return false;
    }
}
