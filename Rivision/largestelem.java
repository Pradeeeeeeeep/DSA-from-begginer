package Rivision;

public class largestelem {
    public static void main(String[] args) {
        int[] arr = {11, 34, 22, 56, 77, 44, 30, 44, 27};
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (ans < arr[i]) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
