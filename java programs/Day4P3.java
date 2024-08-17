import java.util.Scanner;
import java.lang.*;
public class Day4P3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("palindrome number checker");
       System.out.println("enter a nmber");
       int n=sc.nextInt();
       sc.nextLine();
       if(numpalindrome(n))
        System.out.println(n+" is a palindrome");
        else
        System.out.println(n+" is not a palindrome");
       System.out.println("enter a string to check palindrome");
       String str=sc.nextLine();
       if(stringpalindrome(str))
        System.out.println(str+" is a palindrome");
       else
        System.out.println(str+" is not a palindrome");
       sc.close();
       
       

    }
    public static boolean  numpalindrome(int n){
        System.out.println("convertig int to string");
       String r=Integer.toString(n);
       String revstring=new StringBuffer(r).reverse().toString();
       int t=Integer.parseInt(revstring);
       System.out.println("reversed number is "+t);
       if(t==n)
       return true;
       else
       return false;
}
public static boolean  stringpalindrome(String r) {
    System.out.println("using traditional for loop");
    String r1="";
    for(int i=0;i<r.length();i++)
    r1+=r.charAt(i);
    System.out.println("reversed string is "+r1);
    String revstring=new StringBuffer(r).reverse().toString();
    return r.equals(revstring);

    
}
}