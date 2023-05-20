//import java.util.Arrays;
//
public class RemoveElementArray {
//    public static int[] removeElement(int[] arr, int element) {
//        // Count the number of occurrences of the element
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == element) {
//                count++;
//            }
//        }
//
//        // Create a new array with size reduced by the count
//        int[] newArray = new int[arr.length - count];
//
//        // Copy elements from the original array to the new array, excluding the element to be removed
//        int newIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != element) {
//                newArray[newIndex] = arr[i];
//                newIndex++;
//            }
//        }
//
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = { 1, 2, 3, 4, 5 };
//
//    int newArr[]=removeElement(arr,3);
//        System.out.println(newArr);
//        System.out.println(Arrays.toString(newArr));
//    }
//



    public static int removeElement(int arr[],int element){
int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=element){
                arr[index]=arr[i];
                index++;
            }

        }

        return index;
    }

    public static void main(String[] args) {
        int arr[]={2,4,9,5,3};

        int newIndex=removeElement(arr,9);
            for (int i = 0; i <newIndex ; i++) {
                System.out.print(" "+arr[i]);
            }
        }
    }






