package Patterns;

public class numberTriangle {
    public static void main(String[] args) {
        System.out.println("Pattern 4: Number Triagnle");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
