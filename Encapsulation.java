// class BankAccount{
//     private long accountNumber;
//     private double balance;
//     BankAccount(long  accountNumber,double balance){
//         this.accountNumber=accountNumber;
//         this.balance=balance;
//     }
//     void deposit(double amount){
//         balance+=amount;
//     System.out.println("Deposited amount: " + amount);
//     System.out.println("Balance: " + balance);
//     }
//     void withdraw(double amount){
//         if(amount<=balance){
//             balance=balance-amount;
//             System.out.println("withdrawn amount:"+amount);
//             System.out.println("Balance:"+balance);
//         }
//         else{
//             System.out.println("Insufficient balance");
//         }
        
//     }
//     public double getBalance() {
//         return balance;
//     }
// }



// public class Encapsulation{
//     public static void main(String[] args) {
//         BankAccount b=new BankAccount(23456378,5900000.0);
//     b.deposit(100);
//     b.withdraw(100);
//     System.out.println(b.getBalance());
//     }
    
// }



class Student{
    private String name;
    private int  rollno;
    private int marks;
    
   public void setDetails(String name,int rollno,int marks){
       this.name=name;
       this.rollno=rollno;
       this.marks=marks;
    }
    String getGrade(){
        String grade;
        if(marks>=90){
            grade= "A";
        }
        else if(marks>=80){
              grade="B";
        }
        else if(marks>=70){
           grade="c";
        }
        else if(marks>=50){
            grade="c";
        }
        else{
            grade="Fail";
        }
        return grade;

    }

    String getName(){
        return name;
    }
    
    int getRollNo(){
        return rollno;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
         Student s=new Student();
         s.setDetails("vijay",1,90);
         System.out.println(s.getName());
         System.out.println(s.getRollNo());
         System.out.println(s.getGrade());
    }  
}
