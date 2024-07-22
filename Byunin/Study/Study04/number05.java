//깊이탐색 알고리즘 이용해야할것 같은데...
package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] reach = new boolean[n+1][n+1]; //가능한 경로 모으기 위한 배열

        // a 도시에서 a도시로 이동했을 때 경로 즉 이동하지 않았을 때 경로
        for (int i = 1; i <= n; i++) {
            reach[i][i] = true;
        }

        // 직접 연결된 경로 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reach[a][b] = true;
        }

        // 플로이드-워셜 알고리즘
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (reach[i][k] && reach[k][j]) {
                        reach[i][j] = true;
                    }
                }
            }
        }

        // 도달 가능한 경로의 수 계산
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (reach[i][j]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}