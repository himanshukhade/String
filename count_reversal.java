import java.util.Scanner;
import java.util.Stack;

class count_reversl {
    int countRev(String s) {
        if (s.length() % 2 != 0) {
            return -1; // If the length of the string is odd, it's not possible to balance braces
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // If there's a matching open brace, pop it
            } else {
                stack.push(ch); // Otherwise, push the current close brace
            }
        }

        int open = 0, close = 0;
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '{') {
                open++;
            } else {
                close++;
            }
        }
        return (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0)); // Calculate the number of reversals needed
    }
}