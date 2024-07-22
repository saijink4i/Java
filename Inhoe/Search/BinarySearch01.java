package Inhoe.Search;

public class BinarySearch01 {
    /*
     * 2진 탐색
     *２分探索
     */
    public static void main(String[] args) {
        String text[] = "5,7,8,10,15,20,23,28,29,30,33,36,39,58,60,62,65,68,70,80,88,94,99".split(",");
        int numbers[] = new int[text.length];
        for(int i=0 ; i < text.length ; i++) {
            numbers[i] = Integer.parseInt(text[i]);
        }

        int target = 94;

        int result = binarySearch(numbers, target);

        if(result == -1)
            System.out.println("Failed to binary search");
        else
            System.out.println("Successfully : " + result + " index");
    }
    
    public static int binarySearch(int arr[], int target) {
        int mid;
        int left = 0;
        int right = arr.length - 1;

        do{
            mid = (left + right) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }while(left <= right);

        return -1;
    }
}
