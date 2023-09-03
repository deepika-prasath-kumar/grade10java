import java.util.*;
public class Mobike
{
    public int bno;
    public int phno;
    public String name;
    public int days;
    public int charge;
    public static void main(String[]args)
    {
        Mobike obj1=new Mobike();
        obj1.input();
        obj1.compute();
        obj1.display();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bike number");
        bno=sc.nextInt();
        System.out.println("Enter your phone number");
        phno=sc.nextInt();
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter the number of days to rent bike");
        days=sc.nextInt();
    }
    public void compute()
    {
        if(days<=5)
        {
            charge=days*500;
        }
        else if(days>5 && days<=10)
        {
            charge=(5*500)+((days-5)*400);
        }
        else{
            charge=(5*500)+(5*400)+((days-10)*200);
        }
    }
    public void display()
    {
        System.out.println("Bike no.     Phone No.    Name    No. of days     Charge");
        System.out.println(bno+"   "+phno+"     "+ name+"    "+days+"     "+charge);
    }
}