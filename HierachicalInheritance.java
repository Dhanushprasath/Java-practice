public class HierachicalInheritance {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        Bus b1=new Bus();
        c.start();
        c.drive();
        b.start();
        b.ride();
        b1.start();
        b1.carryPassenger();
      
      
    }
}
class Vehicle{
void start(){
    System.out.println("vehicle started");
}
}

class Car extends Vehicle{
void drive(){
    System.out.println("I am driving the car");
}
}

class Bus extends Vehicle{
    void carryPassenger(){
        System.out.println("I am driving the bus along with the passenger");
    }

}

class Bike extends Vehicle{
void ride(){
    System.out.println("I am riding a bike");
}
}