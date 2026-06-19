// package Recursion;

public class print1toN {
  public static void main(String[] args) {
    prntNum(5);
  } 
  
  public static void prntNum(int n){
    if (n==0) {
        return;
    }
    prntNum(n-1);
    System.out.println(n);
  }
}
