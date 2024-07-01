package Inhoe.Paiza.C;

import java.util.Scanner;

public class C112 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int max = 0, min = 100;
        for(int i=0; i<Integer.parseInt(line) ; i++){
            String tmpStr = sc.nextLine();
            String[] temp = tmpStr.split(" ");
            int tmpInt = 24 - Integer.parseInt(temp[2]) + Integer.parseInt(temp[1]) + Integer.parseInt(temp[0]);
            if(max<tmpInt)
                max = tmpInt;
            if(min>tmpInt)
                min = tmpInt;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
