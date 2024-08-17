import java.util.Scanner;
public class Day1P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 inetger or folating number");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        double sum=num1+num2+num3;
        double average=sum/3;
        System.out.printf("\n Sum of the three numbers:%.4f",sum);
        System.out.println("Average of the three numbers: "+average);

        
    }
}