import java.util.*;
public class Week4Special {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> a=new ArrayList<>();
        System.out.println("enter size of list");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter element: "+i);
            a.add(sc.nextInt());
        }
        findmedian(a);
    }
    public static void findmedian(List<Integer> a){
        Collections.sort(a);
        System.out.println("sorted list is "+a);
        if(a.size()==1)
            System.out.println("median of list is "+a.get(0));
        else {
            if(a.size()%2==0) {
                System.out.println("list has even elements");
                float median = (a.get(a.size()/2) + a.get((a.size()/2)-1)) / 2.0f;
                System.out.printf("median is %.3f",median);
            }
            else {
                System.out.println("list has odd elements");
                System.out.println("median is " + a.get(a.size() / 2));
            }
        }

    }

}
