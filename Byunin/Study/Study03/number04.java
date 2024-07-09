package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum = 0; //너구리가 필살기를 모두 1번씩 썼을 때의 총합 값이 몬스터 체력보다 낮으면 못 잡는다.
        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(st.nextToken());
            if(sum>=h){ //입력받음과 동시에 필살기 데미지를 합치다가 데미지가 몬스터 체력을 넘는 순간 Yes를 출력하고 종료
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
