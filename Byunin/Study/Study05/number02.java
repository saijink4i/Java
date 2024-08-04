package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> colorlist = new ArrayList<Integer>();
        while (st.hasMoreTokens()) {
            colorlist.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(ColorfulCandies(n, k ,colorlist));

    }
    public static int ColorfulCandies(int n, int k, List<Integer> colorlist) {
        int colorMax = 0; //제일 많이 뽑힌 사탕 색의 수
        int colorCr = 0; //현재 뽑힌 사탕 색의 수
        Map<Integer, Integer> colorselection = new HashMap<>(); //map자료형을 이용해서 해당 색이 얼마나 있는지 확인가능
        for(int i = 0; i < n-k+1; i++) {
            if(i==0) {
                for(int j = 0 ; j < k ; j++) { //맨처음 뽑는 사탕 색의 종료와 수를 입력
                    colorselection.put(colorlist.get(j), colorselection.getOrDefault(colorlist.get(j), 0) + 1);
                    if (colorselection.get(colorlist.get(j)) == 1) {
                        colorCr++;
                    }
                    colorMax = colorCr;
                }
            }else{
                    colorselection.put(colorlist.get(i-1), colorselection.get(colorlist.get(i-1))-1); //i-1번째 색을 가진 사탕의 갯수 -1
                    if(colorselection.get(colorlist.get(i-1))==0){ //i-1번째 색이 더 이상 없다면 사탕 색의 수 - 1
                        colorCr--;
                    }
                    colorselection.put(colorlist.get(i+k-1), colorselection.getOrDefault(colorlist.get(i+k-1),0)+1);
                    if(colorselection.get(colorlist.get(i+k-1))==1){ //뽑은 사탕 중 가장 마지막 사탕의 색의 수 + 1
                        colorCr++;
                    }
                    colorMax = Math.max(colorCr, colorMax); //이전의 색의 종류보다 이번 색의 종류가 많다면 최댓값을 갱신
                }
            }

        return colorMax;

    }
}
