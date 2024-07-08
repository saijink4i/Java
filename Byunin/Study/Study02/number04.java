package Byunin.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class number04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>(); //수열의 크기가 정해져있지 않으므로 Arraylist로 받음
        list.add(s); //처음으로 입력받은 값을 수열의 첫번째에 집어넣음
        boolean flag = true; //반복문 탈출을 위한 변수
        int index = 1; //몇번째 값이 정답인지 체크하기 위한 인덱스
        while(flag){ //원하는 조건이 나올 때까지 반복
            if(list.get(index-1)%2==0) {
                list.add(list.get(index-1)/2);
            }else{
                list.add(3*list.get(index-1)+1);
            }
            for(int i=list.size()-2;i>=0;i--) { //수열에 집어넣은 값이 이전에 넣은 값과 동일한지 확인
                if(list.get(i).equals(list.get(index))){ //같은 값이 존재하면 반복문 탈출
                    flag = false;
                    break;
                }
            }
            index++; //같은 값이 존재하지 않으면 인덱스 값 증가시키고 다시 반복
        }
        System.out.println(index);
    }
}
