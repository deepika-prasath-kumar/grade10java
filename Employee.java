import java.util.*;
public class Employee
{
    int pan;
    String name;
    double taxincome;
    double tax;
    public static void main(String[]args)
    {
       Employee obj1=new Employee();
       obj1.input();
       obj1.cal();
       obj1.display();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter your name");
     name=sc.next();
     System.out.println("Enter your pan number");
     pan=sc.nextInt();
     System.out.println("Enter the taxable income");
     taxincome=sc.nextDouble();
     
    }
    public void cal()
    {
     if(taxincome<=250000)
     {
         tax=0;
     }
     else if(taxincome>250000&& taxincome<=500000)
     {
         tax=(10/100.0)*(taxincome-250000);
     }
     else if(taxincome>500000&& taxincome<=1000000)
     {
         tax=(20/100.0)*(taxincome-500000)+30000;
     }
     else{
         tax=30/100.0*(taxincome-1000000)+50000;
     }
    }
    public void display()
    {
        System.out.println(" Pan number       Name      Taxincome         tax");
        System.out.println(pan+"             "+name+"      "+taxincome+"         "+tax);
        
    }
}