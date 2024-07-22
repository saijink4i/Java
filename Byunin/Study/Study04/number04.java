package Byunin.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        // 친구들의 위치와 제공할 돈을 저장할 map
        Map<Long, Long> friends = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            friends.put(a, friends.getOrDefault(a, 0L) + b);
        }

        // 친구들의 위치를 정렬
        List<Long> positions = new ArrayList<>(friends.keySet());
        Collections.sort(positions);

        long position = 0;
        long money = k;

        // 정렬된 친구들의 위치를 지나가며 돈을 모으고 이동
        for (Long friendPosition : positions) {
            long friendMoney = friends.get(friendPosition);

            // 현재 위치에서 친구의 위치까지 갈 수 있는지 확인
            if (position + money >= friendPosition) {
                money -= (friendPosition - position);
                position = friendPosition;
                money += friendMoney;
            } else {
                // 갈 수 없다면 현재 돈으로 갈 수 있는 만큼만 이동
                position += money;
                System.out.println(position);
                return;
            }
        }

        // 모든 친구를 만난 후 남은 돈으로 추가 이동
        position += money;

        System.out.println(position);
    }
}
