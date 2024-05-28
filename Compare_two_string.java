import java.util.*;

Two method for comparing the String

1)(a==b) check reference variable and object declaration 
also check content before and after = assign it is same then true otherwise false
if we make different object gives false
object declare by two ways in String
1) String a="Lion" //string literal
2) String b=new String("Lion") //new keyword
above reference variable is different the gives false and
reference variable is same gives compile error

2(a.equals(b)) check only content if content is same give true as a result otherwise gives false

first method (a==b)
public class Compare_two_string{
    public static void main(String[]args){
        String a="Lion";//string literal
        String b="Lion";
        if(a==b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}  
output=true


when object declaration is different in (a==b)
 public class Compare_two_string{
        public static void main(String[]args){
            String a="Lion";//string literal
            String b=new String("Lion");
            if(a==b){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    } 
    output=false 


second method (a.equals(b))
 public class Compare_two_string{
        public static void main(String[]args){
            String a="Lion";//string literal
            String b=("Lion");
            if(a.equals(b)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    } 
output=true

if declaration of object is different
 public class Compare_two_string{
        public static void main(String[]args){
            String a="Lion";//string literal
            String b=new String("Lion");
            if(a.equals(b)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
    output=true 