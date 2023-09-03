import java.util.*;
public class ducknumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a duck number or not");
        int n=sc.nextInt();
        int n1=0;
        int count=0;
        while(n!=0)
        {
            n1=n%10;
            n=n/10;
            if(n1==0){
              count++;
              break;
            }
        }
        if(count==0)
        {
            System.out.println("The number is not a duck number");
        }
        else{
            System.out.println("The number is a duck number");
        }
    }
}