import java.util.*;
public class Day22P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string 1");
        String s1=sc.nextLine();
        System.out.println("enter a string 2");
        String s2=sc.nextLine();
        String[] words=s1.split("\\s+");
        System.out.println(words);
        System.out.println("converitng string to  stringbuffer");
        StringBuffer sb1=new StringBuffer(s1);
        System.out.println(sb1);
        System.out.println("length of stringbuffer is :"+sb1.length());
        System.out.println("intial capacity if string "+sb1.capacity());
        System.out.println("ensuring capacity of string");
        sb1.ensureCapacity(100);
        System.out.println("capacity of stringbuffer is :"+sb1.capacity());
        System.out.println("Reversing the stringbuffer");
        sb1.reverse();
        System.out.println(sb1);
        System.out.println("replacing string upto 5 letters wth apple");
        sb1.replace(0,5,"apple");
        System.out.println("comparing stringbuffer with string");
        if(sb1.toString().equals(s1))
        System.out.println("stringbuffer and string are equal");
        System.out.println("inserting strings");
        sb1.insert(6,s1); 
        System.out.println(sb1);
        System.out.println("deleting string");
        sb1.delete(0,6);

    }
}