// StringBuffer is a mutable class in Java used to create and modify strings without creating a new object every time. It is thread-safe because its methods are synchronized.
// capacity of empty Stringbuffer=16
// java check capcity whenever we perform adding an character or String if capacity < length na java internally growth the capacity.
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");  // here capcity is 16+4=20  // length=4
        sb.append(" Programming"); // Java Programming   // 4+12=16  capacity==length .capacity grows whenver we add some char or string
        System.out.println(sb);

        sb.insert(0,"core ");  // insert strats from index 0  core Java Programming  16+5=21
       //  here, if we add string na the capacity < length of string .so capcity internally grow like [new capacity=(old capacity*2)+2]
       // new capacity=20*2+2=42   
        System.out.println(sb);    
        sb.replace(5, 9, "python");   // core python Programming  //21-4+6=23
        System.out.println(sb);

        sb.delete(0, 3);   // 20
        System.out.println(sb);

        sb.deleteCharAt(0);     //19 ->length 
        System.out.println(sb);
        
        sb.reverse();  
        System.out.println(sb); 

        sb.reverse(); // to get an original string ,we use again reverse
        System.out.println(sb);

        sb.charAt(2);
        System.out.println(sb);
        
        sb.setCharAt(0, '"');
        System.out.println(sb);
        sb.setCharAt(7, '"');
         System.out.println(sb);

        System.out.println(sb.length());  // 19
        System.out.println(sb.capacity());   // 42  

        sb.ensureCapacity(50); 
        System.out.println("ensureCapacity()  : " + sb.capacity());

     
        System.out.println("substring(0,4)    : " + sb.substring(0, 4));

        System.out.println("indexOf(\"Program\") : " + sb.indexOf("Program"));

        
        System.out.println("lastIndexOf(\"a\") : " + sb.lastIndexOf("a"));

        String str = sb.toString();
        System.out.println("toString(): " + str);


    }
}





// | StringBuffer                        | StringBuilder                        |
// | ----------------------------------- | ------------------------------------ |
// | Thread-safe                         | Not thread-safe                      |
// | Synchronized methods                | Non-synchronized methods             |
// | Slower                              | Faster                               |
// | Used in multi-threaded applications | Used in single-threaded applications |
// | Introduced in Java 1.0              | Introduced in Java 5                 |
