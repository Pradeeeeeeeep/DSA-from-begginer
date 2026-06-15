public class maxElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 66, 85, 30, 33, 78, 7, 67};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The largest element of the array is " + max);
    }
}
