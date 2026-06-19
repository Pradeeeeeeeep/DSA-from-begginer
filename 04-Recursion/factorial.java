public class factorial {
    static int nfactorial(int n){
        if(n==0 | n==1){
            return 1;
        }
        return n * nfactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(nfactorial(10));
    }
}
