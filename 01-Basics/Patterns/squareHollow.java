package Patterns;

public class squareHollow {
    public static void main(String[] args) {
        System.out.println("Pattern 3: Hollow Square");
        for(int i =0; i<=5; i++){
            for(int j=0; j<=5; j++){
                if (i==00 || j==0 || i==5 || j==5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
