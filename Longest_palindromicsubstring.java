import java.util.*;
public class Longest_palindromicsubstring {

    static class Solution {
        int max = 0;
        int start = 0;
        int end = 0;

        boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                if (ch1 != ch2)
                    return false;
                i++;
                j--;
            }
            return true;
        }

        public String longestPalindrome(String s) {
            int n = s.length();
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (isPalindrome(s, i, j)) {
                        if ((j - i + 1) > max) {
                            max = j - i + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
            return s.substring(start, end + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Solution solution = new Solution();
        String longestPalindrome = solution.longestPalindrome(input);

        System.out.println("Longest palindrome: " + longestPalindrome);
    }
}