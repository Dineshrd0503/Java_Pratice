import java.util.*;
public class Day21P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("cecking if palindorme string");
        StringBuilder s=new StringBuilder(str);
        String rev_str=s.reverse().toString();
        System.out.println("reversed string is :"+rev_str);
        if(str.equals(rev_str))
        System.out.println(str+" is a palindromic string");
        else
        System.out.println(str+" is not a palindromic string");


}
}