package Inhoe.Study.Study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *  결과 : 정답
 */

public class Test11 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalNumber = Integer.parseInt(br.readLine().trim());
        String[] stringList = new String[totalNumber];
        Map<String, Integer> stringMap = new HashMap<String, Integer>();
        int max = 0;
        for(int i=0 ; i<totalNumber ; i++){
            stringList[i] = br.readLine().trim();
            if(stringMap.containsKey(stringList[i])){
                int count = stringMap.get(stringList[i]) + 1;
                stringMap.put(stringList[i], count);
                if(max < count)
                    max = count;
            }else {
                stringMap.put(stringList[i], 1);
                if(max == 0)
                    max = 1;
            }
        }

        List<String> manyWord = new ArrayList<String>();
        Set<String> keys = stringMap.keySet();
        for (String key : keys) {
            if(stringMap.get(key) == max)
                manyWord.add(key);
        }

        String[] manyWordArr = manyWord.toArray(new String[manyWord.size()]);
        quickSort(manyWordArr, 0, manyWordArr.length - 1);

        for(int i = 0 ; i<manyWordArr.length ; i++) {
            System.out.println(manyWordArr[i]);
        }
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    
    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}
