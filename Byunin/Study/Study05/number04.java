package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class number04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Integer> Alist = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            Alist.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> Blist = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            Blist.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(MinDiff(Alist, Blist));

    }
    public static int MinDiff(List<Integer> Alist, List<Integer> Blist){
        int min = Integer.MAX_VALUE;
        int i = 0; //a배열 인덱스
        int j = 0; //b배열 인덱스
        Collections.sort(Alist);
        Collections.sort(Blist);

        while(i < Alist.size() && j < Blist.size()){
            int diff = Math.abs(Alist.get(i) - Blist.get(j));
            min = Math.min(diff, min);

            if(Alist.get(i) < Blist.get(j)){ //오름차순으로 정렬했으므로 두 수를 비교해서 작은 쪽의 배열 다음 수를 가져와서 차이를 좁힌다.
                i++;
            } else{
                j++;
            }
        }

        return min;
    }
}
