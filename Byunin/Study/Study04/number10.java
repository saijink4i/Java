package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] board = new int[h][w];
        for(int i = 0; i < h; i++){
            String line = br.readLine();
            for(int j = 0; j < w; j++){
                if(line.charAt(j) == '+'){
                    board[i][j] = 1;
                }else{
                    board[i][j] = -1;
                }
            }
        }
    }
}
