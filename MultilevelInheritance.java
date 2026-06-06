public class MultilevelInheritance {
    public static void main(String[] args) {
        Babydog bd=new Babydog();
        bd.bark();
        bd.eat();
        bd.weep();
    }
}


class Animal{
   void eat(){
    System.out.println("Animal eating");
   }
}
class Dog extends Animal{
void bark(){
    System.out.println("Dog Barks");
   }
}

class Babydog extends Dog{
void weep(){
    System.out.println("Baby dog weep");
   }
}