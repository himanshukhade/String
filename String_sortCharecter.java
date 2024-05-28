import java.util.Scanner;
import java.util.Arrays;
// we done program in two ways
// 1)without sorting
// 2)sorting
public class String_sortCharecter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));

    }
}

//approach 2

// public class String_sortCharecter {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String");
//         String str = sc.nextLine();
//         char[] charArray = str.toCharArray();
//         Arrays.sort(charArray);
//         System.out.println(new String(charArray));
//     }
// }