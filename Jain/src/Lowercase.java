import java.util.*;
public class Lowercase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char s;
        s=sc.next().charAt(0);
        if(Character.isLowercase(s))
            System.out.println(s+"->"+Character.toUppercase(s));
        else
          System.out.println(s+"->"+Character.toLowercase(s));  
        
    }
    
}