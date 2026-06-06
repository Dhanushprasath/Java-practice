public class SingleInheritance {
   public static void main(String[] args) {
    Dog d=new Dog();
    d.bark();
    // d.eat();  calling parent class method
   }
}


class Animal{
  void eat(){
    System.out.println("Animal is eating");
  }
  Animal(){
    System.out.println("Animal Constructor");
  }
}
class Dog extends Animal{
    Dog(){
        super();
        
        System.out.println("Dog constructor");
    }
     
void bark(){
   super.eat();  // calling parent class method
System.out.println("Dog barks");
}
}

