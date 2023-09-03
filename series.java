import java.util.*;
public class series
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for series");
        int x=sc.nextInt();
        int sum=0;
        for(int a=2;a<=20;a+=3)
        {
            sum=sum+(x/a);
        }
        System.out.print(sum);
    }
}