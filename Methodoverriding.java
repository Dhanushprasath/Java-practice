public class Methodoverriding {
    public static void main(String[] args) {
        Employee e=new Developer();
        Employee t=new Tester();
        e.work();
        t.work();
        
    }
}

class Employee{
void work(){
    System.out.println("I am working");
}
}

class Developer extends Employee{
    @Override
      void work(){
        System.out.println("I am Developer");
      }
}

class Tester extends Employee{
    @Override
    void work(){
        System.out.println("I am Tester");
    }
}

class Manager extends Employee{
    @Override
    void work(){
        System.out.println("I am manager");
    }
}
