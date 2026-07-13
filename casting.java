/*  Type casting is the process of converting  one data type to another.
Widening Casting (Implicit Casting) : no data loss possible 
Converting a smaller data type to a larger data type automatically. (Smaller → Larger)
Numeric path: byte → short → int → long → float → double
Character path: char → int → long → float → double
Narrowing Casting (Explicit Casting):  data loss posssible. overflow occur during narrowing
Converting a larger data type to a smaller data type manually using parentheses.(Larger -> smaller)
order: double → float → long → int → short → byte  
       double ->float-> long-> int-> char
*/
public class casting {
    public static void main(String[] args) {
        int num=100;
    double d=num;   // automatic conversion
    String name="dhanush";
    System.out.println(num); // 100
    System.out.println(d);   // 100.0

    System.out.println(((Object)num).getClass().getName());  // this line show "java.lang.Integer" .
    // For primitive data types,we need to cast to an object before using getclass()

    System.out.println(name.getClass().getName());  // it prints java.lang.String



double a=102.34;
int b=(int) a;  // explicit conversion- double to int 
System.out.println(a); // 102.34
System.out.println(b);   // 102


int num2=130; 
byte x=(byte) num2;
System.out.println(x);    // it prints " -126"
    }

}

// here,130 is out of byte range.so, first take binary of 130  ie,   
// 130/2   0 rem     65/2   1 rem   32/2  0 rem    16/2  0 rem   8/2 0 rem   4/2 0 rem   2/2  o rem   1  write from last to first 
// 1     0    0    0    0    0   1   0
// 128  64    32   16   8    4   2   1

// (1*128)+(0*64)+(0*32)+(0*16)+(0*8)+(0*4)+(1*2)+(0*1)=128+2=130
//   |                                        |

//              1 0 0 0 0 0 1 0

//                          1
// invert bits  0 1 1 1 1 1 0 1
// add +1                     1
//              0 1 1 1 1 1 1 0 
// now convert to  decimal  ->    2+4+8+16+32+64=126     MSB-> 1-> negative sign to final answer for signed integer
//                                                       MSB ->0 -> posotive sign to final answer for signed integer




