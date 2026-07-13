public class StaticAndNonStatic {
    // Static variable(shared by all objects)
    static String college = "ABC College";
    // Non-static variable(each object has its own copy)
    String name;
    int age;
    // Constructor
    StaticAndNonStatic(String name, int age) {
        this.name = name;
        this.age = age;
    }
   // Non-static method
    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
    }
    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
        System.out.println("College changed to: " + college);
    }
public static void main(String[] args) {
        StaticAndNonStatic s1 = new StaticAndNonStatic("vijay", 21);
        StaticAndNonStatic s2 = new StaticAndNonStatic("Ajith", 22);
        System.out.println("Before changing static variable:");
        s1.display();
        s2.display();
        changeCollege("XYZ Engineering College");
        System.out.println("After changing static variable:");
        s1.display();
        s2.display();
    }
}