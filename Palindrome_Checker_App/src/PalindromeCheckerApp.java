import java.util.Scanner;
public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App - Case Insensitive & Space Ignored");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Normalize the string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}