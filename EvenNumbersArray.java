public class EvenNumbersArray {
    public static int[] evenArr(int arr[]){
for(int i=0;i<arr.length;i++) {
    if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
    }
}
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
     evenArr(arr);

    }
}
