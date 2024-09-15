import java.util.*;
public class Day44P1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rand=new Random();
        int n=rand.nextInt(100)+1;
        System.out.println("adding elements");
        for(int i=0;i<n;i++) {
            list.add(i);
        }
        System.out.println(list);
        list.addFirst(56);
        list.addLast(56);

        System.out.println(list);
        System.out.println("size of list "+list.size());
    }
    public static void print(LinkedList<Integer> list){
        Iterator<Integer> i=list.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }

}
