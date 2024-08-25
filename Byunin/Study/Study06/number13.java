package Byunin.Study.Study06;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class number13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());//강의 갯수

        int[][] arr = new int[n][2];    //강의 시간표
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        classroomassignmnet(n, arr);
    }
    private static void classroomassignmnet(int n, int[][] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(arr, (o1, o2)-> o1[0] - o2[0]); //첫번째 요소 즉 시작시간을 기준으로 정렬

        PriorityQueue<Integer> pq = new PriorityQueue<>(); //오름차순 우선순위 큐
        pq.add(arr[0][1]); //첫번째 수업 종료시간 집어넣기

        for(int i=1;i<n;i++){
            if(arr[i][0] >= pq.peek()){ //다음 수업시작시간이 이전 수업 종료시간보다 크거나 같다면 이전 수업종료시간을 빼버린다. 이렇게 함으로써 서로 엇갈리는 수업종료시간만 남는다.
                pq.poll();
            }
            pq.add(arr[i][1]);
        }
        bw.write(String.valueOf(pq.size()));
        bw.flush();
        bw.close();
    }
}
