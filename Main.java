import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 레시피 갯수
        int recipeNumber = Integer.parseInt(br.readLine());
        // 레시피를 보존
        Map<String, Integer> recipeMap = new HashMap<String, Integer>();
        for(int i = 0; i < recipeNumber; i++){
            String temp[] = br.readLine().split(" ");
            recipeMap.put(temp[0], Integer.parseInt(temp[1]));
        }

        int itemNumber = Integer.parseInt(br.readLine());
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < itemNumber; i++){
            // 가지고 있는 아이템
            String item[] = br.readLine().split(" ");
            // 레시피에 없는 아이템은 스킵
            if(!recipeMap.containsKey(item[0])){
                continue;
            // 레시피에 있는 아이템은 레시피와 비교해서 몇개 만들수있는지 최솟값을 결과값으로 보존
            }else {
                int temp = Integer.parseInt(item[1])/recipeMap.get(item[0]);
                if(result > temp)
                    result = temp;
            }
        }
        // 만약 레시피에 있는 재료가 하나도 없었을경우
        if(result == Integer.MAX_VALUE)
            result = 0;
            
        System.out.println(result);
    }
}
