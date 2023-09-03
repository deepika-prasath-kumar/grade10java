import java.util.*;
public class Reverse
{
    static long num;
    public static void main(String[]args)
    {
        Reverse obj1=new Reverse();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be reversed");
        num=sc.nextLong();
        obj1.Reverse(num);
        long n=obj1.findReverse();
        System.out.println(n);
    }
    public void Reverse(long n)
    {
        n=0;
    }
    public long findReverse()
    {
        long rev=0;
        long n1=0;
        while(num!=0)
        {
          n1=num%10;
          rev=(rev*10)+n1;
          num=num/10;
        }
        return(rev);
    }
}