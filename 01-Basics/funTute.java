public class funTute {

    static void greet(String name) {
            System.out.println("Hi, Good Morning " +name );
        }

    static int sum(int a, int b){
        return a+b;
    }

    static int square(int n) {
        return n*n;
    }

    static boolean isEven(int c) {
        if(c%2 == 0){
            return true;
        }else {
            return false;
        }
    }

    static int factorial(int d) {
        if(d==1){
            return 1;
        }
        int answer = 1;
        for(int i=1; i<=d; i++) {
            answer = answer*i;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        greet("Pradeep");
        System.out.println(sum(10, 20));
        System.out.println("The square of the number "+n+" is " + square(n));
        System.out.println("The number "+ n + " is even: " + isEven(n) );
        System.out.println("The factorial of the number is: "+factorial(n));
    }
    

    
}
