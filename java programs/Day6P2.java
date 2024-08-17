import java.util.Scanner;
public class Day6P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your tempetaure in farehiet");
        double f=sc.nextDouble();
        if(f>100)
        System.out.println("fever");
        else
        System.out.println("no fever");
        sc.close();
    
}
}
