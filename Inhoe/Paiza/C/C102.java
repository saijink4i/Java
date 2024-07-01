package Inhoe.Paiza.C;

import java.util.Scanner;

public class C102 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        boolean temp = true;
        String[] month = new String[31];

        for(int i=0 ; i<month.length ; i++){
            month[i] = "";
        }

        for(int i=0 ; i<2 ; i++){
            String line = sc.nextLine();
            for(int j=0; j<Integer.parseInt(line) ; j++){
                String strtmp = sc.nextLine();
                if(i==0)
                    month[Integer.parseInt(strtmp)-1] += "A";
                else if(i==1)
                    month[Integer.parseInt(strtmp)-1] += "B";
            }
        } 

        for(int i=0 ; i<month.length ; i++){
            if(month[i].equals(""))
                month[i] = "x";
            else if(month[i].equals("AB")){
                if(temp){
                    month[i] = "A";
                    temp = false;
                }else {
                    month[i] = "B";
                    temp = true;
                } 
            }
            System.out.println(month[i]);
        }
    }
}
