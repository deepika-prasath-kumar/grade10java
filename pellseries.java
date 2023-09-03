import java.util.*;
public class pellseries
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=1;
        int b=2;
        System.out.print(a+" "+b+" ");
        int c=0;
        for(int i=0;i<13;i++)
        {
            c=(2*b)+a;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}