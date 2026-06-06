// public class Interface {
//     public static void main(String[] args) {
//         payment.process(); // static method => belongs to the class 
//         payment p;
//         p=new Upi();
//         p.pay(1000);
//         p.result();   // defualt method 
//         p=new creditcard();
//         p.pay(5000);
//         p.result();
//         p=new debitcard();
//         p.pay(2000);
//         p.result();   // calling default method
//     }
// }

// interface payment{
// void pay(double amount);
// default void result(){    // default method.we can call by using object
//     System.out.println("Payment successful");    
// }
// static void process(){
//     System.out.println("Payment processing");
// }

// }

// class  Upi implements payment{
//     static{
//         System.out.println("UPI");   // static block
//     }
//     public void pay(double amount){
//         System.out.println(amount+"paid by upi");
//     }
// }
// class creditcard implements payment{
//     public void pay(double amount){
//         System.out.println(amount+"paid by credit card");
//     }
// }
// class debitcard implements payment{
//     public void pay(double amount){
//         System.out.println(amount+"paid by debit card");
//     }
// }


//////////////

public class Interface{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.sleep();
        Cat c=new Cat();
        c.sound();
        c.sleep();
    }
}

interface Animal{
    void sound(); 

    default void sleep(){
        log("It's Animal World");  // calling private method // It introduced in java 9+
        System.out.println("Sleeping");

    }
    private void log(String message){      // private method 
        System.out.println("LOG:"+message);
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("MEOW MEOW");
    }
}