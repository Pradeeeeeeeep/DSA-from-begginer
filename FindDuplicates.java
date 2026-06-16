public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 12, 14, 90, 44, 34 };
        System.out.println(FindDuplicates(arr));
    }

    public static boolean FindDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
