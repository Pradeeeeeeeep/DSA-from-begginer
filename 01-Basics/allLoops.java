public class allLoops {
    public static void main(String[] args) {
        int i=0;
        System.out.println("This is for loop:");
        for (i=0; i<=5; i++) {
            System.out.println(i);
        }

        System.out.println("This is while loop");
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        System.out.println("This is do while loop");
        do {
            System.out.println(i);
            i++;
        }while(i<=15);

    }
}
