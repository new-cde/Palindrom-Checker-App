public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}