import java.util.Scanner;
public class Day6P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n>0)
        System.out.println("positive");
        else
        System.out.println("negative");
        sc.close();
    }
}