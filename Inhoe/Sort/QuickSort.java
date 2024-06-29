package Sort;

public class QuickSort {

    // 메인 정렬 함수
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 배열을 분할하고 피벗의 인덱스를 가져옴
            int pi = partition(array, low, high);

            // 분할된 두 부분을 각각 재귀적으로 정렬
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // 분할 함수
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // 피벗으로 마지막 요소 선택
        int i = (low - 1); // 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같으면
            if (array[j] <= pivot) {
                i++;
                // 작은 요소를 피벗의 왼쪽으로 이동
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 피벗을 정확한 위치로 이동
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // 피벗의 인덱스 반환
    }

    // 테스트 코드
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("정렬 전 배열:");
        printArray(array);

        quickSort(array, 0, n - 1);

        System.out.println("정렬 후 배열:");
        printArray(array);
    }

    // 배열 출력 함수
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
