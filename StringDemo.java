import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
      String s="Python";
      s.concat("Programming");
      System.out.println("1:"+s);      // s prints -> "Python", s.concat does not store anywhere.It belongs to Garbage Collection      
      
      s=s.concat(" Programming");    
      System.out.println("2:"+s);   // s print "Python Programming",here s.concat stored in s ,so creates new object "Python Programming". old object has no reference so goes to Garbage Collection

      String s1=s;   // s1=s(Python Programming)
      s="Java";          // previously s stores Python programming ,now it create new object -> Java
      System.out.println("3"+s);
      System.out.println("4"+s1);
      
     String s2=new String("Java");
     System.out.println("5-equals"+s.equals(s2)); //  prints true both value are same 
     System.out.println("6-> =="+ (s==s2));   // prints false because reference are not same for both 
     System.out.println("7-charAt()"+s2.charAt(0));   // prints J
     System.out.println("8-substring"+s2.substring(3));
     System.out.println("9-substring"+s2.substring(0, 3));

     String trimming="    Hello      ";
     System.out.println("10-trim():"+trimming.trim());
     System.out.println("11-Contains:"+s2.contains("Java"));
     System.out.println("12-startsWith():"+s2.startsWith("J"));
     System.out.println("13-endsWith():"+s1.endsWith("mming"));    
     String s3=new String("JAVA");
     System.out.println("14-equalsIgnoreCase():"+s2.equalsIgnoreCase(s3));    
     String s4="AVAJ";
     System.out.println("15.replace():"+s4.replace("A", "a"));
     System.out.println("16.replaceAll():"+s4.replaceAll(s4,"Java"));  
     String language="Java Python c++";
     String[] arr=language.split(""); // [J, a, v, a,  , P, y, t, h, o, n,  , c, +, +] 
     String[] arr0=language.split(" ");
    
     System.out.println(Arrays.toString(arr));
     System.out.println(Arrays.toString(arr0));

     String languages="JavaProgramming,Python,c++,js";
       String[] arr1=languages.split(",");  // split by comma
        
        System.out.println(Arrays.toString(arr1));
        String splits = "Java123Python456C";
        String[] arr3 = splits.split("\\d+");        // split by digit ,+ referes one or more digits  
        System.out.println(Arrays.toString(arr3));
        String[] arr4=splits.split("[A-Za-z]+");    //"[A-Za-z]  it is split on individual letter   "[A-Za-z]+" group of consecutive letters
        System.out.println(Arrays.toString(arr4));
        System.out.println("indexOf():"+s3.indexOf("a"));
        System.out.println("lastIndexOf():"+s3.lastIndexOf("a"));
        System.out.println(s3.isEmpty());
        int a=10;
        System.out.println("Int to String:"+String.valueOf(a));
        char[] ch=s3.toCharArray();
        System.out.println(Arrays.toString(ch));

        String x=new String("Java");
        String z=x.intern();
        System.out.println("Intern: "+ (x==z));
    }
}





















// | **Regex** | **Meaning**                                    | **Example Input**        | **Code**          | **Output (`String[]`)**     |
// | --------- | ---------------------------------------------- | ------------------------ | ----------------- | --------------------------- |
// | `" "`     | Split by a **single space**                    | `"Java Python"`          | `s.split(" ")`    | `["Java", "Python"]`        |
// | `"\\s+"`  | Split by **one or more whitespace characters** | `"Java    Python   C++"` | `s.split("\\s+")` | `["Java", "Python", "C++"]` |
// | `","`     | Split by a **comma**                           | `"A,B,C"`                | `s.split(",")`    | `["A", "B", "C"]`           |
// | `"-"`     | Split by a **hyphen**                          | `"01-08-2026"`           | `s.split("-")`    | `["01", "08", "2026"]`      |
// | `":"`     | Split by a **colon**                           | `"10:20:30"`             | `s.split(":")`    | `["10", "20", "30"]`        |
// | `"\\d+"`  | Split by **one or more digits**                | `"Java123Python456C"`    | `s.split("\\d+")` | `["Java", "Python", "C"]`   |
