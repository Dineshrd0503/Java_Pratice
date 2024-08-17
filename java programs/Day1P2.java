import java.util.Scanner;
import java.lang.Math;
public class Day1P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side of square");
        double side=sc.nextDouble();
        double area=side*side;
        System.out.println("area of square using normal method is "+area);
        System.out.println("uisng power function "+Math.pow(side,2));
    }
    
}
