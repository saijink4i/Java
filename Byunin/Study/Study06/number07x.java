package Byunin.Study.Study06;

import java.io.*;
import java.util.*;

public class number07x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //회의 수
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st=new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<2;j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            lists.add(list);
        }

        bw.write(String.valueOf(MaxCouncilCheck(lists)));
        bw.flush();

    }
    private static int MaxCouncilCheck(List<List<Integer>> lists) {//종료 시간이 작을 수록 회의시간이 짧으므로 좀 더 많은 회의를 집어넣을 수 있다.
        lists.sort(Comparator.comparingInt(o -> o.get(1))); //회의 종료시간을 기준으로 오름차순 정렬
        int max = 1; //최대로 집어넣을 수 있는 회의 갯수, 첫 종료시간으로 초기화를 했으므로 1부터 시작
        int index = 1; //배열 순회를 위한 인덱스
        int endtime = lists.get(0).get(1); //회의 종료시간. 오름차순으로 정렬했으므로 첫 종료시간으로 초기화
        while(index<lists.size()){ //회의 마지막 시간까지 반복
            if(endtime<=lists.get(index).get(0)){ //이전 회의의 종료시간이 이후 회의의 시작시간보다 빠르거나 같다면
                endtime=lists.get(index).get(1); //이후 회의의 종료시간을 endtime에 저장
                max++; //회의 횟수 증가
            }
            if(endtime==lists.get(lists.size()-1).get(1)){
                break;
            }
            index++;
        }
        return max;
    }
}
