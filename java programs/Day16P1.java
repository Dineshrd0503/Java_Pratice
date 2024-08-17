import java.util.*;
import java.lang.*;
public class Day16P1{
    public static void main(){
        System.out.println("demosntarting strings in java");
        Scanner sc=new Scanner(System.in);
        System.out.println("demosntrating strongs in jvaa");
        System.out.println("creating string hello world");
        String str=new String("hello world");
        System.out.println("enter string hellowworld");
        String s=sc.nextLine();
        boolean val1=(str==s);
        System.out.println("comparing str and s using == operator :"+val1);
        boolean val2=(str.equals(s));
        System.out.println("comparing str and s using equals method :"+val2);
        System.out.println("itearting over each character of string");
        System.out.println("uisng enhanced for loop");
        for(char c:str.toCharArray())
            System.out.println(c);
        sc.close();
        



    }
}