public class PrintTheElements {
    public static int[] printArr(int arr[]) {

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }


        return arr;
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int output[]=printArr(array);
        System.out.println(output);


    }
}
