
public class Methodoverloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(2,3));
      System.out.println(c.add(2,3,4));   
      System.out.println(c.add(7.8, 8.8));     
    }
}

class Calculator{
    int add(int a,int b){
        int sum=a+b;
          return sum;

    }
    int add(int a,int b,int c){
        int sum1=a+b+c;
        return sum1;
    }
    double add(double a,double c){
          double sum2=a+c;
          return sum2;
    }

}
