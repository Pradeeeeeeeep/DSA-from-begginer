public class counrVow {
    public static void main(String[] args) {
        String str = "aEiOu";
        int count = 0;
        for(int i=0; i<=str.length()-1; i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("The vowels in the string = " + count);
    }
}
