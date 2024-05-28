import java.util.Scanner;

class Solution {
    public int Longest_repeatingubsequence(String str) {
        int n = str.length();
        int[][] lcs = new int[n+1][n+1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    lcs[i][j] = 0;
                else if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];
                else
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
            }
        }
        
        return lcs[n][n];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Solution solution = new Solution();
        int result = solution.Longest_repeatingubsequence(str);
        System.out.println("Length of the longest repeating subsequence: " + result);
    }
}