// package 04-Recursion;

public class sumOfNnums {
    static int Nsum(int n){
        if (n==0) {
            return 0;
        }
        return n + Nsum(n-1);
    } 
    public static void main(String[] args) {
        System.out.println(Nsum(10));
    }
}
