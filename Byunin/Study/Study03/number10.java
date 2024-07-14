package Byunin.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class number10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, status> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            String q = st.nextToken();

            status currentstatus = map.getOrDefault(p, new status());

            if(q.equals("AC")){
                if(!currentstatus.solved){
                    currentstatus.solved = true;
                }
            }else if(q.equals("WA")){
                if(!currentstatus.solved){
                    currentstatus.wrongcount++;
                }
            }

            map.put(p, currentstatus);
        }

        int answercount = 0;
        int penalty = 0;

        for(status totalstatus : map.values()){
            if(totalstatus.solved){
                answercount++;
                penalty += totalstatus.wrongcount;
            }
        }

        System.out.println(answercount + " " + penalty);
    }
    public static class status{
        boolean solved = false;
        int wrongcount = 0;
    }
}
