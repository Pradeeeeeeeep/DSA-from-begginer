public class fibonachi {
    static int nfibonachi(int n){
        if (n<=1) {
            return n;
        }
        return nfibonachi(n-1) + nfibonachi(n-2);
    }

    public static void main(String[] args) {
        System.out.println(nfibonachi(6));
    }
}
