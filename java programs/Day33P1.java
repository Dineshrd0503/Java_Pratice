class fruit{
    public void display(){
        System.out.println("In fruit class");

    }
}
class apple extends fruit{
    public void display1(){
        System.out.println("In apple class");

    } 
}
class kashmirapple extends apple{
    public void display2(){
        System.out.println("In kashmirapple class");

    }

}
public class Day33P1{
    public static void main(String[] args){
        System.out.println("exhibiting multilevel inheritance");
        kashmirapple obj=new kashmirapple();
        obj.display();
        obj.display1();
        obj.display2();
    }
}