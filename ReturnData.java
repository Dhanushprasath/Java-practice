class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int square(int n){
        return n*n;
    }
}
public class ReturnData {
    public static void main(String[] args) {
        Calculator c=new Calculator();
       int sum= c.add(10,20);
       System.out.println("sum="+sum);
       System.out.println("Square:"+c.square(10));
    }
}
