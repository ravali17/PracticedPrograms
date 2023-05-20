import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class ArrayRotation {
    public static void rotateArray(int arr[],int d) {

        int n = arr.length;


        int newArr[] = new int[d];
        for (int i = 0; i < d; i++) {
            newArr[i] = arr[i];

        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];

        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = newArr[i];

        }
    }
        public static void main(String args[]){
            int arr[] = {1, 2, 3, 4, 5, 6};
            int d = 2;
        System.out.println("original array"+ Arrays.toString(arr));
rotateArray(arr,d);
        System.out.println("new array"+Arrays.toString(arr));
    }
}
