package Byunin.Study.Study07;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); //테스트 케이스 개수
        for(int i = 0; i < t; i++){
            int[][] arr = new int[4][2]; //정사각형을 계산하기 위환 좌표
            for(int j = 0; j < 4; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            if(squarefind(arr)){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();

    }
    private static boolean squarefind(int[][] arr){
        double[] distance = new double[6];
        int index = 0;
        for(int i = 0; i < 3; i++){ //중복없이 각 좌표끼리의 거리만을 계한
            for(int j = i+1; j < 4; j++){
                distance[index] = Math.pow((arr[i][0]-arr[j][0]), 2)+Math.pow((arr[i][1]-arr[j][1]), 2);
                index++;
            }
        }
        Arrays.sort(distance); //같은 점이 2개 이상 존재한다면 좌표간의 거리가 0일수도 있으므로 오름차순 정렬해서 0이 있나없나 확인
        return distance[0]>0&&distance[0]==distance[1]&&distance[1]==distance[2]&&distance[2]==distance[3]&&distance[4]==distance[5];
        //대각선이 좌표간의 거리중 제일 크므로 4번째는 5번째 요소만 비교
    }
}
