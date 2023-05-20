public class SortArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 3, 4, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int index = 0;
                if (arr[i] > arr[j]) {
                    index = arr[i];
                    arr[i] = arr[j];
                    arr[j] = index;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
