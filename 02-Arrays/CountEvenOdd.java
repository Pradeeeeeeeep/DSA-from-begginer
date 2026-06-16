public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {20, 43, 33, 24, 26, 76, 55, 85, 73};
        int even = 0;
        int odd = 0;
        for(int num:arr){
            if (num%2==0) {
                even++;
            } else{
                odd++;
            }
        }
        System.err.println("There are "+even+" even numbers and " +odd+ " odd numbers");
    }
}
