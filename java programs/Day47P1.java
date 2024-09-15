import java.util.*;
public class Day47P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> a=new HashMap<>();
        System.out.println("entering 5 parus into hashmap");
        for(int i=0;i<5;i++){
            System.out.println("enter sno");
            int sno=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name of student");

            String sname=sc.nextLine();
            a.put(sno,sname);
        }
        System.out.println("diplaying 5 pairs");
        for(Map.Entry<Integer,String> entry:a.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
