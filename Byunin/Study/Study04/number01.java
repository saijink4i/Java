package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        for(int i = 0; i < n; i++)
            list[i] = Integer.parseInt(st.nextToken());

        int[] count = new int[200];

        long countP = 0;

        for (int i = 0; i < n; i++) {
            int k = list[i] % 200; //둘의 차가 200의 배수라는것은 각 숫자가 200을 나누었을 때 나머지 값이 같다는 뜻
            countP += count[k]; //나머지이론 참조
            count[k]++;
        }

        System.out.println(countP);
    }
}
