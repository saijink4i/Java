package Inhoe.Search;

public class LinearSearch01 {
    /*
     * 선형 탐색 - 순차 탐색
     * 線形探索 - 逐次探索
     */
    public static void main(String[] args) {
        int n = 7;
        String text[] = "5,2,1,8,6,3,4".split(",");
        int numbers[] = new int[n];
        for(int i=0 ; i < n ; i++) {
            numbers[i] = Integer.parseInt(text[i]);
        }
        int search = 8;
        System.out.println("Search Targets : " + search);
        
        int i = 0;
        while (true) {
            if(i == n)
                break;
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
