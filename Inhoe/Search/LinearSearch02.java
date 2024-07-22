package Inhoe.Search;

public class LinearSearch02 {
    /*
     * 선형 탐색 - 보초법
     * 線形探索 - 番兵法
     * 시간복잡도 : O(n)
     */
    public static void main(String[] args) {
        int n = 7;
        String text[] = "5,2,1,8,6,3,4".split(",");
        int numbers[] = new int[n+1];
        for(int i=0 ; i < n ; i++) {
            numbers[i] = Integer.parseInt(text[i]);
        }
        int search = 9;
        numbers[n] = search;
        System.out.println("Search Targets : " + search);
        
        int i = 0;
        while (true) {
            if(numbers[i] == search)
                break;
            i++;
        }
        
        if(i == n)
            System.out.println("There are no targets.");
        else
            System.out.println("There is a navigation target at number " + (i + 1));
    }
}
