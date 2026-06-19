// package Recursion;

public class printNto1 {
    public static void prntNum(int n){
    if (n==0) {
        return;
    }
    System.out.println(n);
    prntNum(n-1);
  }

  public static void main(String[] args) {
    prntNum(5);
  }
}
