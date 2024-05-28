import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to validate parentheses, brackets, and braces:");
        String input = scanner.nextLine();
        
        boolean isValid = isValidParentheses(input);
        System.out.println("The parentheses, brackets, and braces are " + (isValid ? "valid" : "invalid"));
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c == ']' && stack.peek() != '[') return false;
                if (c == ')' && stack.peek() != '(') return false;
                if (c == '}' && stack.peek() != '{') return false;

                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}