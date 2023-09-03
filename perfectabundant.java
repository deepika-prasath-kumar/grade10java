import java.util.*;
public class perfectabundant
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it perfect, abundant or deficient");
        int n=sc.nextInt();
        int f=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
               f=f+i; 
            }
        }
        if(f==n)
        {
            System.out.println("The number is perfect");
        }
        else if(f>n){
            System.out.println("The number is abundant");
        }
        else if(f<n){
            System.out.println("The number is deficient");
        }
    }
}