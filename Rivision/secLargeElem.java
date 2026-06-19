package Rivision;

public class secLargeElem {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int[] arr = {10, 23, 34, 56, 66, 34, 22, 79};
        for(int i=0; i<arr.length; i++){
            if (a < arr[i]) {
                b = a;
                a = arr[i];
            }
        }
        System.out.println(b);
    }
    
}
