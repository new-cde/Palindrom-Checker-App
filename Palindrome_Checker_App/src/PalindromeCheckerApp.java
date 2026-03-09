import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return str.equals(reversed);
    }
}

// Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App - Strategy Pattern");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}