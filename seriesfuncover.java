import java.util.*;
public class seriesfuncover
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a for postions of strings and b for series");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
                {
                    System.out.println("Enter your string");
                    String a=sc.next();
                    System.out.println("Enter a number to find either even or odd postions of your string");
                    int b=sc.nextInt();
                    manip(a,b);
                    break;
                }
            case 'b':
                {
                    System.out.println("Enter the number you want the series till");
                    int c=sc.nextInt();
                    manip(c);
                    break;
                }
            default:
                {
                    System.out.println("Please enter a valid option");
                }
        }
    }
    static void manip(String s1,int n)
    {
       int l= s1.length();
       for(int i=0;i<l;i++)
       {
           char ch=s1.charAt(i);
           if(n%2==0)
           {
              if(i%2==0)
              {
                  System.out.println(ch);
              }
           }
           else{
               if(i%2!=0)
               {
                   System.out.println(ch);
               }
           }
       }
    }
    static void manip(int n)
    {
        int sum=0;;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                if(i%3==0)
                {
                    sum=sum-(i*i);
                }
                else{
                    sum=sum-i;
                }
            }
            else{
                if(i%3==0)
                {
                    sum=sum+(i*i);
                }
                else{
                    sum=sum+i;
                }
            }
        }
        
    }
}