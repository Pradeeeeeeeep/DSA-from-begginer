package Problems;

import java.util.Scanner;

//revurese a number
public class pb1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        while(n != 0) {
            System.out.println(n%10);
            n = n/10;
        }
    }
}
