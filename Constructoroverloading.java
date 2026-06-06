public class Constructoroverloading {
 public static void main(String[] args) {
    Student s1=new Student();
    Student s2=new Student("ajay");
    Student s3=new Student("Vicky", 25);

    
 }   
}

class Student{
     String name;
     int age;
    Student(){
        System.out.println("Default constructor");
    }
    Student(String name){
        this.name=name;
        System.out.println("Name:"+name);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.print("Name:"+name +"\t" + "Age:"+ age);

    }
}
