import java.util.*;
public class Remove_specialchar{
public static void main(String[]args){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the String");
    // String word=sc.nextLine();
    // String plainStr=word.replaceAll("[a-zA-Z0-9]","");
    // System.out.println("String After remove special charecter in java: " + plainStr);

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.nextLine(); 
        String plainStr = word.replaceAll("[^a-zA-Z0-9]", ""); 

        System.out.println("String After removing special characters: " + plainStr);
    }
}
