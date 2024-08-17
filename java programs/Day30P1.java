class A{
   
    public void display(){
       System.out.println("in a display");
       
    }
   }
class B{
   public void display(){
       System.out.println("in b display");

}
}
public class Day30P1{
   public static void main(String[] args){
       System.out.println("implemeting method overriding");
       A obj=new A();
       System.out.println(" in class A");
       obj.display();
       B obj1=new B();
       System.out.println(" in class B");
       obj1.display();
           }
}