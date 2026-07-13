class Father{
Father(){
    this("I am elder person in my family");
    System.out.println("I am father");
}
Father(String msg){
    System.out.println(msg);
}
}
class Son extends Father{
       Son(){
        super();
        System.out.println("I am son");
    }

}

public class ConstructorChaining {
    public static void main(String[] args) {
         Son s=new Son();
    
    }
}


// class Laptop {

//     String brand;
//     String processor;
//     int ram;
//     int price;

//     // No-argument constructor
//     Laptop() {
//         this("HP");
//         System.out.println("No-Argument Constructor");
//     }

//     // One-parameter constructor
//     Laptop(String brand) {
//         this(brand, "Intel Core i5");
//         System.out.println("One-Parameter Constructor");
//     }

//     // Two-parameter constructor
//     Laptop(String brand, String processor) {
//         this(brand, processor, 8);
//         System.out.println("Two-Parameter Constructor");
//     }

//     // Three-parameter constructor
//     Laptop(String brand, String processor, int ram) {
//         this(brand, processor, ram, 50000);
//         System.out.println("Three-Parameter Constructor");
//     }

//     // Four-parameter constructor
//     Laptop(String brand, String processor, int ram, int price) {
//         this.brand = brand;
//         this.processor = processor;
//         this.ram = ram;
//         this.price = price;

//         System.out.println("Four-Parameter Constructor");
//     }

//     void display() {
//         System.out.println("\nLaptop Details");
//         System.out.println("Brand     : " + brand);
//         System.out.println("Processor : " + processor);
//         System.out.println("RAM       : " + ram + " GB");
//         System.out.println("Price     : " + price);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Laptop l1 = new Laptop();

//         System.out.println("-------------------------");

//         Laptop l2 = new Laptop("Dell");

//         System.out.println("-------------------------");

//         Laptop l3 = new Laptop("Lenovo", "AMD Ryzen 5");

//         System.out.println("-------------------------");

//         Laptop l4 = new Laptop("Asus", "Intel Core i7", 16);

//         System.out.println("-------------------------");

//         Laptop l5 = new Laptop("Apple", "M3", 16, 150000);

//         System.out.println("\nFinal Object Details:");
//         l1.display();
//         l2.display();
//         l3.display();
//         l4.display();
//         l5.display();
//     }
// }