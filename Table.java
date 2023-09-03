import java.util.*;
public class Table
{
    public int num;
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print the mathamatical table of");
        int n=sc.nextInt();
        Table obj1=new Table(n);
       
        obj1.print();
    }
    public Table(int v)
    {
        num=v;
    }
    public void print()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}