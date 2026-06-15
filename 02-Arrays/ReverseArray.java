public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {22, 24, 26, 28, 30, 32, 34, 36};
        int left = 0;
        int right = arr.length - 1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
