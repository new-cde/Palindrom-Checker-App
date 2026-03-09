import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));  // Insert at rear
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome.");
        } else {
                System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}