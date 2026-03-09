import java.util.Scanner;
public class PalindromeCheckerApp {
    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App - Recursive Method");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();
        boolean result = isPalindrome(input, 0, input.length() - 1);
        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}