import java.util.*;
public class Day45P1 {
    public static void main(String[] args) {
        System.out.println("creating two sets of inetger and character type");
        Set<Integer> s=new HashSet<Integer>();
        Set<Character> s1=new HashSet<>();
        for(int i=0;i<10;i++)
            s.add(i);
        for(char i='a';i<='z';i++)
            s1.add(i);
        System.out.println();
        print(s);
        System.out.println();
        print1(s1);
    }
    public static void print(Set<Integer> s){
        Iterator<Integer> i = s.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");

    }
    public static void print1(Set<Character> s1){
        Iterator<Character> i = s1.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");

    }



}
