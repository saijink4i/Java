package Inhoe.Paiza.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C109 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int length = Integer.parseInt(sc.nextLine());
        Map<Integer, String> idList = new HashMap<>();
        List<Integer> nums = new ArrayList<>();

        for(int i=0 ; i<length ; i++){
            String temp = sc.nextLine();
            int num = 0;
            for(int j=0 ; j<temp.length() ; j++){
                if(temp.charAt(j)=='1'||temp.charAt(j)=='2'||temp.charAt(j)=='3'||temp.charAt(j)=='4'||temp.charAt(j)=='5'||temp.charAt(j)=='6'||temp.charAt(j)=='7'||temp.charAt(j)=='8'||temp.charAt(j)=='9'){
                    num = Integer.parseInt(temp.substring(j));
                    break;
                }
            }
            idList.put(num, temp);
            nums.add(num);;
        }

        Collections.sort(nums);
        
        for(int i=0 ; i<length ; i++){
            System.out.println(idList.get(nums.get(i)));
        }
    }
}
