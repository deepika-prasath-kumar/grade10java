import java.util.*;
public class Discount
{
    String name;
    double dc;
    double amt;
    int cost;
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Discount obj1=new Discount();
        obj1.input();
        
        obj1.cal();
        obj1.display();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter the cost of the article");
        cost=sc.nextInt();
        System.out.println("Enter the discount");
        dc=sc.nextDouble();
        
    }
    public void cal()
    {
        if(cost<=5000)
        {
            amt=cost;
        }
        else if(cost>5000 && cost<=10000)
        {
            amt=cost-(10/100.0*cost);
        }
        else if(cost>10000&& cost<=15000)
        {
            amt=cost-(15/100.0*cost);
        }
        else{
            amt=cost-(20/100.0*cost);
        }
    }
    public void display()
    {
        System.out.println("Name of the customer     Discount     Amount to be paid");
        System.out.println(name+"    "+dc+"      "+amt);
    }
}