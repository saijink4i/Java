package Byunin.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] monster = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            monster[i] = Long.parseLong(st.nextToken());
        }
        long[] savers = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            savers[i] = Long.parseLong(st.nextToken());
        }

        System.out.println(CitySavers(n, monster, savers));

    }
    public static long CitySavers(int n, long[] monster, long[] savers) {
        long total = 0; //몬스터를 잡은 최대치
        for(int i = 0; i < n; i++) {
            if(monster[i]+monster[i+1]<=savers[i]){ //n마을의 몬스터 수와 n+1마을의 몬스터 수의 합이 용사가 잡을 수 있는 몬스터의 수보다
                total += monster[i]+monster[i+1]; // 작거나 같으면 n+1마을의 몬스터는 남아있지 않으므로 n+1 마을에 몬스터 수를 0으로 집어넣는다.
                monster[i+1] = 0;
            }else{ //몬스터 수의 합이 용사가 잡을 수 있는 몬스터의 수보다 많다면 n+1마을은 몬스터가 남게된다.
                total += savers[i]; // 만약 n마을의 몬스터 수가 용사가 잡을 수 있는 몬스터 수보다 적다면 n+1마을의 몬스터까지 잡을 수 있으므로
                if(monster[i]<savers[i]){ //양쪽 마을의 몬스터 수에서 용사가 잡을 수 있는 몬스터 수를 뺀 나머지 즉 남은 몬스터 수를 n+1마을에 집어넣는다.
                    monster[i+1] = monster[i] + monster[i+1] - savers[i];
                }
            }
        }
        return total;
    }
}
