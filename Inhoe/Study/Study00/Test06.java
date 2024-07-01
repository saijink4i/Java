package Inhoe.Study.Study00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test06 {
    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int number;
        List<Integer> cardList = new ArrayList();
        
        try {
            number = Integer.parseInt(br.readLine());
            String cards[] = br.readLine().split(" ");
            for(int i=0 ; i<number ; i++) {
                cardList.add(Integer.parseInt(cards[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(cardList, Collections.reverseOrder());

        int total = 0;
        int i=1;
        while (cardList.size()>0) {
            if(i%2==1){
                total += cardList.get(0);
                cardList.remove(0);
            }else {
                total -= cardList.get(0);
                cardList.remove(0);
            }
            i++;
        }

        System.out.println(total);
    }
}
