public class MoveAllZeros {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 4, 8, 0, 5, 2};
        System.out.println("The given array is:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
      System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        System.out.println("The array after moving zeros to the end:");
        for (int s : arr) {
            System.out.print(s + " ");
        }
    }
}
