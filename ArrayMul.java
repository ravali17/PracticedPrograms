public class ArrayMul {
    public static  int[] mulArray(int arr[]){
        int newArr[] = new int[arr.length];
for(int index=0;index< arr.length; index++){
    newArr[index] =arr[index]*2;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {9,4,7,14};
        int outPut[] = mulArray(arr);
        for (int val:outPut) {
            System.out.println(val);
        }
    }


}


