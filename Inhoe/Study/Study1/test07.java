package Study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class test07 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i=3 ; i<=number ; i++) {
            if(i%2==0)
                continue;
            
            ArrayList<Integer> factorsList = factors(i);
            if(factorsList.size() == 8)
                count++;
        }

        System.out.println(count);
    }

    public static ArrayList<Integer> factors(int number) {
        int sqrt = (int) Math.sqrt(number); // 제곱근 구하기

        ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

        for(int i = 1; i <= sqrt; i++){
        if(number % i == 0){ // 약수 중 작은 수 저장
            arr.add(i);
                if(number / i != i){ // 약수 중 큰 수 저장
                    arr.add(number / i);
                }
            }
        }
        // Java 8 이후 사용 가능
        arr.sort(Comparator.naturalOrder());

        return arr;
    }

    // public static ArrayList<Integer> factors(int number) {
    //     ArrayList<Integer> arr = new ArrayList<>();

    //     for(int i = 1; i <= number; i++){
    //         if(number % i == 0){
    //             arr.add(i);
    //         }
    //     }

    //     return arr;
    // }
}
