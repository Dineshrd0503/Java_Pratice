import java.util.Scanner;
public class Day8P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sc.nextLine();
        try{

        if(n<=0||n>=100000)
        throw new Exception("enter number b/w 1 to 100000");

    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    System.out.println("sum of factors "+sumoffactors(n));
    System.out.println("no.of digits in "+n+" are "+countdigits(n));
    sc.close();
}

public static int sumoffactors(int n){
    System.out.println("facors of "+n+" are");
    int sum=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i+" ");
        sum+=i;
        }
    }
    return sum;
}

public static int countdigits(int n){
    int count=0;
    int r=0;
    while(n>0){
       r=n%10;
        count+=1;
        n/=10;
    }
    return count;
}

}