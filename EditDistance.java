import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        int editDistance = computeEditDistance(s, t);
        System.out.println("Edit Distance between '" + s + "' and '" + t + "' is: " + editDistance);

        
    }

    public static int computeEditDistance(String s, String t) {
        int m = s.length();
        int n = t.length();

        // Create the table to store distances
        int[][] dp = new int[m + 1][n + 1];

        // Base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Fill the table using dynamic programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Perform three operations such as insert, delete, and replace
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // Replace
                                            Math.min(dp[i][j - 1], // Remove
                                                     dp[i - 1][j])); // Delete
                }
            }
        }

        // The edit distance is at the bottom-right cell of the table
        return dp[m][n];
    }
}