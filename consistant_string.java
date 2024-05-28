import java.util.HashSet;
import java.util.Scanner;

public class consistant_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the allowed characters:");
        String allowed = scanner.next();

        System.out.println("Enter the number of words:");
        int n = scanner.nextInt();
        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        Solution solution = new Solution();
        int consistentStrings = solution.countConsistentStrings(allowed, words);
        System.out.println("Number of consistent strings: " + consistentStrings);

        scanner.close();
    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<Character>();

        // Add allowed characters to HashSet
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int counter = 0;
        // Check consistency for each word
        for (String str : words) {
            boolean consistent = true;
            for (char c : str.toCharArray()) {
                if (!set.contains(c)) {
                    consistent = false;
                    break; // No need to check further if inconsistency found
                }
            }
            if (consistent) {
                counter++;
            }
        }
        return counter;
    }
}