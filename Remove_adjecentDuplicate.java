import java.util.Scanner;

class Remove_adjecentDuplicate {
    public String removeDuplicate(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            if (res.length() > 0 && s.charAt(i) == res.charAt(res.length() - 1)) {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(s.charAt(i));
            }
        }
        
        return res.toString();
    }
}

public class Remove_adjecentDuplicate  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Remove_adjecentDuplicate solution = new Remove_adjecentDuplicate();
        String result = solution.removeDuplicate(input);
        
        System.out.println("String after removing consecutive duplicates: " + result);
        
        scanner.close();
    }
}