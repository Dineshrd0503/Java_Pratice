import java.util.Scanner;
public class Day2P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost of 3 items");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double cost=a+b+c;
        double gst=cost*0.18;
        double totalCost=cost+gst;
        System.out.println("***********");
        System.out.println("cost of item1: "+a);
        System.out.println("cost of item2: "+b);
        System.out.println("cost of item3: "+c);
        System.out.println("cost of 3 items : "+cost);
        System.out.println("***********");
        System.out.println("gst: "+gst);
        System.out.println("total cost: "+totalCost);
        sc.close();

        


    
    }
    
}
