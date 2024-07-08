package Byunin.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class number05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            ArrayList<Integer> food = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                food.add(Integer.parseInt(st.nextToken()));
            }
            list.add(food);
        }

        System.out.println(favfood(list));


    }
    public static int favfood(ArrayList<ArrayList<Integer>> list) {
        int total = 0;

        for(int i=0;i<list.get(0).size();i++){
            int count = 0;
            for(int j=0;j<list.size();j++){
                for(int k=0;k<list.get(j).size();k++){
                    if(list.get(0).get(i).equals(list.get(j).get(k))){
                        count++;
                        break;
                    }
                }
            }
            if(count == list.size()){
                total++;
            }
        }
        return total;
    }
}
