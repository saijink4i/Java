package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  결과 : 정답
 */

public class Test04 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempText[] = br.readLine().split(" ");
        // 친구수와 처음 소지금을 입력받음
        int friends = Integer.parseInt(tempText[0]);
        Long money = Long.parseLong(tempText[1]);
        Map<Long, Long> friendsWallet = new HashMap<Long, Long>();

        // 친구 좌표 + 받을돈으로 Map 형태로 저장
        for(int i=0 ; i<friends ; i++) {
            tempText = br.readLine().split(" ");
            friendsWallet.put(Long.parseLong(tempText[0]), friendsWallet.getOrDefault(Long.parseLong(tempText[0]), 0L) + Long.parseLong(tempText[1]));
        }

        // 친구 좌표는 오름차순 정렬
        List<Long> friendsPoints = new ArrayList<Long>(friendsWallet.keySet());
        Collections.sort(friendsPoints);

        int i=0;
        // 결과와 지갑은 무한대의 값을 저장할수있는 BigInteger로
        BigInteger result = BigInteger.valueOf(0);
        BigInteger wallet = BigInteger.valueOf(money);
        Long temp = Long.MAX_VALUE;
        while (true) {
            // 남아있는 친구가 있고, 그 친구가 내가 도달할수 있는 범위에 있다면
            if(i < friendsPoints.size() && friendsPoints.get(i) <= (wallet.add(result)).longValue()){
                temp = friendsPoints.get(i);
                // 친구가 있는곳까지 도달
                result = result.add(BigInteger.valueOf(temp));
                // 지갑 - 이동거리 + 받은돈
                wallet = wallet.add(BigInteger.valueOf(friendsWallet.get(temp)-temp));
                // 다음 돈줄
                i++;
            // 남아있는 친구가 없거나, 도달할 수 있는 범위에 없다면
            }else{
                result = result.add(wallet);
                break;
            }
        }
        System.out.println(result);
    }
}
