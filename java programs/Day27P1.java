import java.util.*;
class car{
    String brand,model;
    float price;
    public car(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display() {
        System.out.println("without using this keyword\n "+"Brand: " + brand + ", Model: " + model + ", Price: " + price);
        System.out.println("using this keyword\n Brand: " + this.brand + ", Model: " + this.model + ", Price: " + this.price);
    }
}

public class Day27P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("caretaig a car class");
        List<car> cars=new ArrayList<>(10);
        System.out.println("enter no,of cars(below 10)");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter brand,model and price of car "+(i+1));
            String brand=sc.nextLine();
            String model=sc.nextLine();
            sc.nextLine(); //to consume newline character after model input
            float price=sc.nextFloat();
            car c=new car(brand, model, price);
            cars.add(c);
    
    }
    System.out.println("displaying car details");
    for(car c:cars){
        c.display();
    }
    
}
}
