public class MultipleInheritance {
    public static void main(String[] args) {
    // Father f=new Child();
    // Mother m=new Child();
    // f.height();
    // m.colour();
    Child c=new Child();
    c.height();
    c.colour();
}
     
}

interface Father{
    void height();
}

interface Mother{
  void colour();
}

class Child implements Father,Mother{
    public void height(){
      System.out.println("Height inherit from father");
    }
    public void colour(){
System.out.println("Color inherit from mother");
    }
}