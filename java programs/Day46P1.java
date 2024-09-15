import java.util.*;
import java.util.jar.JarOutputStream;

public class Day46P1 {
    public static void main(String[] args) {
        System.out.println("implementing basic moehtods of sets");
        Set<Integer> s=new HashSet<>();
        System.out.println("adding 1 to 5 elements ij to set");
        for(int i=5;i>=1;i--){
            s.add(i);
        }
        print(s);
        System.out.println("displaying size of list");
        System.out.println(s.size());
        System.out.println("using other list mehtods");
        System.out.println("is list empty "+s.isEmpty());
        Set<Integer> s1=new HashSet<Integer>();
        s1.add(9098);
        s1.add(8);
        s1.add(6);
        s.addAll(s1);
        print(s);
        System.out.println("checking if set is subset of other set");
        System.out.println(s.containsAll(s1));
        System.out.println("removing s1 form s");
        s.removeAll(s1);
        print(s);
        System.out.println("remving 2 from set");
        s.remove(2);
        print(s);
        System.out.println(Collections.max(s));
        System.out.println(Collections.min(s));
        System.out.println();
        for (Object o : s.stream().toArray()) {
            System.out.println(o);


        }
        long count = s.stream().count();
        System.out.println(" no.of elements are "+count);



    }
    public static void print(Set<Integer> s){
        Iterator<Integer> it=s.iterator();
        System.out.println("elements are ");
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }

}
