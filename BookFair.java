import java.util.*;
public class BookFair
{
    public String Bname;
    public double price;
    public void BookFair()
    {
        Bname="";
        price=0;
        
    }
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book");
        Bname=sc.next();
        System.out.println("Enter the price of the book");
        price=sc.nextInt();
    }
    public void calculate()
    {
        if(price<=1000)
        {
            price=price-(2/100*price);
        }
        else if(price>1000&& price<=3000)
        {
            price=price-(10/100*price);
        }
        else 
        {
            price=price-(15/100*price);
        }
    }
    public void display()
    {
        System.out.println("The name of the book is"+ Bname);
        System.out.println("The price of the book after discount is"+price);
    }
    public static void main(String[]args)
    {
        BookFair obj1=new BookFair();
        obj1.display();
        obj1.calculate();
        obj1.Input();
        obj1.BookFair();
    }
}