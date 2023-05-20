public class SearchArray {
    public static void main(String[] args) {
        int arr[] = {1, 6, 8, 4};
        int target = 8;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {

            System.out.println("target found");
        } else {
            System.out.println("target not found");
        }

    }
}



