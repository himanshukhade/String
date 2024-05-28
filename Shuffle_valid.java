import java.util.*;
public class Shuffle_valid{
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter the first string:");
            String first = scanner.nextLine();
    
            System.out.println("Enter the second string:");
            String second = scanner.nextLine();
    
            System.out.println("Enter the potential shuffle string:");
            String shuffle = scanner.nextLine();
    
            if (isValidShuffle(first, second, shuffle)) {
                System.out.println(shuffle + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(shuffle + " is not a valid shuffle of " + first + " and " + second);
            }
    
      

        }
    
        public static boolean isValidShuffle(String first, String second, String shuffle) {
            if (first.length() + second.length() != shuffle.length()) {
                return false;
            }
    
            int i = 0, j = 0, k = 0;
    
            while (k < shuffle.length()) {
                if (i < first.length() && first.charAt(i) == shuffle.charAt(k)) {
                    i++;
                } else if (j < second.length() && second.charAt(j) == shuffle.charAt(k)) {
                    j++;
                } else {
                    return false;
                }
                k++;
            }
    
            return true;
    }
}