public class palindromeStr {
    public static void main(String[] args) {
        String name = "appa";
        String revurse = "";
        for(int i=name.length()-1; i>=0; i--){
            revurse += name.charAt(i);
        }

        if (name.equals(revurse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
