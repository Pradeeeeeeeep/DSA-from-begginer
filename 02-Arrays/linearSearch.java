public class linearSearch {
    public static void main(String[] args) {
        int[] arr={11, 13, 15, 17, 19, 21, 23, 25, 27, 31};
        int n = 21;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == n) {
                System.out.println("The index of the element is "+i);
            }
        }
    }
}
