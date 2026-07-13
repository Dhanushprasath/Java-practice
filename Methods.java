import java.util.*;
class Student{
    void display(String name,int age,String dept){
        System.out.println("My name is "+name);
          System.out.println("I am "+age);
            System.out.println("I belongs to "+dept+" department");
    }
}

public class Methods{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        String dept=sc.next();
        Student s=new Student();
        s.display(name,age,dept);

    }
}


// class Employee{
// void greet(){
//     System.out.println("Welcome to office");
// }
// }
// public class Main{
//     public static void main(String[] args) {
//         Employee e=new Employee();
//         for(int i=0;i<3;i++){
//             e.greet();
//         }
//     }
// }