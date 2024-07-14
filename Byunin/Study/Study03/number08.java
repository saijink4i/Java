//복습 요망
package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class number08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            set.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(typicalstairs(n, set));

    }
    public static int typicalstairs(int n, Set<Integer> set){

        if(n == 1){
            return set.contains(1) ? 0 : 1; //계단이 1개만 있는데 깨진경우 가짓수가 0이므로 0 반환
        }

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = set.contains(1) ? 0 : 1;

        for(int i=2;i<=n;i++){
            if(!set.contains(i)){ //깨지지 않았다면
                dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
            }
        }
        return dp[n];
    }
}
