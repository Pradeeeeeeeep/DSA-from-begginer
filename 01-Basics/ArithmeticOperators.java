public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Arithmatic Operations");
        System.out.println("Addition: " + (a+b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Division: " + (a/b));
        System.out.println("Multipication: " + (a*b));
        System.out.println("Reaminder: " + (a%b));

        System.out.println("Relational Operators");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);

        System.out.println("Logical Operators");
        int age = 20;
        System.out.println(age >= 18 && age <= 60);
        System.out.println(age < 18 || age > 60);
        System.out.println(!(age < 18));
    }
}
