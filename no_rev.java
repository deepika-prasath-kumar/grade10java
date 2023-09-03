//prod of first and last digit of number stored in paramter
import java.util.*;
public class no_rev
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        prod(a);
    }
    static void prod(int n)
    {
        int n1=0;
        int f=n%10;
        int rev=0;
        while(n!=0)
        {
            n1=n%10;
            rev=(rev*10)+n1;
            n=n/10;
        }
        System.out.println(f+" "+rev+" "+n1);
    }
}