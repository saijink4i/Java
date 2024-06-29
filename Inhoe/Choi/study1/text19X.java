package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class text19X {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] text = br.readLine().split(" ");
        int kenNumber = Integer.parseInt(text[0]);
        int cityNumber = Integer.parseInt(text[1]);

        String textList[][] = new String[cityNumber][];
        List<Integer>[] kenAllList = new ArrayList[kenNumber];
        for(int i=0 ; i<kenAllList.length ; i++){
            kenAllList[i] = new ArrayList<Integer>();
        }

        for(int i=0 ; i<cityNumber ; i++) {
            textList[i] = br.readLine().split(" ");

            // 현을 시티에 맞춰서 추가
            kenAllList[Integer.parseInt(textList[i][0])-1].add(Integer.parseInt(textList[i][1]));
        }

        // 현을 오름차순으로 정렬
        Map<String, String> cityMap = new HashMap<String, String>();
        for(List<Integer> kenList : kenAllList){
            Collections.sort(kenList);
            for(int i=0 ; i<kenList.size() ; i++) {
                cityMap.put(Integer.toString(kenList.get(i)), Integer.toString(i));
            }
        }

        // 받은 텍스트 순서대로 출력
        for(int i=0 ; i<textList.length ; i++) {
            String city = textList[i][0];
            String ken = textList[i][1];
            System.out.println(digit(city) + digit(cityMap.get(ken)));
        }
    }

    public static String digit(String number) {
        switch (number.length()) {
            case 6:
                return number;
            case 5:
                return "0" + number;
            case 4:
                return "00" + number;
            case 3:
                return "000" + number;
            case 2:
                return "0000" + number;
            case 1:
                return "00000" + number;
        }
        return "";
    }
}
