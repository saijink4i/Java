package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class test08 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        int hight = Integer.parseInt(size[0]);
        
        List<List> map = new ArrayList<>();
        for(int i = 0; i < hight; i++) {
            map.add(createList(br.readLine().trim()));
        }

        for(int i = 0; i < map.size(); i++) {
            if(map.get(i).get(0).equals(".")){
                boolean check = true;
                for(int j=0 ; j < map.get(i).size() ; j++){
                    if(map.get(i).get(j).equals("#"))
                        check = false;
                }

                if(check){
                    map.remove(i);
                    i--;
                }
            }
        }

        for(int i = 0; i < map.get(0).size(); i++) {
            if(map.get(0).get(i).equals(".")){
                boolean check = true;
                for(int j=0 ; j < map.size() ; j++){
                    if(map.get(j).get(i).equals("#"))
                        check = false;
                }

                if(check){
                    for(int j=0 ; j < map.size() ; j++){
                        map.get(j).remove(i);
                    }
                    i--;
                }
            }
        }

        for(int i=0; i < map.size(); i++) {
            for(int j=0 ; j < map.get(0).size() ; j++){
                System.out.print(map.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static List<String> createList(String text) {
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < text.length() ; i++) {
            list.add("" + text.charAt(i));
        }

        return list;
    }
}
