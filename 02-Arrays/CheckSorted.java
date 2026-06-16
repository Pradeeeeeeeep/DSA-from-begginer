public class CheckSorted {
    public static void main(String[] args) {
        //int[] arr = {22, 34, 12, 45, 65, 88}; //not sorted
        int[] arr = {12, 24, 34, 44, 54, 64, 74}; //sorted
        boolean sorted = true;
        for(int i = 0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]) {
                sorted = false;
                break;
            }
        }

        if (sorted == true) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("Array not sorted");
        }
    }
}
