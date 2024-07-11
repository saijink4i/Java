package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class number07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> matrix = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            List<Integer> row = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                row.add(Integer.parseInt(st.nextToken()));
            }
            matrix.add(row);
        }

        int n = Integer.parseInt(br.readLine());
        List<Integer> blist = new ArrayList<>();
        for(int i = 0; i < n; i++){
            blist.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(bingo(matrix, blist));
    }

    public static String bingo(List<List<Integer>> matrix, List<Integer> blist){
        boolean[][] check = new boolean[matrix.size()][matrix.get(0).size()]; //boolean 초기값 false
        boolean middlecheck = false;
        for(int i : blist){
            for(int j = 0; j < matrix.size(); j++){
                for(int k = 0; k < matrix.get(j).size(); k++){
                    if(matrix.get(j).get(k).equals(i)){
                        check[j][k] = true;
                        middlecheck = true;
                        break;
                    }
                }
                if(middlecheck){
                    middlecheck = false;
                    break;
                }
            }
        }
        for(int i = 0; i < check.length; i++){
            if(check[i][0]&&check[i][1]&&check[i][2]){
                return "Yes";
            }
            if(check[0][i]&&check[1][i]&&check[2][i]){
                return "Yes";
            }

        }
        if(check[0][0]&&check[1][1]&&check[2][2]){
            return "Yes";
        }
        if(check[0][2]&&check[1][1]&&check[2][0]){
            return "Yes";
        }
        return "No";
    }
}
