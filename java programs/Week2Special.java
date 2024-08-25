import java.util.*;
public class Week2Special{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        a.add(sc.nextInt());
        Collections.sort(a);
        int result=findunique(a);
        if(result==-1)
        System.out.println("no unique element");
        else
        System.out.println("Unique element index is "+result);
    }
    public static int findunique(List<Integer> a){
        Map<Integer,Integer> s=new HashMap<>();
        for(int n:a)
        s.put(n,s.getOrDefault(n,0)+1);
        for(int n:a){
            if(s.get(n)==1)
            return a.indexOf(n);
        }
        return -1;
    }
}