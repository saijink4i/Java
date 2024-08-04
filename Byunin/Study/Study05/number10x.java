package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class number10x {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        List<List<Long>> alist = new ArrayList<>();
        for(int i = 1; i <= h; i++){
            st=new StringTokenizer(br.readLine());
            List<Long> list = new ArrayList<>();
            for(int j = 1; j <= w; j++){
                list.add(Long.parseLong(st.nextToken()));
            }
            alist.add(list);
        }

        long min = Long.MAX_VALUE;

        for(int i = 1; i <= h; i++){ //좌표 i
            for(int j = 1; j <= w; j++){ // 좌표 j
                for(int k = 1; k <= h; k++){ //좌표 i'
                    for(int l = 1; l <= w; l++){ //좌표 j'
                        if(i != k || j != l){//에라모르겠다 좌표를 전부 집어넣어 버리기~ 대신 좌표에서 x나 y값만 다르면 됨~
                            long cost = alist.get(i).get(j)+alist.get(k).get(l)+c*(Math.abs(i-k)+Math.abs(j-l));
                            min = Math.min(min, cost);
                        }
                    }
                }
            }
        }

        System.out.println(min);



    }
}
