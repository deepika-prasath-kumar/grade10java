import java.util.*;
public class tennos
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int n=0;
        int sum=0;
        int prod=0;
        for(int i=1;i<=10;i++)
        {
            n=sc.nextInt();
            sum=sum+n;
            prod=prod*n;
        }
        String one=Integer.toString(sum);
        String two=Integer.toString(prod);
        System.out.println(sum+prod);
    }
}