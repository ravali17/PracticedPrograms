

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 6, 3,};
        int n = arr.length+1 ;
        int arrSum = 0;

        System.out.println("The given array is:");
        for (int v : arr) {
            System.out.print(v + " ");
            arrSum += v;
        }
        System.out.println();

        int expectSum = (n * (n + 1)) / 2;
        int missingNo = expectSum - arrSum;

        System.out.println("The missing number is: " + missingNo);
    }
}





