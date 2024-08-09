package Byunin.Study.Study06;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class number05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //테스트 케이스 갯수
        int[] list = new int[t]; //테스트케이스를 저장할 리스트
        for(int i = 0; i < t; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        kaprekarcal(list);
    }

    private static void kaprekarcal(int[] list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < list.length; i++) {
            int number = list[i]; //카프카 연산 후 잠시 저장해 놓을 정수
            int index = 0; //6174가 나올 때까지 카프카연산을 돌린 횟수
            while(number != 6174) { //연산 후 6174가 안나왔다면 다시 돌린다
                List<Integer> arr = new ArrayList<>();//각 자릿수를 저장할 리스트
                StringBuilder bignumber = new StringBuilder(); //조합한 수 중 가장 큰 수
                StringBuilder smallnumber = new StringBuilder(); //조합한 수 중 가장 작은 수

                String numStr = String.format("%04d", number); //앞자리에 0이오면 numberformatexception이 발생. 그걸 위해 4자리 정수로 스트링에 집어넣음
                for(char c : numStr.toCharArray()) { //각 자릿수를 분해하여 리스트에 입력
                    arr.add(Character.getNumericValue(c));
                }
                arr.sort(Comparator.reverseOrder()); //내림차순으로 정렬하면 가장 큰 수
                for (Integer value : arr) {
                    bignumber.append(value);
                }
                arr.sort(Comparator.naturalOrder()); //오름차순으로 정렬하면 가장 작은 수
                for (Integer integer : arr) {
                    smallnumber.append(integer);
                }
                number = Integer.parseInt(bignumber.toString())-Integer.parseInt(smallnumber.toString());
                index++; //연산 후 인덱스 증가
            }
            bw.write(index+"\n");

        }
        bw.flush();
    }
}
