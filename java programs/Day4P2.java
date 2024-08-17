import java.util.*;
public class Day4P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of list");
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            System.out.println("enter element:"+i);
            a.add(sc.nextInt());
        }
        
        System.out.println("calcualting suk fo odd and even inetgers");
        oddsum(a);
    }
    public static void oddsum(ArrayList<Integer> a){
        int oddsum=0,evensum=0;
        System.out.println("odd numbers are");
        for(int i:a){
            if(i%2!=0){
                System.out.println(i+" ");
                oddsum+=i;
            }
        }
        System.out.println("sum of odd elements:"+oddsum);
        System.out.println("even numbers are");
        for(int i:a){
            if(i%2==0){
                System.out.println(i+" ");
                evensum+=i;
            }
    }
    System.out.println("sum of even elements:"+evensum);
    }
    
}
