import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Two Pointer Method
    public static boolean twoPointerMethod(String str) {

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

        System.out.println("Palindrome Checker App - Performance Comparison");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Reverse Method Timing
        long startTime = System.nanoTime();
        boolean reverseResult = reverseMethod(input);
        long endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

        // Stack Method Timing
        startTime = System.nanoTime();
        boolean stackResult = stackMethod(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Two Pointer Method Timing
        startTime = System.nanoTime();
        boolean pointerResult = twoPointerMethod(input);
        endTime = System.nanoTime();
        long pointerTime = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Reverse Method Result: " + reverseResult + " | Time: " + reverseTime + " ns");
        System.out.println("Stack Method Result: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Two Pointer Method Result: " + pointerResult + " | Time: " + pointerTime + " ns");

        scanner.close();
    }
}