import java.util.*;
public class bouncyboolean
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is bouncy or not");
        int number=sc.nextInt();
        Boolean result=isBouncy(number);
        if(result==false)
        {
            System.out.println("the number is a bouncy number");
        }
    }
    public static Boolean isBouncy(Integer n)
    {
        Scanner sc=new Scanner(System.in);
        String number=Integer.toString(n);
        int increase=0;
        int decrease=0;
        for(int i=0;i<number.length()-1;i++)
        {
            char ch=number.charAt(i);
            if(ch>number.charAt(i+1))
            {
                increase++;
            }
            else{
                decrease++;
            }
        }
        if(increase==number.length()-1)
        {
            System.out.println("The number is an decreasing number");
            return(true);
        }
        else if(decrease==number.length()-1)
        {
            System.out.println("The number is a increasing number");
            return(true);
        }
        else{
            return(false);
        }
    }
}