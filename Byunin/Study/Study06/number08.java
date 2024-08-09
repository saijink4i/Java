package Byunin.Study.Study06;

import java.io.*;
import java.util.*;

public class number08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        statistics(arr);
    }
    private static void statistics(int[] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(arr); //중앙값을 위해 미리 정렬
        int total = 0; //평균을 내기 위한 총합 변수
        for(int i : arr){
            total += i;
        }
        int average = Math.round((float)total / arr.length); //산술평균, float명시를 하지 않으면 음수에서 반올림이 제대로 되지 않음
        int middle = arr[(arr.length-1)/2]; //중앙값
        int mod; //최빈값
        int range = arr[arr.length-1]-arr[0]; //범위
        Map<Integer, Integer> map = new HashMap<>(); //최빈값을 구하기 위해 Map자료형을 사용
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); //최빈값을 구하기 위해 value값을 기준으로 내림차순 정렬
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < keyset.size() ; i++){
            if(!map.get(keyset.get(0)).equals(map.get(keyset.get(i)))){ //최빈값이 여러개 있는 경우를 확인
                break;
            }
            list.add(keyset.get(i));
        }
        if(list.size() == 1){//최빈값이 1개뿐일때
            mod = list.get(0);
        }else{
            Collections.sort(list); //최빈값이 2개이상이라면 key값으로 정렬. 그 후 두번째로 작은 수를 선택
            mod = list.get(1);
        }

        bw.write(average+"\n"+middle+"\n"+mod+"\n"+range+"\n");
        bw.flush();
        bw.close();
    }
}
