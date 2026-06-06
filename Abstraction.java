public class Abstraction{
    public static void main(String[] args) {
        Shape s1=new Circle();
        Shape s2=new Rectangle();
        Shape s3=new square();
        s1.draw();
        s1.drawn();
        s2.draw();
        s3.draw();

        
    }
}

abstract class Shape{
    abstract void draw();  // abstract method
    void drawn(){       // normal method 
System.out.println("drawn successful");
    }
}

class Circle extends Shape{
    
    void draw(){
        System.out.println("draw circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("draw rectangle");
    }
}

class square extends Shape{
    void draw(){
        System.out.println("draw square");
    }
}