import java.util.*;
public class Library
{
    String name;
    int day;
    int price;
    double fine;
    public static void main(String[]args)
    {
       Library obj1=new Library();
       obj1.input();
       obj1.cal();
       obj1.display();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        day=sc.nextInt();
        System.out.println("Enter the price of the book");
        price=sc.nextInt();
    }
    public void cal(){
        if(day<=7)
        {
            fine=day*0.25;
        }
        else if(day>7&&day<=15)
        {
            fine=day*0.40;
        }
        else if(day>15&&day<=30)
        {
            fine=day*0.60;
        }
        else{
            fine=day*0.80;
        }
    }
    public void display()
    {
      System.out.println("The name of the book is"+name+" and the fine is "+fine);
    
    }
}