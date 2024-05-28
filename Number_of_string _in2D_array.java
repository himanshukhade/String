import java.util.Scanner;

public class Number_of_string_in2D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = scanner.nextInt();

        char[][] matrix = new char[rows][cols];

        System.out.println("Enter the elements of the matrix (each row on a new line):");
        for (int i = 0; i < rows; i++) {
            String row = scanner.next();
            matrix[i] = row.toCharArray();
        }

        System.out.println("Enter the target string:");
        String target = scanner.next();

        Solution solution = new Solution();
        int occurrences = solution.findOccurrence(matrix, target);
        System.out.println("Occurrences of \"" + target + "\": " + occurrences);

      
    }
}

class Solution {
    int ans; // make global

    public int findOccurrence(char mat[][], String target) {
        ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                dfs(mat, i, j, target, 0);
            }
        }
        return ans;
    }

    void dfs(char[][] mat, int i, int j, String target, int idx) {
        if (i < 0 || j < 0 || i == mat.length || j == mat[0].length || idx >= target.length() || target.charAt(idx) != mat[i][j])
            return;

        if (idx == target.length() - 1) {
            ans++;
            return;
        }

        char ch = mat[i][j];
        mat[i][j] = 0;
        dfs(mat, i + 1, j, target, idx + 1);
        dfs(mat, i - 1, j, target, idx + 1);
        dfs(mat, i, j + 1, target, idx + 1);
        dfs(mat, i, j - 1, target, idx + 1);
        mat[i][j] = ch;
    }
}