import java.util.*;

class student{
    String name,rollno,branch;
    public student(String name,String rollno,String branch){
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
    }
    public void display(){
        System.out.println("Name: "+name+"\nRoll No.: "+rollno+"\nBranch: "+branch);
    }
}
public class Day26P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("creating a class studnet");
        List<student> students=new ArrayList<>();
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter name, rollno and branch of student "+(i+1));
            String name=sc.next();
            String rollno=sc.next();
            String branch=sc.next();
            student s=new student(name,rollno,branch);
            students.add(s);
            System.out.println("Student "+(i+1)+" details:");
            s.display();
        }
}
}