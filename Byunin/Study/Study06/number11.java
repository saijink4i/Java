package Byunin.Study.Study06;

import java.io.*;
import java.util.*;

public class number11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<List<Integer>> jewel = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            jewel.add(list);
        }
        int[] begweight = new int[k];
        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            begweight[i] = Integer.parseInt(st.nextToken());
        }

        jewelthief(n, k, jewel, begweight);

    }

    private static void jewelthief(int n, int k, List<List<Integer>> jewel, int[] begweight) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        jewel.sort(Comparator.comparingInt(a -> a.get(0)));//2차원 배열 1번째 숫자(무게)를 이용해서 오름차순 정렬

        Arrays.sort(begweight);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //우선순위 큐를 이용. 내림차순으로 자동 정렬된다.
        long totalprice = 0; //보석 총합값
        int index = 0;
        for(int i = 0; i < k; i++){
            while(index<n && begweight[i] >= jewel.get(index).get(0)){
                pq.offer(jewel.get(index).get(1)); //일단 보석이 가방무게보다 작다면 그 가격을 우선순위 큐에 집어넣는다.
                index++;
            }
            if(!pq.isEmpty()){ //우선순위 큐. 즉 가방에 들어갈 수 있는 보석이 선택되었다면 우선순위 큐에 의해 가격은 내림차순 정렬되므로 가장 비싼 가격을 총합값에 더한다.
                totalprice += pq.poll();
            }

        }
        bw.write(String.valueOf(totalprice));
        bw.flush();
        bw.close();

    }
}
