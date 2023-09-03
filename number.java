/*
Design a class to overload a method 'number', as follows, 
void number(int num,int t): to count and display the frequency of a digit in a number 
eg: the number is 2565685 
o/p: frequency of 5, answer is 3.
void number(int n):
to find and display the sum of even digits of a number
eg: 29865
o/p: sum of even digits is 16
write a main method to create an object and invoke the above methods.*/
import java.util.*;
public class number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter the number whose frequency you wish to find");
        int b=sc.nextInt();
        System.out.println("Enter the number whos sum of even digits you want to find");
        int c=sc.nextInt();
        number obj1=new number();
        obj1.number(a,b);
        obj1.number(c);
    }
    public void number(int num, int t)
    {
        int num1=0;
        int count=0;
        while(num!=0)
        {
           num1=num%10;
           num=num/10;
           if(num1==t)
           {
            count++;   
           }
        }
        System.out.println("The frequency of the number is"+count);
    }
    public void number(int n)
    {
        int n1=0;
        int sum=0;
        while(n!=0)
        {
            n1=n%10;
            n=n/10;
            if(n1%2==0)
            {
                sum=sum+n1;
            }
        }
        System.out.println("The sum of even number is"+sum);
    }
}