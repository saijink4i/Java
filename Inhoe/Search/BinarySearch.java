package Search;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int mid;
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            mid = (right + left) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
