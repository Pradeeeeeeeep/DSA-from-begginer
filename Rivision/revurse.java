package Rivision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class revurse {
    public static void main(String[] args) {
        int[] arr = {33, 23, 45, 56, 22, 66, 67, 44, 98, 11};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
